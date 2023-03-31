package org.launchcode.java.studios.arrays;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapChar {
    public static void main(String[] args) {
        String phraseTest= "this is a test run for the new array, this has to do with the,hashMap and will make sure its right.";
       HashMap<Character, Integer> characters= new HashMap<>();


// need to ask user for phrase
        for ( char character : phraseTest.toCharArray() ) {
            if (characters.containsKey(character)) {
                characters.put(character, characters.get(character) + 1);
            } else {
                characters.put(character, 1);
            }
        }
        for (HashMap.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(redUnderline + entry.getKey() + reset + " = " + gold + entry.getValue());
        }
    }



}
