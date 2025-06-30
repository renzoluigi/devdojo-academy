package academy.devdojo.javaoneforall.javacore.Ycollections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); // to preserve the insertion order, use LinkedHashMap
        map.put("keybord", "keyboard");
        map.put("mouze", "mouse");
        map.put("u", "you");
        map.putIfAbsent("u", "you2"); // Put if he doesn't have the correspondent key

        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("------------");

        // To iterate and get key and value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
