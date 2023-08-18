package base_cl;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_1 {

	public static WebDriver driver;

	public static WebDriver Browser_launch(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.manage().window().maximize();
		return driver;

	}

	public static void By_using_send_keys(WebElement path, String value) {
		path.sendKeys(value);

	}

	public static void Click_options(WebElement click) {
		click.click();

	}

	public static void select_1(WebElement value, String value2, String value1) {
		Select x = new Select(value);
		if (value2.equalsIgnoreCase("value")) {
			x.selectByValue(value1);
		} else if (value2.equalsIgnoreCase("visisble")) {
			x.selectByVisibleText(value1);

		} else if (value2.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value1);
			x.selectByIndex(parseInt);
		}

	}

//	public static String z;
//	public static String row;
//
//	public static String Data_driven(int i, int j) throws IOException {
//
//		File a = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber_prj\\Adactin.xlsx");
//		FileInputStream b = new FileInputStream(a);
//		Workbook c = new XSSFWorkbook(b);
//		Sheet sheetAt = c.getSheetAt(0);
//		int ro = sheetAt.getPhysicalNumberOfRows();
//
//		Row row = sheetAt.getRow(i);
//		int column = row.getPhysicalNumberOfCells();
//
//		Cell cell = row.getCell(j);
//
//		CellType cellType = cell.getCellType();
//
//		if (cellType.equals(CellType.STRING)) {
//			String stringCellValue = cell.getStringCellValue();
//			z = stringCellValue;
//
//		} else if (cellType.equals(CellType.NUMERIC)) {
//			double numericCellValue = cell.getNumericCellValue();
//			int u = (int) numericCellValue;
//			String valueOf = String.valueOf(u);
//			z = valueOf;
//
//		}
//
//		return z;
//
//	}
//
//	public static String k1;
//
//	public static String Data_123() throws IOException {
//		File a = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber_prj\\Adactin.xlsx");
//		FileInputStream b = new FileInputStream(a);
//		Workbook c = new XSSFWorkbook(b);
//		Sheet sheetAt = c.getSheetAt(0);
//		int ro = sheetAt.getPhysicalNumberOfRows();
//		for (int i = 0; i < ro; i++) {
//
//			Row row = sheetAt.getRow(i);
//			int column = row.getPhysicalNumberOfCells();
//		
//			for (int j = 0; j < column; j++) {
//
//				Cell cell = row.getCell(j);
//
//				CellType cellType = cell.getCellType();
//
//				if (cellType.equals(CellType.STRING)) {
//
//					k1 = cell.getStringCellValue();
//
//				} else if (cellType.equals(CellType.NUMERIC)) {
//					double numericCellValue = cell.getNumericCellValue();
//					int u = (int) numericCellValue;
//					String valueOf = String.valueOf(u);
//					k1 = valueOf;
//
//				}
//			}
//		}
//		return k1;
//	}

}
