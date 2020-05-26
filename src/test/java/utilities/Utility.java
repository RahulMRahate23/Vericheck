package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Utility {
	public static Session mailSession;
	public URI jiraServerUri;
	private static Calendar cal=Calendar.getInstance();;
	private static SimpleDateFormat simpleDateFormat;
	private static final String DATE_FORMAT_NOW = "MM-dd-yy";
	private static final String TIME_FORMAT_NOW = "HH:mm a";

	public static HashMap<String, String> compareStringsIntoDictionary(String actual, String expected,
			HashMap<String, String> result) {
		if (!actual.equals(expected))
			result.put(actual, expected);
		return result;
	}
	
	public static String getBrowserName(){
		if(System.getProperties().containsKey("webdriver.ie.driver")) {
			return "ie";
		}
		else {
			return "chrome";
		}	
	}

	public static String mapToString(HashMap<String, String> hashMap) {
		String result = null;
		for (String key : hashMap.keySet()) {
			result += String.join(": ", key, hashMap.get(key), "\\\\n");
		}
		return result;
	}

	/**
	 * @Description - This method returns random number .
	 */
	public static int getRandomNumber(int size){
		Random rand = new Random();
		if (size==0){
			return 0;
		}else
			return rand.nextInt(size);
	}
	/**
	 *
	 * @param str
	 * @return Float
	 */
	public static Float convertPriceStrToFloat(String str){

		if(str.contains("$")) {
			str = str.split("\\\\\\\\$")[1];
		}
		Float price=Float.valueOf(0);
		try{
			price = Float.valueOf(str);
		} catch(NumberFormatException ex){
			DecimalFormat decimalFormat = new DecimalFormat();
			Number number = null;
			try{
				number = decimalFormat.parse(str);
			} catch(ParseException ex2){
			}
			if(number != null)
				price = number.floatValue();
		}
		return price;
	}

	/**
	 * @Description - This method returns parse Currency .
	 */
	public static double parseCurrency(String currency) throws Exception{
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		return cf.parse(currency).doubleValue();
	}

	/**
	 * @Description - This method finds specified pattern in the string.
	 * @param - patternToCompile = pattern to search in the string
	 * @param - stringToFind match = the string in which to find this pattern.
	 */
	public static Matcher matchPattern(String patternToCompile,String stringToFindMatch){
		Pattern pattern= Pattern.compile(patternToCompile);
		return pattern.matcher(stringToFindMatch);
	}

	/**
	 * @Description - This method format the date in user defined format.
	 * @param - inputDate - should be always in 'MM/dd/yyyy'
	 * @param - dateFormate - should be expected date format.
	 */
	public String formatDate(String inputDate, String dateFormat) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date d = sdf.parse(inputDate);
		sdf.applyPattern(dateFormat);
		return sdf.format(d);
	}

	/**
	 *  @Description -generate random email ids
	 */
	public static String generateEmail() {
		String alphabet = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		String randomEmail = new String();
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			randomEmail = randomEmail+ alphabet.charAt(r.nextInt(alphabet.length()));
		randomEmail = randomEmail + "@mailinator.com";
		return randomEmail;
	}

	public static double modifyPrice(double actualPrice, double money, String action){
		double modifiedPrice = 0;
		if (action == "add"){
			modifiedPrice = actualPrice + money;
		}else if(action == "minus"){
			modifiedPrice = actualPrice - money;
		}
		//
		//...else if (action == "multiply")

		return modifiedPrice ;
	}

	/*
	 * This method will decode any UTF8 encoded URL
	 * @param linkUrl
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String decodeURL(String linkUrl) throws UnsupportedEncodingException {
		return java.net.URLDecoder.decode(linkUrl, "UTF-8");
	}

	/*
	 * Method return file extension.
	 * */
	public static String getFileExtension(File file) {
		String fileName = file.getName();
		if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		else return "";
	}

	/**
	 * @Description - Get connection to JIRA
	 */
	public void getJIRAIssueClient() throws URISyntaxException{
		jiraServerUri = new URI(PropertyDictionary.map.get("JIRA_URL"));
	}

	/**
	 * @Description - Get coonection to JIRA
	 */
	public HashMap<String,String> getOpenIssues(List<String> linkedIssues) throws URISyntaxException{
		String bug=null;
		HashMap<String, String> openIssues=new HashMap<String,String>();
		if(linkedIssues.size()>0){
			for(int i=0;i<linkedIssues.size();i++){
				bug=linkedIssues.get(i).toString().trim();
				//String bugStatus=issueClient.getIssue(linkedIssues.get(i),pm).getStatus().getName();
			}
		}
		return openIssues;
	}

	/**
	 * @Description- get current Date
	 */
	public static String getCurrentDate(){
		simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_NOW);
		return simpleDateFormat.format(cal.getTime());
	}

	/**
	 * @Description- get current Time
	 */
	public static String getCurrentTime(){
		simpleDateFormat = new SimpleDateFormat(TIME_FORMAT_NOW);
		return simpleDateFormat.format(cal.getTime());
	}
	
	/**
	 * @Description- get current Time with seconds
	 */
	public static String getCurrentTimeWithSeconds(){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		
		return date;
	}
	
	public static long getTimeDiffInSeconds(long start){
		long end = System.currentTimeMillis();
		long diff = ((end - start) / 1000);
		return diff;
	}

	public static String formatDBDate(String dBDate) throws ParseException{
		dBDate = dBDate.replaceAll("00:00:00.0", "").replace(" ", "");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(dBDate);
		SimpleDateFormat format2 = new SimpleDateFormat("M/d/yy");  
		return format2.format(date);
	}

	public static String extractTextUsingRegEx(String stringPattern, String searchText){
		Pattern pattern = Pattern.compile(stringPattern);
		Matcher matcher = pattern.matcher(searchText);
		if (matcher.find()){
			return matcher.group(1);
		} else{
			return "NOT FOUND";
		}
	}

	public static String convertToHtmlFormat(String valueToCovert){		
		return StringEscapeUtils.unescapeHtml4(valueToCovert).trim();
	}

	public static String DBDateformat(String dBDate,String dateformat) throws ParseException{
		dBDate = dBDate.split(" ")[0];
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = format.parse(dBDate);
		SimpleDateFormat format2 = new SimpleDateFormat(dateformat);
		return format2.format(date);
	}

	public static String generateRandomEmailAddress(String emailAddress,String emailDomain) {
		String getAppName = null;
		if(emailAddress != null && emailAddress.equalsIgnoreCase("QAAutomation"))
			getAppName=emailAddress;
		else if(!emailDomain.contains("gmail"))
			getAppName = PropertyDictionary.map.get("default.siteName");
		else
			getAppName=PropertyDictionary.map.get("SERVICE-EMAIL_USERNAME")+"+";
		return  getAppName+ System.currentTimeMillis() + "@" + emailDomain ;
	}

	/**
	 * @Description - This method returns last 4 characters of String .
	 */
	public static String getLastFourCharactersOfString(String value){
		return value.trim().substring(value.length() - 4);
	}

	/**
	 *@Description This method will get the size of image from the image url
	 * @param imageUrl
	 * @return
	 * @throws IOException
	 */
	public static int getImageHeight(String imageUrl) throws IOException {
		InputStream url = new URL(imageUrl).openStream();
		try(ImageInputStream in = ImageIO.createImageInputStream(url)){
			final Iterator<ImageReader> readers = ImageIO.getImageReaders(in);
			if (readers.hasNext()) {
				ImageReader reader = readers.next();
				try {
					reader.setInput(in);
					return reader.getHeight(0);
				} finally {
					reader.dispose();
				}
			}
		}
		return 0;
	}

	/**
	 * @Description This method will remove px from text and return as float
	 * @param text
	 * @return
	 */
	public static float removePX(String text ) {
		return Float.parseFloat(text.replaceAll("px", ""));
	}

	public static List<String> convertListOfOjectToListOfString(List<Object> collection){
		List<String> stringCollection = new ArrayList<String>();
		for (Object object : collection) {
			stringCollection.add(object.toString());
		}
		return stringCollection;
	}

	public static Map<String, Integer> addSkuAndQuantityInMap(List<Object> skuList, int quantity){
		Map<String, Integer> mapOfItems = new LinkedHashMap<String, Integer>();
		for(int i = 0 ; i < skuList.size() ; i++)
			mapOfItems.put(skuList.get(i).toString(), quantity);
		return mapOfItems;
	}

	public static Float roundOffValueToTwoDigits(Float value){
		return Float.parseFloat(new DecimalFormat("###.##").format(value));
	}

	public static Float valueToTwoDigitsWithoutRound(Float value){
		value = ((float) ((int) (Float.parseFloat(new DecimalFormat("###.##").format(value * 100)))))/100;
		return value;
	}

	public static String generateRandomString(String text) {
		return text + System.currentTimeMillis();
	}

	/**
	 *  @Description -generate random String
	 */
	public static String generateRandomString() {
		String getAppName = null;
		getAppName = PropertyDictionary.map.get("default.siteName");
		return  getAppName+ System.currentTimeMillis() ;
	}

	public static int getItemTextPosition(String itemText, List<WebElement> elements){

		for (int x = 0; x < elements.size(); x++){
			if (elements.get(x).getText().contains(itemText)){
				return x + 1;
			}
		}

		return 0;
	}

	public static String normalizeSpace(String text){
		return "";
	}
	
	public static String capture(ITestResult result, WebDriver driver) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
		File Dest = new File(System.getProperty("user.dir")+ "//screenshots//" +result.getName() 
				+timestamp.format(cal.getTime())+ ".png");
		String errflpath = Dest.getAbsolutePath().replace("file:///", "");
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}

	public static void SendMail() throws IOException{
		// Create object of Property file
		Properties props = new Properties();
		// this will set host of server- you can change based on your requirement 
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "25");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("silicusqa@gmail.com", "Silicus@123");
			}
		});
		try {
			// Create object of MimeMessage class
			Message message = new MimeMessage(session);
			// Set the from address
			message.setFrom(new InternetAddress("silicusqa@gmail.com"));
			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("Dilip.Sant@silicus.com"));
			//message.setRecipients(Message.RecipientType.CC,InternetAddress.parse(""));
			// Add the subject link
			message.setSubject("Talix Automation Test Results!!!");
			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();
			// Set the body of email
			messageBodyPart1.setText("Hello," + "\n\n" + "PFA of test results." + "\n\n" + 
					"*****This is auto generated mail, Please do not reply*****");
			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			//String filename = "C:\\Users\\spuranik\\git\\Selenium-Automation-framework_TalixPOC\\test-output\\ExtentReport.html";
			String filename = System.getProperty("user.dir") + "\\test-output\\ExtentReport.html";
			System.out.println(filename);
			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);
			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
			// set the file
			messageBodyPart2.setFileName(filename);
			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();
			// add body part 1
			multipart.addBodyPart(messageBodyPart2);
			// add body part 2
			multipart.addBodyPart(messageBodyPart1);
			// set the content
			message.setContent(multipart);
			// finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (Exception e) {
			//throw new RuntimeException(e);
			System.err.println("Error is : " + e.getMessage());
			e.printStackTrace();
		}
	}

	//--------------
	static Properties mailServerProperties;
	static Session getMailSession;
	static MimeMessage generateMailMessage;

	public static void sendUpdatedEmail() throws AddressException, MessagingException{

		// Step1
		System.out.println("\n 1st ===> setup Mail Server Properties..");
		mailServerProperties = System.getProperties();
		mailServerProperties.put("mail.smtp.port", "587");
		mailServerProperties.put("mail.smtp.auth", "true");
		mailServerProperties.put("mail.smtp.starttls.enable", "true");
		System.out.println("Mail Server Properties have been setup successfully..");

		// Step2
		System.out.println("\n\n 2nd ===> get Mail Session..");
		getMailSession = Session.getDefaultInstance(mailServerProperties, null);
		generateMailMessage = new MimeMessage(getMailSession);
		generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("Shrihari.Puranik@silicus.com"));
		//generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("test2@crunchify.com"));
		generateMailMessage.setSubject("Greetings from Crunchify..");
		String emailBody = "Test email by Silicus.com JavaMail API example. " + "<br><br> Regards, <br>Shrihari-QA";
		generateMailMessage.setContent(emailBody, "text/html");
		System.out.println("Mail Session has been created successfully..");
		
		// Step3
		System.out.println("\n\n 3rd ===> Get Session and Send mail");
		Transport transport = getMailSession.getTransport("smtp");

		// Enter your correct gmail UserID and Password
		// if you have 2FA enabled then provide App Specific Password
		transport.connect("smtp.gmail.com", "silicusqa@gmail.com", "Silcus@123");
		transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());
		transport.close();
	}

	public void sendEmailNEw() {
        // Defines the E-Mail information.
        String from = "silicusqa@gmail.com";
        String to = "Shrihari.Puranik@silicus.com";
        String subject = "Important Message";
        String bodyText = "This is a important message with attachment.";

        // The attachment file name.
        String attachmentName = "D:/Selenium-Automation-framework/10012019_talix/Selenium-Automation-framework_TalixPOC/test-output/ExtentReport.html";

        // Creates a Session with the following properties.
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.port", "587");
        Session session = Session.getDefaultInstance(props);

        try {
            InternetAddress fromAddress = new InternetAddress(from);
            InternetAddress toAddress = new InternetAddress(to);

            // Create an Internet mail msg.
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(fromAddress);
            msg.setRecipient(Message.RecipientType.TO, toAddress);
            msg.setSubject(subject);
            msg.setSentDate(new Date());

            // Set the email msg text.
            MimeBodyPart messagePart = new MimeBodyPart();
            messagePart.setText(bodyText);

            // Set the email attachment file
            FileDataSource fileDataSource = new FileDataSource(attachmentName);

            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.setDataHandler(new DataHandler(fileDataSource));
            attachmentPart.setFileName(fileDataSource.getName());

            // Create Multipart E-Mail.
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messagePart);
            multipart.addBodyPart(attachmentPart);

            msg.setContent(multipart);

            // Send the msg. Don't forget to set the username and password
            // to authenticate to the mail server.
            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

}

