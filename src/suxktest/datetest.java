package suxktest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class datetest {
    public static void main(String[] args) throws ParseException {
        Date date1=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date4=sdf.parse("1997-12-11");
        long bothtime=date4.getTime();
        long nowtime=date1.getTime();
        long time=(nowtime-bothtime)/1000/24/60/60/356;
        System.out.println(time);
// 系统自带毫秒数算时间
//        long starttime=System.currentTimeMillis();
//        for (int i = 0; i <99999 ; i++) {
//            System.out.println(i);
//        }
//        long endtime=System.currentTimeMillis();
//        System.out.println("打印时间为："+(endtime-starttime)/1000);
        //系统自带数组复制方法
//        int[] a={1,2,3,4};
//        int[] b={6,7,8,9};
//        System.arraycopy(a,0,b,0,3);
//        for (int i = 0; i <b.length ; i++) {
//            System.out.println(b[i]);
//        }
        //日历类
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.PM));

    }
}
