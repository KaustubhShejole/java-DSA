package Queues;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNonRepeatingLetter {
    public static void non_repeating_first_letter_print(String string)
    {
        int freq_count[] = new int[26]; //'a' - 'z'
        Queue<Character>  characterQueue = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            freq_count[ch - 'a']++;
            characterQueue.add(ch);
//            while (!characterQueue.isEmpty())
//            {
//                if(freq_count[characterQueue.peek() - 'a'] == 1)
//                {
//                    System.out.println(characterQueue.peek());
//                    break;
//                }
//                else {
//                    characterQueue.remove();
//                }
//            }
//            if(characterQueue.isEmpty()){
//                System.out.println(-1);
//            }
            while (!characterQueue.isEmpty() && freq_count[characterQueue.peek() - 'a'] > 1)
            {
                characterQueue.remove();
            }
            if(characterQueue.isEmpty()){
                System.out.println(-1);
            }else
                System.out.println(characterQueue.peek());
        }
    }

    public static void main(String[] args) {
        String string = "aabccxb";
        non_repeating_first_letter_print(string);
    }
}