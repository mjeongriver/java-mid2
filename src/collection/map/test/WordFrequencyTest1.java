package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {

        String text = "orange apple apple apple orange apple banana";

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.split(" ");
        for(String word : words) {
//            Integer count = map.get(word);
//            if(count == null) {
//                count = 0;
//            }
//            count++;
            map.put(word, map.getOrDefault(word, 0) +1);
        }
        System.out.println(map);
    }
}
