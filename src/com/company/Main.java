package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
//     1.   Создать HashMap
        Map<Integer, String> germanCar = new HashMap<>();
        germanCar.put(1, "Volvo");
        germanCar.put(2, "Audi");
        germanCar.put(3, "BMW");
        germanCar.put(4, "Porsche");
        germanCar.put(5, "Opel");
        System.out.println(germanCar);

//     2.  Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс com.company.Product).
//     Перебрать и распечатать пары значений - entrySet().
//     Перебрать и распечатать набор из имен продуктов  - keySet().
//     Перебрать и распечатать значения продуктов - values().
//     Для каждого перебора создать свой метод.

        Product toy1 = new Product("Plasticine", "ForAll");
        Product toy2 = new Product("Doll", "ForGirls");
        Product toy3 = new Product("Car", "ForBoys");
        Product toy4 = new Product("Kitchen", "ForAll");
        Product toy5 = new Product("SoftToy", "ForAll");

        Map<String, String> toy = new HashMap<>();
        toy.put(toy1.name, toy1.toyObject);
        toy.put(toy2.name, toy2.toyObject);
        toy.put(toy3.name, toy3.toyObject);
        toy.put(toy4.name, toy4.toyObject);
        toy.put(toy5.name, toy5.toyObject);
        toy.put(toy1.name, toy1.toyObject);

        System.out.println(toy);

        for (Map.Entry<String, String> e : toy.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        for (String k : toy.keySet()) {
            System.out.println(k);
        }

        for (String v : toy.values()) {
            System.out.println(v);
        }

//      3. Дана строка String str = "I love java as like others java developers, to be java developer is great to be good";
//      При помощи коллекции HashMap сделать подсчёт слов в строке.
//      Программа должна подсчитать сколько каждое слово встречается в строке.

        String str = "I love java as like others java developers, to be java developer is great to be good";
        String[] words = str.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 0);
            }
            wordCount.put(word, wordCount.get(word) + 1);
        }
        for (String word : wordCount.keySet()) {
            System.out.println(word + "=" + wordCount.get(word));
        }
    }
}
