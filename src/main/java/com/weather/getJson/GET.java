package com.weather.getJson;

import com.weather.internet.Test;
import com.weather.jxJson.JX;
import com.weather.test.USE;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

public class  GET {
    public static int getWeatherInform(String cityName){
        Logger logger =Logger.getLogger(USE.class);

        int state = -1;
        String mytext = null;

        try {
            mytext = java.net.URLEncoder.encode(cityName, "utf-8");
            System.out.println(mytext);
        } catch (UnsupportedEncodingException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        String PM2_5Url = "http://www.pm25.in/api/querys/aqi_details.json?city="+mytext+"&token=5j1znBVAsnSf5xQyNQyq"; //  公共key
        System.out.println("=== " + cityName + " start! ===");
        logger.info("=== " + cityName + " start! ===");

        int checkNum;
        try {
            checkNum=Test.check();//测试网络
            if(checkNum==0)
                return 0;
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            logger.info(USE.getTrace(e1));
        }
        StringBuffer strBuf;
        strBuf = new StringBuffer();

        try {
            URL url = new URL(PM2_5Url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();//设置网络获取时间间隔，超出时间后跳出
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(30000);
            state = conn.getResponseCode();
            if (state == 200) {
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(),
                                "utf-8"));// 转码。
                String line = null;
                while ((line = reader.readLine()) != null)
                    strBuf.append(line + " ");
                System.out.println("connect success");
                logger.info("connect success");
                reader.close();

            } else {
                System.out.println("connect false" + cityName);
                logger.info("connect false" + cityName);
                return 0;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
            logger.info(USE.getTrace(e));
        } catch (ConnectException ce) {
            ce.printStackTrace();
            logger.info(USE.getTrace(ce));
        } catch (IOException e) {
            e.printStackTrace();
            logger.info(USE.getTrace(e));
        }
        //      }

        String json = strBuf.toString();//判断获取的数据
        if (json == null || json =="") {
            System.out.println("++++++++字符串为空+++++++");
            logger.info("++++++++字符串为空+++++++");
            return 2; // 返回2表示字符串为空
        } else if (json.charAt(0) == '{') {
            System.out.println(json);
            logger.info(json);
            return 3; // 返回3表示字符串以{开头
        }else if (json.charAt(0) == '['){
            try {
                JX.jxJson(json,cityName);//调用解析函数
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            System.out.println("+++++++未知问题++++++++");
            logger.info("++++++++未知问题+++++++");
            return 4;  //返回4表示未知问题

        }


        System.out.println(cityName + ", The end!!!");
        logger.info(cityName + ", The end!!!\n");

        return 6;


    }

}