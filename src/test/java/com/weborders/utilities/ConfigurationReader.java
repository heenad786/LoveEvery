package com.weborders.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties();


    static {

        try {
            FileInputStream file = new FileInputStream("/Users/heenadhanani-afzal/IdeaProjects/WebOrdersAutomationSpring2020/configuration.properties");
            properties.load(file);
            file.close();

        }catch (Exception e){
            throw new RuntimeException("Unable to find configuration.properties!");
        }

    }

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }




}
