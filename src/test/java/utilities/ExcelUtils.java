package utilities;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;

public class ExcelUtils {

	/**
	 * This method is to read Excel file having format .xls
	 * 
	 * @param fileLocation
	 * @param file
	 * @param sheetName
	 * @param columnNoToRead
	 * @return
	 * @throws IOException
	 */
	public static List<String> readFromExcel(String fileLocation, String file, String sheetName, int columnNoToRead)
			throws IOException {

		file = fileLocation + "/" + file;
		System.out.println("Excel File with Path to Read Data: " + file + "\r\n");
		XSSFWorkbook myExcelBook = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet myExcelSheet = myExcelBook.getSheet(sheetName);

		List<String> columnUserNameList = new ArrayList<>();
		int cellNo = columnNoToRead;

		int rowNum = myExcelSheet.getLastRowNum();
		for (int i = 1; i <= rowNum; i++) {
			XSSFRow roww = myExcelSheet.getRow(i);
			if (roww.getCell(cellNo).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				String name = roww.getCell(cellNo).getStringCellValue();
				columnUserNameList.add(name);
				if (!(i == 1)) {
					System.out.println("Value: " + (i - 1) + ")" + name + "\n");
				}
			}
		}
		myExcelBook.close();
		return columnUserNameList;
	}

	/**
	 * This method is used to read downloaded .csv file and compare UI data with
	 * exported excel
	 * 
	 * @param file
	 *            - is file location with file name to read file
	 * @param uiData
	 *            - this is an first column 2nd row data to compare.
	 * @return true if the UIdata matched with exported data else return false.
	 */
	public static boolean readDataLineByLine(String file, String uiData) {

		try {
			FileReader filereader = new FileReader(file);
			@SuppressWarnings("resource")
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;
			String excelData = "";
			int i = 1;

			while ((nextRecord = csvReader.readNext()) != null) {

				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
					if (i == 3) {
						excelData = cell;
					}
					i++;
					break;
				}
				System.out.println();
			}
			if (uiData.equals(excelData)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
}