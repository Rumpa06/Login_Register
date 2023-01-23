/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exavalu.empweb.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author itssh
 */
public class PropertyFileReader {

    public static PropertyFileReader propertyFileReader = null;

    // in this class we will have static methods to get the connection params
    public String getPropertyValue(String param) {

        String value = null;

        // input = getClass().getResourceAsStream("settings.properties"); // Property
        // file path in classpath
        try {

            String path = PropertyFileReader.class.getClassLoader().getResource("settings.properties").getPath();

            BufferedReader input = new BufferedReader(new FileReader(path));

            Properties prop = new Properties();

            prop.load(input);

            value = prop.getProperty(param);

        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (NullPointerException ee) {

        }

        return value;

    }

    private PropertyFileReader() {

        // Private constructor
    }

    public static PropertyFileReader getInstance() {

        if (propertyFileReader == null) {

            propertyFileReader = new PropertyFileReader();

        }

        return propertyFileReader;

    }

}
