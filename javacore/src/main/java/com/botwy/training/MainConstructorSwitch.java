package com.botwy.training;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;

public class MainConstructorSwitch {

    public static void main (String...args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("Victor",30);
       // Person person1 = new Person();  Compile: Cannot resolve constructor Person()
switch (person.getAge()) {
    case 30:
        System.out.println(30);
    case 35:
        System.out.println(person);
        break;
}

    }
}
