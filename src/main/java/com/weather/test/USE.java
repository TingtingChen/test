package com.weather.test;

/**
 * Created by chentingting on 2017/12/2.
 */

import com.weather.city.PublicName;
import com.weather.getJson.GET;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class USE {
    public static String getTrace(Throwable t) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        t.printStackTrace(writer);
        StringBuffer buffer = stringWriter.getBuffer();
        return buffer.toString();
    }


    public static void main(String[] args) throws Exception {


        PropertyConfigurator.configure("log4j.properties");//定义日志
        Logger logger = Logger.getLogger(USE.class);
        logger.debug("debug");


        String cityName = "";
        int cityNUM = 0;
        cityName = PublicName.getCityName(cityNUM);
        while (cityName != " ") {
            PublicName.setCityValue(cityName, 0);
            cityNUM++;
            cityName = PublicName.getCityName(cityNUM);
        }
        for (int val = 0; val < 3; val++) {

            PublicName.setVal(val, 0);
        }


        ScheduledExecutorService execService = Executors.newScheduledThreadPool(3);


        execService.scheduleAtFixedRate(new Runnable() {      //按照固定频率定时，本次设置时间间隔位3分钟，第一个参数为程序运行多久后开始执行
            public void run() {
                Logger logger = Logger.getLogger(USE.class);
                logger.debug("debug");
                int result = 0;


                result = GET.getWeatherInform("zhuhai"); //1表示开始获取数据
                if (result == 6) {
                    System.out.println("===========================\n"
                            + "===      数据获取成功        ===\n"
                            + "=======            =======\n");
                    logger.info("===============================\n"
                            + "===      数据获取成功                  ======\n"
                            + "====                       ======\n");
                    System.out.print("当前时间===" + new Date());
                } else {
                    System.out.println("========数据获取失败，失败代码======" + result);
                    logger.info("========数据获取失败，失败代码======" + result);
                    System.out.print("当前时间===" + new Date());
                    //  logger.info("当前时间===" + new Date());
                    return;
                }


            }


        }, 1, 3 * 60, TimeUnit.SECONDS);
    }


}
