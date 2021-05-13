
package simpleWebsite;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleTest {

    @Test
    public void test() {


    String unique = "930504900";

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();	

    driver.get("C:\\Users\\Probook6570b\\Desktop\\js"+unique+".html");

    simpleWebsite.simplePageMethods myTools = new simpleWebsite.simplePageMethods(driver);


    System.out.println("How many header values are there: " + myTools.headerCount()); 


    System.out.println("How many rows are there? " + myTools.numberOfRows()); //use existing method

    System.out.println("The number of entered rows = 3");
    System.out.println("What does the title say? " + myTools.titleUsed());

    System.out.println("What is the background colour? " + myTools.backGround());

    int dDTCount;
    int iTerate;
    int dropDowns;
    myTools.pushTheButton();



    String accumulationTwo_0 ="Chippenham,SestriLevante,Boeing737";

    String accumulationTwo_1 ="Cheltenham,Stroud,ThamesTurbo(Train)";

    String accumulationTwo_2 ="England,Sri Lanka,Balloon";

    int ta;
    int cellTracker;
    String[] tempRow;

    tempRow = accumulationTwo_0.split(",");
    for (cellTracker = 0; cellTracker<tempRow.length; cellTracker++){
        assertEquals(tempRow[cellTracker],myTools.cellContent(cellTracker,0+1));
    }
    tempRow = accumulationTwo_1.split(",");
    for (cellTracker = 0; cellTracker<tempRow.length; cellTracker++){
        assertEquals(tempRow[cellTracker],myTools.cellContent(cellTracker,1+1));
    }
    tempRow = accumulationTwo_2.split(",");
    for (cellTracker = 0; cellTracker<tempRow.length; cellTracker++){
        assertEquals(tempRow[cellTracker],myTools.cellContent(cellTracker,2+1));
    }

    String accumulation_0 = "Pig,Goat,Cow,Sheep";
    String[] accumulation_0Array = accumulation_0.split(",");

    String accumulation_1 = "Train,Bus,Plane,Boat";
    String[] accumulation_1Array = accumulation_1.split(",");

    String accumulation_2 = "Bird,Cat,Dog,Fish";
    String[] accumulation_2Array = accumulation_2.split(",");

    String accumulation_3 = "Planet,Moon,Star,SolarSystem";
    String[] accumulation_3Array = accumulation_3.split(",");

    int dr;

    for (dr = 0; dr < accumulation_0Array.length; dr++) {

        myTools.dropdown0(accumulation_0Array[dr]);

        myTools.dropped0();

        assertEquals(myTools.dropped0(),accumulation_0Array[dr]);
    }

    for (dr = 0; dr < accumulation_1Array.length; dr++) {

        myTools.dropdown1(accumulation_1Array[dr]);

        myTools.dropped1();

        assertEquals(myTools.dropped1(),accumulation_1Array[dr]);
    }

    for (dr = 0; dr < accumulation_2Array.length; dr++) {

        myTools.dropdown2(accumulation_2Array[dr]);

        myTools.dropped2();

        assertEquals(myTools.dropped2(),accumulation_2Array[dr]);
    }

    for (dr = 0; dr < accumulation_3Array.length; dr++) {
    	
    	
    	myTools.dropdown3(accumulation_3Array[dr]);	
    	

        myTools.dropped3();

        assertEquals(myTools.dropped3(),accumulation_3Array[dr]);
    }

    assertEquals(myTools.formField0(),"emailAddress:");

    assertEquals(myTools.attributeText0(),"");

    assertEquals(myTools.formField1(),"phone:");

    assertEquals(myTools.attributeText1(),"");

    assertEquals(myTools.formField2(),"National Insurance:");

    assertEquals(myTools.attributeText2(),"");

    assertEquals(myTools.paraText0(),"Please Enter required detail below");

    assertEquals(myTools.paraText1(),"When you have finished, please press submit");

    assertEquals(myTools.paraText2(),"Your application will be processed");

    myTools.sendText0("Test");

    assertEquals(myTools.attributeText0(),"Test");

    myTools.sendText1("Test");

    assertEquals(myTools.attributeText1(),"Test");

    myTools.sendText2("Test");

    assertEquals(myTools.attributeText2(),"Test");

    myTools.pushTheButton();

    assertEquals(myTools.attributeText0(),"");

    assertEquals(myTools.attributeText1(),"");

    assertEquals(myTools.attributeText2(),"");

    driver.close();
    }
}