package com.botwy.training;



import java.util.*;

public class MainCollections {

    public static  void main(String...args) {
        //Person person = null;
Person person = new Person("Victor",30);
        Person person2 = new Person("Masha",32);
        List<Person> list = new ArrayList<>();
        list.add(person);

   //     System.out.println(list.get(0));

       // Map<String,Person> map = new HashMap<>();
        Map<Person,Person> map = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
             //   return o1.getAge().compareTo(o2.getAge());
                return o1.getName().compareTo(o2.getName());
            }
        });
       // map.put(null,person);  //If Map<Person,Person  Exception in thread "main" java.lang.NullPointerException
        map.put(person,person); //Exception in thread "main" java.lang.ClassCastException: com.botwy.training.Person cannot be cast to java.lang.Comparable
        map.put(person2,person2);
       /* for (Person p:map.values()
             ) {
            System.out.println(p);
        }*/

        Queue<Person> queue = new ArrayDeque<>();
        queue.add(person);
        queue.add(person2);
        queue.add(new Person("Dima", 24));
      // System.out.println("poll "+queue.poll());
        System.out.println("peek "+queue.peek());
        for (Person p:queue
                ) {
            System.out.println(p);
        }
    }
}
