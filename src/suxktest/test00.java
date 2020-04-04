package suxktest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class test00 {
    public static void main(String[] args) {
        String s="a4b4ab4aaaa44bbcdffdcfffa";
        char[] chars=s.toCharArray();
        Map<Character,Integer> map=new HashMap();
        for (Character c:chars
             ) {
            if (map.containsKey(c)){
                Integer flag=map.get(c);
                flag++;
                map.put(c,flag);
            }else {
                map.put(c,1);
            }

        }
        System.out.println(map);
    }
}
