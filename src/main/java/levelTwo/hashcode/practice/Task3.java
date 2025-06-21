package levelTwo.hashcode.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Написать метод isUnique который принимает и вовращает
 * true если каждому ключу соответствует свое уникальное значение
 * Map : String String
 */
public class Task3 {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("Marty" , "Step");
//        map.put("Stuart" , "Reges");
//        map.put("Jessica" , "Miller");
//        map.put("Amanda" , "Camp");
//        map.put("Hal" , "Penkins");

        Map<String, String> map = Map.of(
                "Marty" , "Step",
                "Stuart" , "Reges",
                "Jessica" , "Miller",
                "Amanda" , "Camp",
                "Hal" , "Penkins"
        );
        System.out.println(isUnique(map));
    }

    public static boolean isUnique(Map<String, String> map) {
        return map.size() == new HashSet<>(map.values()).size();
    }
}
