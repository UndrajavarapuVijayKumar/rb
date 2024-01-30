package com.metlife.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
   public static Properties p;
    public static String getProperty(String Key) {
        p = new Properties();
        try {
            p.load(new FileInputStream("src/test/resources/Project.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return p.getProperty(Key);
    }
}
