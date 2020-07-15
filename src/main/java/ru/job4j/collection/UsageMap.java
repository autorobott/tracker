package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> mapSteck = new HashMap<>();
        mapSteck.put("parsentev@yandex.ru", "Petr Arsentev");
        mapSteck.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        mapSteck.put("autorobot@ymail.ru", "Ovsyannikov Nikolay");

        for (String key : mapSteck.keySet()) {
            String value = mapSteck.get(key);
            System.out.println(key + " : " + value);
        }

        for (Map.Entry<String, String> buff : mapSteck.entrySet()) {
            String key = buff.getKey();
            String value = buff.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
