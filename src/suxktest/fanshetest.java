package suxktest;

import domain.Person;

import java.lang.reflect.Constructor;

public class fanshetest {
    public static Object newObject(Class objclass) throws Exception {
        Constructor constructor = objclass.getConstructor(String.class,String.class);
        Object test = constructor.newInstance("苏晓焜", "23");
        return test;
    }
}
