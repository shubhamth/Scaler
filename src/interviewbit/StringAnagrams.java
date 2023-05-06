package interviewbit;

import java.util.Arrays;
import java.util.Collections;

/**
 * The main idea is to validate the length of strings and then if found equal,
 * convert the string to char array and then sort the arrays and check if both are equal.
 */
public class StringAnagrams {
    public static void  main(String... agrs) {
        String str1 = "Race";
        String str2 = "Care";
        System.out.print("String is Anagrams "+checkAnagrams(str1,str2));
    }
    static boolean checkAnagrams(String str1,String str2){
        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        if(Arrays.equals(charArr1,charArr2))
            return true;

        return false;
    }
}
