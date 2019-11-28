package com.weather.internet;

import com.weather.test.USE;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    static BufferedReader bufferedReader;
    public static int check () throws IOException{
        PropertyConfigurator.configure("log4j.properties");
        Logger logger =Logger.getLogger(USE.class);
        logger.debug("debug");
        String address="www.baidu.com";
        int state=0;
        try {


            Process process=Runtime.getRuntime().exec("ping "+"-c 2 "+address );
            bufferedReader=new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line="";
            String connectionStr=null;
            while ((line = bufferedReader.readLine())!=null) {

                connectionStr += line;
            }
            System.out.println(connectionStr);
            logger.info(connectionStr);
            if(connectionStr.indexOf("0% packet loss")!=-1){

                System.out.println("===the internet working===");
                logger.info("===the internet working===");
                state= 1;
            }
            else
            {
                System.out.println("else===the internet dont working ===");
                logger.info("else===the internet dont working===");
                state= 0;
            }
        } catch(IOException e){
            System.out.println("Exception===the internet dont working ===");
            logger.info("Exception===the internet dont working===");
            state= 0;
            e.printStackTrace();
        }finally{
            System.out.println("===finally ===");
            logger.info("===finally===");
            bufferedReader.close();
        }
        return state;
    }
}