package com.discovery.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesReader {
	static Properties prop;
	public static  void loadData() throws Exception{
		File file = new File("./properties/Discovery.properties");
		FileInputStream fInput = null;
		//Properties prop = new Properties();
		try {
			fInput = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		 prop = new Properties();
		try {
			 prop.load(fInput);
		}catch(Exception e) {
			System.out.println("Exception " +e);
		}
	}
	public static String getData(String Data) throws Exception{
		loadData();
		String data=prop.getProperty(Data);
		return data;
	}
}
