package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion."
                + "this has never happended before";
        // count char
        Map<Character, Integer> occurances  = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char character:characters){
            Integer integer = occurances.get(character);
            if(integer == null){
                occurances.put(character, 1);
            }else{
                occurances.put(character, integer + 1);
            }
        }
        System.out.println(occurances);

        //count String
        Map<String, Integer> stringOccurance  = new HashMap<>();
        String[] words = str.split(" ");
        for(String word:words){
            Integer integer = stringOccurance.get(word);
            if(integer == null){
                stringOccurance.put(word, 1);
            }else{
                stringOccurance.put(word, integer + 1);
            }
        }

        System.out.println(stringOccurance);
    }

}
