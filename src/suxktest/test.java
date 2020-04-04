package suxktest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {
    public static void main(String[] args) {
//        invoke(new Cook() {
//            @Override
//            public void makeFood() {
//                System.out.println("吃饭了");
//            }
//        });
//        invoke(()-> System.out.println("chifan"));
        invokeCalc(120,300,(int a,int b)->a+b);

    }
//    public  static void invoke(Cook cook){
//        cook.makeFood();
//    }
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

}
interface Calculator {
    int calc(int a, int b);
}
interface Cook {
    void makeFood();
}