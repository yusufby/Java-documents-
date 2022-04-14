package day32maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.Map;

public class MapInterviewQuestions {
    public static void main(String[] args) {
         /*
            How to count the number of occurrences of the words in a sentence
            For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                          -Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
                         - get rid of punctuation
                          -split the words into array.

     */

        String sentence="Java is easy. Type codes to learn Java. To earn money learn Java.";
        sentence= sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);


        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        Map<String, Integer> result=new HashMap<>();
        for (String w:words){
            Integer numberOfOccurrences=result.get(w);
            if (numberOfOccurrences==null){
                result.put(w,1); // if the word does not exist, this part will execute
            }else {
                result.put(w,numberOfOccurrences+1);

            }
        }
        System.out.println(result);





    }

}
