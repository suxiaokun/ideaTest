package suxktest;

import domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class fanshe {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        //成员变量操作常用方法get/set
//        Field[] fields = personClass.getFields();
//        for (Object o:fields
//             ) {
//            System.out.println(o);
//        }
//        Field name = personClass.getField("name");
//        Person person=new Person("苏晓焜","18");
//        Object o = name.get(person);
//        name.set(person,"阳春燕");
//        System.out.println(o);
//        System.out.println(person.name);
        //构造器
//        Constructor constructor = personClass.getConstructor(String.class, String.class);
//        Object person = constructor.newInstance("苏晓焜","18");
//        System.out.println(person);
//        //空参构造
//        Object o = personClass.newInstance();
//        System.out.println(o);
        //成员方法
//        Method eat = personClass.getMethod("eat");
//        Person person=new Person();
//        eat.invoke(person);
        Object o = fanshetest.newObject(Person.class);
        System.out.println(o);
    }
}
