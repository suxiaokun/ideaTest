package suxktest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class matcherTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        //1.for循环
        List<Integer> newList1 = new ArrayList<>();
        for (Integer integer : list) {
            if(integer % 2 == 0){
                newList1.add(integer);
            }
        }
        System.out.println(newList1);

        List<Integer> newList2 = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(newList2);

        Pattern p = Pattern.compile("12");
        Matcher m = p.matcher("123");

        System.out.println(m.find());
    }
}
