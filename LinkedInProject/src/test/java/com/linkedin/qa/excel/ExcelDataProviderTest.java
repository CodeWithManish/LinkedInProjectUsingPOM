package com.linkedin.qa.excel;

import com.linkedin.qa.base.TestBase;
import com.linkedin.qa.util.ExcelUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProviderTest extends TestBase {
    @BeforeTest
    public void setUpTest() {
        //String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\kmani\\Downloads\\Java\\LinkedInProject\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test(dataProvider = "testData")
    public void test1(String username, String password) throws Exception {

        driver.get("https://www.linkedin.com/");
        driver.findElement(By.id("session_key")).sendKeys(username);
        driver.findElement(By.id("session_password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @DataProvider(name = "testData")
    public  Object[][] getData() {
        String excelPath = "C:\\Users\\kmani\\Downloads\\Java\\LinkedInProject\\excel\\Data1.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }

    public Object[][] testData(String excelPath, String sheetName) {
        ExcelUtil excel = new ExcelUtil(excelPath, sheetName);

        int rowCount = excel.getRowCount();
        int colCount = excel.getColumnCount();

        Object data[][] = new Object[rowCount-1][colCount];

        for(int i=1; i< rowCount; i++) {
            for(int j=0; j<colCount; j++) {

                String cellData = excel.getCellDataString(i, j);
                //System.out.println(cellData + " " );
                data[i-1][j] = cellData;
            }
            //System.out.println();
        }
        return data;
    }
}
