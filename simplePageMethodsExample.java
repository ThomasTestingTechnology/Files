
package simpleWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;

public class simplePageMethods {


	
   int columnCount;
   private WebDriver driver;
   String valueFromTable;
   
    //***Fields that will be required***
	
    @FindBy(css="#dropDown0")
    private WebElement dropDown0;

    @FindBy(css="#dropDown1")
    private WebElement dropDown1;

    @FindBy(css="#dropDown2")
    private WebElement dropDown2;

    @FindBy(css="#dropDown3")
    private WebElement dropDown3;

    @FindBy(css="#dropDown4")
    private WebElement dropDown4;

    @FindBy(css="select")
    private List<WebElement> drops; 

    @FindBy(css="#select0")
    private WebElement select0;

    @FindBy(css="#select1")
    private WebElement select1;

    @FindBy(css="#select2")
    private WebElement select2;

    @FindBy(css="#select3")
    private WebElement select3;

    @FindBy(css="#select4")
    private WebElement select4;

    @FindBy(css="#table1")
    private WebElement table1;

    @FindBy(css="#labelFormField0")
    private WebElement formField0;

    @FindBy(css="#input0")
    private WebElement input0;

    @FindBy(css="#labelFormField1")
    private WebElement formField1;

    @FindBy(css="#input1")
    private WebElement input1;

    @FindBy(css="#labelFormField2")
    private WebElement formField2;

    @FindBy(css="#input2")
    private WebElement input2;

    @FindBy(css="#labelFormField3")
    private WebElement formField3;

    @FindBy(css="#input3")
    private WebElement input3;

    @FindBy(css="body")
    private WebElement body; 

    @FindBy(css="#button1")
    private WebElement button1; 

    @FindBy(css="#para0")
    private WebElement para0;

    @FindBy(css="#para1")
    private WebElement para1;

    @FindBy(css="#para2")
    private WebElement para2;

    @FindBy(css="#para3")
    private WebElement para3;

    public simplePageMethods(WebDriver instanceDriver){  	
    	this.driver = instanceDriver;
    	PageFactory.initElements(driver, this);  //(init elements takes arguments driver, page)
    	    }
    
    
    //***create a new instance of the controls class .....***
    
    simplePageControls methodActing = new simplePageControls();
    
    //***methods which can be used by the test class:***

    public int numberOfRows(){    	
    	return methodActing.tableRowNumber(table1);       	
    }

    
    public String cellContent(int columnPosition, int rowPosition){
    	return methodActing.tableData(columnPosition, rowPosition, table1);
    }
    	
    public String headContent(int columnPosition2) {
		return methodActing.tableHeadingvalue(columnPosition2, table1);
    }
    	
      
    public int headerCount(){
    	return methodActing.tableHeadingSize(table1);
    }
    
    public int columnCount(int rowID) {
    	return methodActing.tableColumnNumber(table1,rowID);
    }
    
    //For the dropdown - there are two variables: 
    
    
    public void pushTheButton() {
    	methodActing.clicker(button1);
    }
    
    public int dropsValue () {
	return methodActing.dropsMethod(drops);
	}
	
    public void dropdown(String stringValue, WebElement value) {
	methodActing.selectDropdown(stringValue, value);
	       }

    public String titleUsed() {
    	return driver.getTitle();
    	
    }
    
    public int getHeadingSize() {
    	return methodActing.tableHeadingSize (table1);
    	
    }
    
    
    public String backGround() {
    	return methodActing.bakColour(body);
    }

    public void dropdown0(String stringValue) {
        methodActing.selectDropdown(stringValue, select0);
       }

    public void dropdown1(String stringValue) {
        methodActing.selectDropdown(stringValue, select1);
       }

    public void dropdown2(String stringValue) {
        methodActing.selectDropdown(stringValue, select2);
       }

    public void dropdown3(String stringValue) {
        methodActing.selectDropdown(stringValue, select3);
       }

    public void dropdown4(String stringValue) {
        methodActing.selectDropdown(stringValue, select4);
       }

    public String dropped0() {
	    return methodActing.chosen(select0);
	    }

    public String dropped1() {
	    return methodActing.chosen(select1);
	    }

    public String dropped2() {
	    return methodActing.chosen(select2);
	    }

    public String dropped3() {
	    return methodActing.chosen(select3);
	    }

    public String dropped4() {
	    return methodActing.chosen(select4);
	    }

    public String formField0(){
        return methodActing.textValue(formField0);
    }

    public String formField1(){
        return methodActing.textValue(formField1);
    }

    public String formField2(){
        return methodActing.textValue(formField2);
    }

    public String attributeText0(){
        return methodActing.attributeValue(input0);
    }

    public String attributeText1(){
        return methodActing.attributeValue(input1);
    }

    public String attributeText2(){
        return methodActing.attributeValue(input2);
    }

    public void sendText0(String inputString){
        methodActing.keySender(input0,inputString);
    }

    public void sendText1(String inputString){
        methodActing.keySender(input1,inputString);
    }

    public void sendText2(String inputString){
        methodActing.keySender(input2,inputString);
    }

    public String paraText0(){
        return methodActing.textValue(para0);
    }

    public String paraText1(){
        return methodActing.textValue(para1);
    }

    public String paraText2(){
        return methodActing.textValue(para2);
    }
}