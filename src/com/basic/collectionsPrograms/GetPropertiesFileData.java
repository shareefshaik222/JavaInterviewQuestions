package com.basic.collectionsPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesFileData {

    public static String getProperties(String key) throws IOException {
        //create object for properties class
        Properties prop = new Properties();
        //create object for file class
        //read file properties using File class
        File f = new File(System.getProperty("user.dir") + "/src/com/basic/collectionsPrograms/testData.properties");
        FileInputStream fis = new FileInputStream(f);
        prop.load(fis);
        return prop.getProperty(key);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("App url is:"+getProperties("appUrl"));
        System.out.println("Browser name :"+getProperties("browser"));
        System.out.println("Name :"+getProperties("name"));
        System.out.println("password :"+getProperties("pwd"));
    }
}
