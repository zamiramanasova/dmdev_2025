package levelTwo.map;

import levelTwo.hashcode.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1,"Ivan", "Ivanov");
        Person petr = new Person(2,"Petr", "Petrov");
        Person sveta = new Person(3,"Sveta", "Svetikova");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);

//        System.out.println(map.get(2));
//        System.out.println(map.keySet());//вывод всех ключей
//        System.out.println(map.values());//vse znachenia
//        System.out.println(map.entrySet());//mnogestvo vseh kluch i znacheniy
//
//        for (Person person : map.values()) {
//            System.out.println(person.getFirstName());
//        }
//
//        System.out.println("====");
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(map.containsKey(2));//проверка есть ли в списке значение с таким ключом
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.putIfAbsent(sveta.getId(), sveta));//добавит значение если такого ключа не существует
        System.out.println(map.get(4));
        System.out.println(map.getOrDefault(6,sveta));//если не будет такого ключа то вернет свету



    }
}
