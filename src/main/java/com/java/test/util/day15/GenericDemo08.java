package com.java.test.util.day15;

/**
 * Created by chentingting on 2019/11/15.
 */
public class GenericDemo08 {
    public static void main(String[] args){
        Utils<Worker> utils = new Utils<Worker>();
        utils.setObject(new Worker());
        Worker w = utils.getObject();
    }

}
class Utils<QQ>{
    private QQ q;
    public void setObject(QQ q){
        this.q = q;
    }
    public QQ getObject(){
        return q;
    }
}

class Worker{

}
class Student1{

}