package com.botwy.training;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main (String...args) throws MalformedURLException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        File file = new File("C:\\Users\\denis\\IdeaProjects\\java_homework\\out\\artifacts\\java_homework_jar\\java_homework.jar");
        URL url = file.toURI().toURL();
        ClassLoader cl= new URLClassLoader(new URL[]{url});
        Class clazz = cl.loadClass("com.homework2.classes.Person");
       // Person person_cl = (Person) clazz.newInstance();  java.lang.NoSuchMethodException: com.homework2.classes.Person.<init>()
        Person person_cl = (Person) clazz.getConstructor(boolean.class,String.class).newInstance(true,"Victor");

        Person person = new Person("Victor",30);
       // Person person1 = new Person();
switch (person.getAge()) {
    case 30:
        System.out.println(30);
    case 35:
        System.out.println(person);
        break;
}

    }
}
