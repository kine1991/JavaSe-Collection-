package javaVersion.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","b");
        map.put("a","d");



        String s = map.get("a");
        System.out.println(s);


        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("d"));
        System.out.println(map.containsValue("b"));
        System.out.println(map.remove("a"));

        System.out.println(16006%16);

        map.values();



    }


}
