package com.weather.jxJson;

import com.weather.city.PublicName;
import com.weather.getJson.GET;
import com.weather.test.USE;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;


public class JX {
    public static int jxJson(String json, String cityname) throws SQLException {
        Logger logger = Logger.getLogger(USE.class);
        // 连接数据库
        //  int state = 0;
        for (int k = 0; k < 5; ++k) {


            try {

                Class.forName("com.mysql.jdbc.Driver");
//                Connection connection = DriverManager.getConnection(
//                        "jdbc:mysql://localhost:3306/Mytest",
//                        "root", "aa223183");

            } catch (ClassNotFoundException e) {

                System.out.println("Where is your mysql JDBC Driver? "
                        + "Include in your library path!");
                e.printStackTrace();
                logger.info("Where is your mysql JDBC Driver? "
                        + "Include in your library path!");
                logger.info(USE.getTrace(e));
                continue;

            }
            System.out.println("mysql JDBC Driver Registered!");
            logger.info("mysql JDBC Driver Registered!");
            Connection connection = null;

            try {

                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/Mytest?autoReconnect=true&useSSL=false",
                        "root", "aa223183");
//                if (connection != null) {
//                    System.out.println("You made it, take control your database now!");
//                    logger.info("You made it, take control your database now!");
//
//                } else {
//                    System.out.println("Failed to make connection!");
//                    logger.info("Failed to make connection!");
//                }
                JSONArray jsonArr = JSONArray.fromObject(json);
                System.out.print("jsonArr" +jsonArr);
                String aqi[] = new String[jsonArr.size()];
                String area[] = new String[jsonArr.size()];
                String co[] = new String[jsonArr.size()];
                String co_24h[] = new String[jsonArr.size()];
                String no2[] = new String[jsonArr.size()];
                String no2_24h[] = new String[jsonArr.size()];
                String o3[] = new String[jsonArr.size()];
                String o3_24h[] = new String[jsonArr.size()];
                String o3_8h[] = new String[jsonArr.size()];
                String o3_8h_24h[] = new String[jsonArr.size()];
                String pm10[] = new String[jsonArr.size()];
                String pm10_24h[] = new String[jsonArr.size()];
                String pm2_5[] = new String[jsonArr.size()];
                String pm2_5_24h[] = new String[jsonArr.size()];
                String position_name[] = new String[jsonArr.size()];
                String primary_pollutant[] = new String[jsonArr.size()];
                String quality[] = new String[jsonArr.size()];
                String so2[] = new String[jsonArr.size()];
                String so2_24h[] = new String[jsonArr.size()];
                String station_code[] = new String[jsonArr.size()];
                String time_point[] = new String[jsonArr.size()];
                Statement stmt = null;
                String strSQL = "";

                String timePoint = "";
                connection.setAutoCommit(false);
                stmt = connection.createStatement();
                System.out.print("jsonArr.size():"+jsonArr.size());
                for (int i = 0; i < jsonArr.size(); i++) {

                    aqi[i] = jsonArr.getJSONObject(i).getString("aqi");
                    area[i] = jsonArr.getJSONObject(i).getString("area");
                    co[i] = jsonArr.getJSONObject(i).getString("co");
                    co_24h[i] = jsonArr.getJSONObject(i).getString("co_24h");
                    no2[i] = jsonArr.getJSONObject(i).getString("no2");
                    no2_24h[i] = jsonArr.getJSONObject(i).getString("no2_24h");
                    o3[i] = jsonArr.getJSONObject(i).getString("o3");
                    o3_24h[i] = jsonArr.getJSONObject(i).getString("o3_24h");
                    o3_8h[i] = jsonArr.getJSONObject(i).getString("o3_8h");
                    o3_8h_24h[i] = jsonArr.getJSONObject(i).getString(
                            "o3_8h_24h");
                    pm10[i] = jsonArr.getJSONObject(i).getString("pm10");
                    pm10_24h[i] = jsonArr.getJSONObject(i)
                            .getString("pm10_24h");
                    pm2_5[i] = jsonArr.getJSONObject(i).getString("pm2_5");
                    pm2_5_24h[i] = jsonArr.getJSONObject(i).getString(
                            "pm2_5_24h");
                    position_name[i] = jsonArr.getJSONObject(i).getString(
                            "position_name");
                    primary_pollutant[i] = jsonArr.getJSONObject(i).getString(
                            "primary_pollutant");
                    quality[i] = jsonArr.getJSONObject(i).getString("quality");
                    so2[i] = jsonArr.getJSONObject(i).getString("so2");
                    so2_24h[i] = jsonArr.getJSONObject(i).getString("so2_24h");
                    station_code[i] = jsonArr.getJSONObject(i).getString(
                            "station_code");
                    time_point[i] = jsonArr.getJSONObject(i).getString(
                            "time_point");

                    timePoint = time_point[i];
                    strSQL = "INSERT into shmily (aqi, area, co, co_24h, no2, no2_24h, o3, o3_24h, o3_8h, o3_8h_24h, pm10, pm10_24h, pm2_5, pm2_5_24h, position_name, primary_pollutant,quality, so2, so2_24h, station_code, time_point,created_time_with_tz,created_time_without_tz,id) values("
                            + aqi[i]
                            + ",'"
                            + area[i]
                            + "',"
                            + co[i]
                            + ","
                            + co_24h[i]
                            + ","
                            + no2[i]
                            + ","
                            + no2_24h[i]
                            + ","
                            + o3[i]
                            + ","
                            + o3_24h[i]
                            + ","
                            + o3_8h[i]
                            + ","
                            + o3_8h_24h[i]
                            + ","
                            + pm10[i]
                            + ","
                            + pm10_24h[i]
                            + ","
                            + pm2_5[i]
                            + ","
                            + pm2_5_24h[i]
                            + ",'"
                            + position_name[i]
                            + "','"
                            + primary_pollutant[i]
                            + "','"
                            + quality[i]
                            + "',"
                            + so2[i]
                            + ","
                            + so2_24h[i]
                            + ",'"
                            + station_code[i]
                            + "','"
                            + time_point[i]
                            + "',"
                            + "now(),now()"
                            + ",'"
                            + area[i]
                            + position_name[i]
                            + time_point[i]
                            + "');";
                    // if(x==0){

                    try {

                        /*
                        stmt = connection.createStatement(
                                ResultSet.TYPE_SCROLL_INSENSITIVE,
                                ResultSet.CONCUR_READ_ONLY);
*/
                        String sql = "select area from shmily where area =" + "'"
                                + area[i] + "' and position_name ='" + position_name[i] + "' and time_point ='" + time_point[i]
                                + "';";
                        System.out.println("当前数据的时间=====" + time_point[i]);
                        logger.info("当前数据的时间=====" + time_point[i]);
                        ResultSet rs1 = stmt.executeQuery(sql); // 查询数据库看数据是否已经存在
                        if (rs1.next()) { // 该条数据已经存在
                            // PublicName.getValue(0,0);

                            System.out.println("dont need insert " + strSQL);
                            logger.info("dont need insert " + strSQL);
                        } else {


                            stmt.executeUpdate(strSQL);
                            System.out.println(strSQL);


                        }
                        rs1.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.info(USE.getTrace(e));
                    }
                }
                //探测数据库

                connection.commit();
                PublicName.setCityValue(cityname, 1);
                try {


                    int values = PublicName.getVal(1);
                    if (values == 0) { // 判断是否检索过数据库

                        int numble = 0;
                        ArrayList<String> cityName = new ArrayList<String>();
                        ResultSet rs2 = stmt
                                .executeQuery("select distinct area from shmily where time_point="
                                        + "'" + timePoint + "';");
                        while (rs2.next()) {

                            String str = rs2.getString("area");

                            cityName.add(str);
                            numble++;

                            // 探测数据库，修改 value
//                            k = 5;
                        }
                        rs2.close();

                        for (int j = 0; j < numble; ++j) {

                            PublicName.setCityValue(cityName.get(j), 1);


                        }
                        stmt.close();
                        connection.close();

                        PublicName.setVal(1, 1);
                        String cityNames = "";
                        int cityNUM = 0;
                        cityNames = PublicName.getCityName(cityNUM);
                        while (cityNames != " ") {
                            int temp = PublicName.getCityValue(cityNames);
                            if (temp == 0) {
                                GET.getWeatherInform(cityNames);
                            }
                            cityNUM++;
                            cityNames = PublicName.getCityName(cityNUM);
                        }

                        stmt.close();
                        connection.close();
                        String cityName1 = "";
                        int cityNUM1 = 0;
                        cityName1 = PublicName.getCityName(cityNUM1);
                        while (cityName1 != " ") {
                            PublicName.setCityValue(cityName1, 0);
                            cityNUM1++;
                            cityName1 = PublicName.getCityName(cityNUM1);
                        }
                        for (int val = 0; val < 3; val++) {

                            PublicName.setVal(val, 0);
                        }

                        return 6;
                    } else {
                        stmt.close();
                        connection.close();
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    logger.info(USE.getTrace(e));
                }
            } catch (SQLException e) {

                System.out.println("Connection Failed! Check output console");
                e.printStackTrace();
                logger.info("Connection Failed! Check output console");
                logger.info(USE.getTrace(e));
                continue;
                /*
                 * try { Thread.sleep(1000*10); } catch (InterruptedException
                 * e1) { // TODO Auto-generated catch block
                 * e1.printStackTrace(); }
                 */

            }


        } //for结束

        System.out.print("当前时间===" + new Date());

        return 6;


    }
}