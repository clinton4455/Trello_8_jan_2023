package org.test;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {

	public static void generateJVMRepot(String json) {
		File loc= new File(System.getProperty("user.dir")+"src\\test\\resources\\JVMreport\\jsonReport.json");
		Configuration con= new Configuration(loc, "Trello");
		con.addClassifications("Browser Name", "Chrome");
		con.addClassifications("Browser version", "106");
		con.addClassifications("System os", "Windows 11");
		con.addClassifications("Enviroment", "QA");
		con.addClassifications("Sprint", "20");


		List<String> jsonFile= new LinkedList<String>();
		jsonFile.add(json);
		ReportBuilder rb=new ReportBuilder(jsonFile, con);
		rb.generateReports();
		
	}
}
