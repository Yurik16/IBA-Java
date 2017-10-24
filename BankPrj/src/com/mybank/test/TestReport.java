package com.mybank.test;

import java.io.IOException;

import com.mybank.data.DataSource;
import com.mybank.report.CustomerReport;

public class TestReport {

  private static final String USAGE
    = "USAGE: java com.mybank.test.TestReport <dataFilePath>";

  public static void main(String[] args) {

    if ( args.length != 1 ) {
      System.out.println(USAGE);
    } else {
      String dataFilePath = args[0];

      try {
	System.out.println("Reading data file: " + dataFilePath);
	DataSource dataSource = new DataSource(dataFilePath);
	dataSource.loadData();

	CustomerReport report = new CustomerReport();
	report.generateReport();

      } catch (IOException ioe) {
	System.out.println("Could not load the data file.");
	System.out.println(ioe.getMessage());
	ioe.printStackTrace(System.err);
      }
    }
  }
}
