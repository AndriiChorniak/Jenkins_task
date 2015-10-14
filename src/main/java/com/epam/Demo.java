package com.epam;

import java.io.IOException;
import java.net.MalformedURLException;

public class Demo {

    public static void main(String[] args) throws MalformedURLException {
        String sourceUrl = "https://dl.dropboxusercontent.com/u/98396761/NewTxt.txt";
        String homeDir = "D:/MyFile.txt";
        
        try {
            Loader.saveUrl(homeDir, sourceUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
       
    }

}
