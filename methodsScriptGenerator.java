

package scanners;

//import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.regex.Pattern;


public class Auto2021_AImprovedSimple6 {
	
	public static void main(String[] args) throws IOException {
		String indent4 = "    ";
		String indent8 = "        ";
		

		//**************************************************************************
		//********************ENTER THE REQUIRED PAGE DETAILS***********************
		//**************************************************************************

		//****************Multiple Drop Downs - gathering the information needed********************			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter how many drop downs are required ");
		int dropDowns = Integer.parseInt(reader.readLine());
		int dDownCount;
		int trakMan = 1;
		System.out.println("You have requested " + dropDowns + " drop downs");
		String[] accumulation = new String[dropDowns];
		for (dDownCount = 0; dDownCount < dropDowns; dDownCount++) {
			System.out.print("Please enter the contents of the drop down  " + trakMan + " sepparated by commas  ");
			String oneLiner = reader.readLine();
			System.out.println("Your input is: " + oneLiner);
			accumulation[dDownCount]=oneLiner;
			trakMan++;
		}

		
		//**********************Enter table Heading************************
		System.out.println("Please enter the headers separated by commas. Click return if no table required");
		String headers = reader.readLine();

		System.out.println("Here are the headers " + headers);
		String[] headerString = headers.split(",");
		int headerLength = headerString.length;


		//********************** Enter table rows ***************************		
		System.out.println("Please enter how many tableLines required (Enter 0 if no table required)");
		int rowNum = Integer.parseInt(reader.readLine());
		int dDownCount3;
		int trakMan3 = 1;
		System.out.println("You have requested " + rowNum + " table rows");
		String[] accumulationTwo = new String[rowNum];
		String rowValue = String.valueOf(rowNum);
		System.setProperty("Number_of_Rows", rowValue);
		for (dDownCount3 = 0; dDownCount3 < rowNum; dDownCount3++) {				
			System.out.print("Please enter the contents of line  " + trakMan3 + " sepparated by commas  ");			 
			String oneLiner2 = reader.readLine();
			System.out.println("Your input is: " + oneLiner2);
			accumulationTwo[dDownCount3]=oneLiner2;
			trakMan3++;
		}			

		//********************** Enter Form****************	
		System.out.println("Please enter how many form fields are requried for the page. Enter 0 if none required");
		int fieldNumber = Integer.parseInt(reader.readLine());
		System.out.println("You require " + fieldNumber + " fields");
		System.out.println("Please enter the Form fields for the page");
		int fieldCount;  
		int trakMan4 = 1;
		System.out.println("You have requested " + fieldNumber + " form fields");
		//String[] accumulationThree = new String[rowNum];
		String[] accumulationThree = new String[fieldNumber];
		for (fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {				
			System.out.print("Please enter the contents of line  " + trakMan4 );			 
			String oneLiner3 = reader.readLine();
			System.out.println("Your input is: " + oneLiner3);
			accumulationThree[fieldCount]=oneLiner3;
			trakMan4++;
		}	
		
		//********************** Entering details cont'd: Enter Paragraph values ****************
		System.out.println("Please enter sentances sepparted by \">\" symbols. Click return if no paragraphs required");
		String paras = reader.readLine();
		System.out.println("Here are the paragraphs " + paras);

		//***************************************************************************************************************
		//*************************STRING PREPARATION - TAKING WHAT IS ENTERED AND COMPILING PARTS FOR HTML**************
		//***************************************************************************************************************

		//****strings for the html page*****
		String startOff;
		startOff = 
			"\n<!HTML = <!Document html>\r\n" + 
			"<html>\r\n" + 
			"<head>\r\n" + 
			"<style>\r\n" +

			".main_header{"+
			"  text-align: center;"+
			"  font-family: Arial, Helvetica, sans-serif;"+
			"}"+"\r\n"+

			".styleOne {"+
			"  text-decoration: none;"+
			"  text-align: center;"+
			"  font-family: \"Times New Roman\", Times, serif;"+
			"  font-size: 27px;"+
			"}"+"\r\n"+

			"body{"+
			"  background-color: EFEF9F;"+
			"}"+"\r\n"+

			"img {"+
			"  display: block;"+
			"  margin-left: auto;"+
			"  margin-right: auto;"+
			"  width: auto;"+
			"}"+"\r\n"+

			".styleTwo {"+
			"  display: block;"+
			"  margin-left: auto;"+
			"  margin-right: auto;"+
			"  width: auto;"+
			"}"+"\r\n"+

			".formstyle{\r\n" + 
			"  text-align: center;\r\n" + 
			"  margin-left: auto;\r\n" + 
			"  margin-right: auto;\r\n" + 
			"  width: auto;\r\n" + 
			"  font-family: \"Times New Roman\", Times, serif;\r\n" + 
			"}"+
			
			".styleThree {"+
			"  display: block;"+
			"  text-decoration: none;"+
			"  text-align: center;"+
			"  margin-left: auto;"+
			"  margin-right: auto;"+
			"  width: auto;"+
			"  font-family: \"Times New Roman\", Times, serif;"+
			"}" +"\r\n"+  

			"span::before {content: \'\\A\'; white-space: pre;}" + "\r\n" +

			"th {\r\n" + 
			"  height: 35px;\r\n" + 
			"}\r\n" + 

			".selector {\r\n" + 
			"  display: block;\r\n" + 
			"  margin-left: auto;\r\n" + 
			"  margin-right: auto;\r\n" + 
			"  width: 20%;\r\n" + 
			"}"+"\r\n"+

			"table {\r\n" + 
			"  border-collapse: collapse;\r\n" + 
			"  margin-left: auto;\r\n" + 
			"  margin-right: auto;\r\n" + 
			"  width: 30%;\r\n" + 
			"}"+

			"</style>"+"\r\n"+
			"<title class = \"styleOne\">"+"Simple WebPage"+"</title>"+

			"<body>"+"\r\n"+
			"<span></span>"+
			"  <h1 class=\"styleOne\">"+"Very Simple html Page"+"</h1>"+
			"<span></span>";

		//String preparation - HTML cont'd
		//The table elements

		String initTable = "<table style = \"table\" id = \"table1\" style = \"width:60%\" border = \"Thick\">";

		int tC;
		int xAxis;
		String addString = null;
		String tableString = "<tr>\r\n";
		//need to add the headings into the table:
		String[] headVals = headers.split(",");
		int headLen = headVals.length;
		for (int hCount = 0;  hCount<headLen; hCount++) {
			tableString = tableString + "<th>"+headVals[hCount]+"</th>";
		}
		tableString = tableString + "</tr>\r\n<tr>";
		for (tC = 0; tC <rowNum; tC++  ) {
			String[] myLine  = accumulationTwo[tC].split(",");
			for (xAxis = 0; xAxis < myLine.length; xAxis++) {
				addString = "<td>"+myLine[xAxis]+"</td>\r\n";
				tableString = tableString+addString;
			}
			tableString = tableString+"</tr>\r\n";
		}
		tableString = tableString+"\r\n";

		String finiTable = "</table>";

		//String preparation - HTML cont'd
		//Need to write out the dropdowns

		int dC;
		int nextVal;
		String addValue = null;
		String dropString = "<span>\r\n</span>\r\n";

		for (dC =0; dC < dropDowns; dC++) {        //counting through the drop-downs
			System.out.println("preparing dropdown "+dC);
			String[] dLine  = accumulation[dC].split(",");
			dropString = dropString + "<select  id = \"select"+dC+"\" class = \"styleThree\" onchange = \"selected_Array()\">\\r\\n";
			for (nextVal = 0; nextVal < dLine.length; nextVal++) {
				addValue = "<option>"+dLine[nextVal]+"</option>\r\n";  //have changed addString to addValue

				dropString = dropString+addValue;
			}
			dropString = dropString+"</select>\r\n<span>\r\n</span>";
			System.out.println("dropSting currently = "+dropString);
		}

		//String preparation - HTML cont'd
		//need to write out the paragraphs
			
		int pC;
		int nextVal2;
		String addValue2 = null;
		String paraString = "\r\n";
		//String paraString = "";
		String[] dLine  = paras.split(">");
		int paraNumber = dLine.length;
		for (pC =0; pC < paraNumber; pC++) {
			//String[] dLine  = paras[pC].split(",");
			//paraString = paraString+"<p id=para"+pC+">"+dLine[pC]+"</p>";
			paraString = paraString+"<p id=\"para"+pC+"\" class = \"formstyle\">";
			paraString = paraString+dLine[pC]+"<class = \"formstyle\" /p>";
		}

		paraString = paraString+"\r\n";
		//paraString = paraString+"";

		//String preparation - for the form:

		String formInit = "<form>\r\n" + 
				"<span></span>\r\n" + 
				"	<div class = \"formstyle\"> \r\n" + 
				"		<form  method=\"post\" id = \"form1\">";


		String formBodypart = "";
		for (int fC = 0; fC<fieldNumber; fC++) {
			formBodypart = formBodypart + "<label id = \"labelFormField"+fC+"\">"+accumulationThree[fC]+":</label>\r\n" + 
					"		<span></span>\r\n" + 
					"		<input id=\"input"+fC+"\" class = \"formstyle\" type=\"text\" name=\"name\"><br>";
		}

		String formFinal = "		<span></span>\r\n" + 
				"		<input id = \"button1\" type=\"submit\">\r\n" + 
				"\r\n" + 
				"		</form>\r\n" + 
				"	</div>";



		String signOff;
		signOff = "\n\r\n" +
				"</body>"+
				"</style>\r\n" + 
				"</head>\r\n" +
				"</html> " ;


		//*************************************************************************************************************
		//*************************STRING PREPARATION - TAKING WHAT IS ENTERED AND COMPILING PARTS FOR JAVA POM*********
		//***************************************************************************************************************


		String pomStart = "package simpleWebsite;\r\n" +    //if you say String x = "" and past between the "" ... Eclipse does rest
				"\r\n" + 
				"import org.openqa.selenium.By;\r\n"+
				"import org.openqa.selenium.WebDriver;\r\n" + 
				"import org.openqa.selenium.WebElement;\r\n" + 
				"import org.openqa.selenium.support.FindBy;\r\n" + 
				"import org.openqa.selenium.support.PageFactory;\r\n" + 
				"import java.util.*;\r\n"+
				"\r\n" + 
				"public class simplePageMethods {\r\n" + 
				"\r\n" + 
				"\r\n" + 
				 
				"	\r\n" + 
				
				"   int columnCount;\r\n" + 
				"   private WebDriver driver;\r\n"+
				"   String valueFromTable;\r\n" + 
				"   \r\n"+
				"    //***Fields that will be required***\r\n" + 
				"	";

		//******************The FindBy drop down method calls for the POM have the following format**************
		//For the drop-downs
		String dropDnFindBy = "";
		int dDFBCount;
		for (dDFBCount = 0; dDFBCount <= dropDowns ; dDFBCount++) {
			dropDnFindBy = dropDnFindBy+"\r\n"+indent4+"@FindBy(css=\"#dropDown"+dDFBCount+"\")\r\n" + indent4+"private WebElement dropDown" +dDFBCount +";\r\n";
		}

		String selectFindBy = "";
		int selectFBCount;
		for (selectFBCount = 0; selectFBCount <= dropDowns ; selectFBCount++) {
			selectFindBy = selectFindBy+"\r\n"+indent4+"@FindBy(css=\"#select"+selectFBCount+"\")\r\n" + indent4+"private WebElement select" +selectFBCount +";\r\n";
		}

		String bakColourFindBy = "\r\n"+indent4+"@FindBy(css=\"body\")\r\n"+indent4+"private WebElement body; \r\n";

		String button1FindBy = "\r\n"+indent4+"@FindBy(css=\"#button1\")\r\n"+indent4+"private WebElement button1; \r\n";

		String dropsFindBy = "\r\n"+indent4+"@FindBy(css=\"select\")\r\n"+indent4+"private List<WebElement> drops; \r\n";
		
		//POM: For the table

		String tableFindBy = "\r\n"+indent4+"@FindBy(css=\"#table1\")\r\n" +indent4+ "private WebElement table1" +";\r\n";

		//POM: For the table

		String formFindBy = "";
		int formFBCount;
		for (formFBCount = 0; formFBCount <= fieldNumber ; formFBCount++) {
			formFindBy = formFindBy+"\r\n"+indent4+"@FindBy(css=\"#labelFormField"+formFBCount+"\")\r\n" +indent4+ "private WebElement formField" +formFBCount +";\r\n";
			formFindBy = formFindBy+"\r\n"+indent4+"@FindBy(css=\"#input"+formFBCount+"\")\r\n" +indent4+ "private WebElement input" +formFBCount +";\r\n";

		}

		//POM: For the paragraph headings
		
		String paraFindBy = "";
		int paraFBCount;
		//for (paraFBCount = 0; paraFBCount <= paras.length() ; paraFBCount++) {
		for (paraFBCount = 0; paraFBCount <= paraNumber ; paraFBCount++) {
			paraFindBy = paraFindBy+"\r\n"+indent4+"@FindBy(css=\"#para"+paraFBCount+"\")\r\n" +indent4+ "private WebElement para" +paraFBCount +";\r\n";
		}

		//POM part preparation continued .... 

		String pomEnd = "\r\n"+indent4+"public simplePageMethods(WebDriver instanceDriver){  	\r\n" + 
				"    	this.driver = instanceDriver;\r\n" + 
				"    	PageFactory.initElements(driver, this);  //(init elements takes arguments driver, page)\r\n" + 
				"    	    }\r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    //***create a new instance of the controls class .....***\r\n" + 
				"    \r\n" + 
				"    simplePageControls methodActing = new simplePageControls();\r\n" + 
				"    \r\n" + 
				"    //***methods which can be used by the test class:***\r\n";

		String pomMethods1 = "\r\n    public int numberOfRows(){    	\r\n" + 
				"    	return methodActing.tableRowNumber(table1);       	\r\n" + 
				"    }\r\n\r\n" + 
				"    \r\n" + 
				"    public String cellContent(int columnPosition, int rowPosition){\r\n" + 
				"    	return methodActing.tableData(columnPosition, rowPosition, table1);\r\n" + 
				"    }\r\n" + 
				"    	\r\n" + 
				"    public String headContent(int columnPosition2) {\r\n" + 
				"		return methodActing.tableHeadingvalue(columnPosition2, table1);\r\n" + 
				"    }\r\n" + 
				"    	\r\n" + 
				"      \r\n" + 
				"    public int headerCount(){\r\n" + 
				"    	return methodActing.tableHeadingSize(table1);\r\n" + 
					 
				"    }\r\n" + 
				"    \r\n" + 
				"    public int columnCount(int rowID) {\r\n" + 
				"    	return methodActing.tableColumnNumber(table1,rowID);\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    //For the dropdown - there are two variables: \r\n" + 
				"    \r\n" + 
				"    \r\n" + 
				"    public void pushTheButton() {\r\n" + 
				"    	methodActing.clicker(button1);\r\n" + 
				"    }\r\n" + 
				"    \r\n" + 
				"    public int dropsValue () {\r\n" +
				"	return methodActing.dropsMethod(drops);\r\n" +
				"	}\r\n"+
				"	\r\n"+
				"    public void dropdown(String stringValue, WebElement value) {\r\n"+
				"	methodActing.selectDropdown(stringValue, value);\r\n"+
				"	       }\r\n\r\n"+
				"    public String titleUsed() {\r\n" + 
				"    	return driver.getTitle();\r\n" + 
				"    	\r\n" + 
				"    }\r\n" + 
				"    \r\n" +
				"    public int getHeadingSize() {\r\n" + 
				"    	return methodActing.tableHeadingSize (table1);\r\n" + 
				"    	\r\n" + 
				"    }\r\n" + 
				"    \r\n"+
				"    \r\n" + 
				"    public String backGround() {\r\n" + 
				"    	return methodActing.bakColour(body);\r\n" +
				"    }\r\n" ;
		

		String pomDropMethods = "";  //the labels to test on will be select1, select2, select3 etc
		int dDMCount;
		for (dDMCount = 0; dDMCount <= dropDowns ; dDMCount++) {
			pomDropMethods = pomDropMethods +"\r\n"+indent4+"public void dropdown"+dDMCount+"(String stringValue) {\r\n" + 
					""+indent8+"methodActing.selectDropdown(stringValue, select"+dDMCount+");\r\n"+
					"       }\r\n";		
		}

		int dDMCount2;
		for (dDMCount2 = 0; dDMCount2 <= dropDowns ; dDMCount2++) {

			pomDropMethods = pomDropMethods+"\r\n"+indent4+"public String dropped"+dDMCount2+"() {\r\n" + 
					"	    return methodActing.chosen(select"+dDMCount2+");\r\n" + 
					"	    }\r\n";
		}
		

		String pomParas =""; //the paragraphs will have names like p
		int paraCount = 0;
		String[] paraString2 = paras.split(">");

		for (paraCount = 0; paraCount < paraString2.length; paraCount++) {
			pomParas=pomParas+"\r\n"+indent4+"public String paraText"+paraCount+"(){\r\n";
			pomParas=pomParas+""+indent8+"return methodActing.textValue(para"+paraCount+");\r\n    }\r\n";

		}

		String pomFields = "";
		int formCount;

		//methods for the field label values
		for (formCount = 0; formCount < fieldNumber; formCount++) {
			pomFields=pomFields+"\r\n"+indent4+"public String formField"+formCount+"(){\r\n"
					+ ""+indent8+"return methodActing.textValue(formField"+formCount+");\r\n    }\r\n";}

		//methods to get the field content
		for (formCount = 0; formCount < fieldNumber; formCount++) {
			pomFields=pomFields+"\r\n"+indent4+"public String attributeText"+formCount+"(){\r\n"
					+ ""+indent8+"return methodActing.attributeValue(input"+formCount+");\r\n    }\r\n";}

		//methods to populate the field content		
		for (formCount = 0; formCount < fieldNumber; formCount++) {
			pomFields=pomFields+"\r\n"+indent4+"public void sendText"+formCount+"(String inputString){\r\n"
					+ ""+indent8+"methodActing.keySender(input"+formCount+",inputString);\r\n    }\r\n";}

		//POM will need to link in the methods of the instantiated class - with methods that can be instantiated in the Test: 

		//*************************************************************************************************************
		//*************************STRING PREPARATION - TAKING WHAT IS ENTERED AND COMPILING PARTS FOR JAVA TEST SCRIPT**
		//***************************************************************************************************************

		//**Need drop down and table variables**

		String dropDownVariables = "";
		for (int ddNo =0; ddNo < dropDowns; ddNo++ ) {
			dropDownVariables = dropDownVariables + "\r\n    String accumulation_"+ddNo+" = \""+accumulation[ddNo]+"\";\r\n";
			dropDownVariables = dropDownVariables + "    String[] accumulation_"+ddNo+"Array = accumulation_"+ddNo+".split(\",\");\r\n";
		}

		String headerVariables = "";
		String tableVariables = ""; 
		for (int rn =0; rn < rowNum; rn++ ) {
			tableVariables = tableVariables + "\r\n    String accumulationTwo_"+rn+" =\""+accumulationTwo[rn]+"\";\r\n";

		}
		//**A main string for the test**
		
		String testString_a = "package simpleWebsite;\r\n" + 
				"\r\n" + 
				"import static org.junit.Assert.*;\r\n" + 
				"\r\n" + 
				"import org.junit.Test;\r\n" + 
				"import org.openqa.selenium.WebDriver;\r\n" + 
				"import org.openqa.selenium.chrome.ChromeDriver;\r\n" + 
				"\r\n" + 
				"public class simpleTest {\r\n" + 
				"\r\n" + 
				"    @Test\r\n" + 
				"    public void test() {\r\n" + 
				"\r\n"; 
		String testString_b ="\r\n    System.setProperty(\"webdriver.chrome.driver\", \"C:\\\\Users\\\\Selenium\\\\chromedriver.exe\");\r\n\r\n" + 
				"    WebDriver driver = new ChromeDriver();	\r\n" + 
				"\r\n" + 
				"    driver.get(\"C:\\\\Users\\\\Probook6570b\\\\Desktop\\\\js\"+unique+\".html\");\r\n" + 
				"\r\n" + 
				"    simpleWebsite.simplePageMethods myTools = new simpleWebsite.simplePageMethods(driver);\r\n" + 
				
				"\r\n" + 
				
				"\r\n" + 
								
				"    System.out.println(\"How many header values are there: \" + myTools.headerCount()); \r\n" + 
				"\r\n" + 

				"\r\n"+		
								
				"    System.out.println(\"How many rows are there? \" + myTools.numberOfRows()); //use existing method\r\n" + 
				"\r\n" +					
				"    System.out.println(\"The number of entered rows = " +rowNum+"\");\r\n"	+

				"    System.out.println(\"What does the title say? \" + myTools.titleUsed());\r\n" + 
				"\r\n" + 
				
				"    System.out.println(\"What is the background colour? \" + myTools.backGround());\r\n" + 
				"\r\n" + 
				
				""+ 
				""+ 
				""+ 
				"    int dDTCount;\r\n" +
				"    int iTerate;\r\n" + 
				"    int dropDowns;\r\n"+
				"    myTools.pushTheButton();\r\n" + 
				"\r\n" + 
				"\r\n";


		//**test the forms**

		String formtestString1 = "";

		//**test the dropDowns**

		String testDropMethods = "";  //the labels to test on will be select1, select2, select3 etc

		testDropMethods = testDropMethods + "\r\n    int dr;\r\n";

		int dDMCount3;
		for (dDMCount3 = 0; dDMCount3 < dropDowns ; dDMCount3++) {
			testDropMethods = testDropMethods +"\r\n"+indent4+"for (dr = 0; dr < accumulation_"+dDMCount3+"Array.length; dr++) {\r\n";

			testDropMethods = testDropMethods +"\r\n"+indent8+"myTools.dropdown"+dDMCount3+"(accumulation_"+dDMCount3+"Array[dr]);\r\n"; 

			testDropMethods = testDropMethods +"\r\n"+indent8+"myTools.dropped"+dDMCount3+"();\r\n";

			testDropMethods = testDropMethods +"\r\n"+indent8+"assertEquals(myTools.dropped"+dDMCount3+"(),accumulation_"+dDMCount3+"Array[dr]);\r\n    }\r\n";
		}

		//**test the headers**
		headerVariables = "		int headings;\r\n"+
				"       int headerLength = myTools.getHeadingSize();\r\n"+
				"       for (headings = 0; headings<headerLength; headings++){\r\n" +
				"			System.out.println(\"What is the content of the header \"+headings+\":\" + myTools.headContent(headings));\r\n" + 
				"		\r\n";

		//**test the table**
		tableVariables = tableVariables + "\r\n    int ta;\r\n    int cellTracker;\r\n    String[] tempRow;\r\n\r\n";


		for (int rowCounter = 0; rowCounter < rowNum; rowCounter++) {     //row 0, the headers, are handled separately
			tableVariables = tableVariables+"    tempRow = accumulationTwo_"+rowCounter+".split(\",\");\r\n"+
					"    for (cellTracker = 0; cellTracker<tempRow.length; cellTracker++){\r\n" + 
					 //public String cellContent(int columnPosition, int rowPosition)
			"        assertEquals(tempRow[cellTracker],myTools.cellContent(cellTracker,"+rowCounter+"+1));\r\n    }\r\n";
			
		}

		String tableVariables_old = "       //the order for the cells is column position - how many comma separated variable in headings, and row position  - how many lines\r\n"+
				"		for (int rowTracker =0; rowTracker<accumulationTwo.length; rowTracker ++){\n\r"+
				"			String[] tempRow = (accumulationTwo[rowTracker].split(\",\")).length;\r\n"+
				"               for (int cellTracker = 0; cellTracker<tempRow.length; cellTracker++){"
				+ "                  System.out.println(tempRow[cellTracker]}\r\n"
				+ ""
				+ ""
				+ "\r\n";


		String testForms =""; //the paragraphs will have names like p

		for (fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {				
			testForms=testForms+"\r\n"+indent4+"assertEquals(myTools.formField"+fieldCount+"(),\""+accumulationThree[fieldCount]+":\");\r\n"; 
			testForms=testForms+"\r\n"+indent4+"assertEquals(myTools.attributeText"+fieldCount+"(),\"\");\r\n";
		}

		String testParas ="";
		for (paraCount = 0; paraCount < paraString2.length; paraCount++) {
			testParas=testParas+"\r\n"+indent4+"assertEquals(myTools.paraText"+paraCount+"(),\""+paraString2[paraCount]+"\");\r\n";			
		}

		//populate the form fields. Test the values are updated. Click submit. Confirm the forms are reset.
		String formsInputSubmit ="";
		for (fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {				
			//check the labels
			formsInputSubmit=formsInputSubmit+"\r\n"+indent4+"myTools.sendText"+fieldCount+"(\"Test\");\r\n"; 
			//check the contents
			formsInputSubmit=formsInputSubmit+"\r\n"+indent4+"assertEquals(myTools.attributeText"+fieldCount+"(),\"Test\");\r\n";
		}

		String closeTest = "\r\n    driver.close();\r\n    }\r\n}";

		formsInputSubmit=formsInputSubmit+"\r\n    myTools.pushTheButton();\r\n";

		for (fieldCount = 0; fieldCount < fieldNumber; fieldCount++) {				
			//check the contents - should be empty as submit now pressed
			formsInputSubmit=formsInputSubmit+"\r\n"+indent4+"assertEquals(myTools.attributeText"+fieldCount+"(),\"\");\r\n";
		}

		reader.close();

		//********************************************************PRINTING ITEMS OUT*********************************
		//***************************Generate "unique" file reference and the three test artifacts: The html file under test. The java page object file. The Selenium test file ******  
		//***********************************************************************************************************

		LocalTime time = LocalTime.now();
		String oddBod = time.toString();
		System.out.println("oddBod = " +oddBod);
		String[] parts = oddBod.split(Pattern.quote("."), 2); //https://stackoverflow.com/questions/7935858/the-split-method-in-java-does-not-work-on-a-dot
		final String timeLord = parts[1];
		System.out.println("timeLord = " + timeLord.toString());
		
		//printing out the table on the html
		File jsScript = new File("C:\\Users\\Probook6570b\\Desktop\\js"+timeLord+".html");
		FileWriter jsFw = new FileWriter(jsScript);
		BufferedWriter jsOut = new BufferedWriter(jsFw);
		jsOut.newLine();
		jsOut.write(startOff + initTable + "\r\n" + tableString + finiTable + "\r\n");
		jsOut.close();

		//adding the dropdowns to the html
		FileWriter jsFw2 = new FileWriter(jsScript, true);
		BufferedWriter jsOut2 = new BufferedWriter(jsFw2);
		jsOut2.newLine();
		jsOut2.write( dropString  );
		jsOut2.close();

		//adding the parameter strings to the html ...
		//File jsScript = new File("C:\\Users\\Probook6570b\\Desktop\\js"+timeLord+".html");
		FileWriter jsFw3 = new FileWriter(jsScript, true);
		BufferedWriter jsOut3 = new BufferedWriter(jsFw3);
		jsOut3.newLine();
		jsOut3.write("<p>" + paraString + "</p>\r\n");
		jsOut3.close();

		FileWriter jsFw4 = new FileWriter(jsScript, true);
		BufferedWriter jsOut4 = new BufferedWriter(jsFw4);
		jsOut4.newLine();
		jsOut4.write(formInit+formBodypart+formFinal+signOff);
		jsOut4.close();

		//

		File testScript = new File("C:\\Users\\Probook6570b\\Desktop\\test"+timeLord+".java");
		FileWriter test = new FileWriter(testScript);
		BufferedWriter testOut = new BufferedWriter(test);
		testOut.newLine();
		testOut.write(testString_a+"\r\n    String unique = \""+timeLord+"\";\r\n"+testString_b+tableVariables
				+dropDownVariables+testDropMethods+testForms+testParas+formsInputSubmit
				+closeTest); 
		testOut.close();

		File pomClass = new File("C:\\Users\\Probook6570b\\Desktop\\pom"+timeLord+".java");
		FileWriter pom = new FileWriter(pomClass);
		BufferedWriter pomOut = new BufferedWriter(pom);
		pomOut.newLine();
		pomOut.write(pomStart+dropDnFindBy+dropsFindBy
				+selectFindBy+tableFindBy+formFindBy+bakColourFindBy
				+button1FindBy+paraFindBy+pomEnd+pomMethods1+pomDropMethods+pomFields+pomParas+"}");
		pomOut.close();

	}

}


