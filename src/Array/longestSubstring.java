package Array;

public class longestSubstring {
    /*
    3. Longest substring: Given a string, write a function that returns the longest substring without repeating characters.

    abcdba -> return abcd or cdba

    abbcdb -> return bcd or cdb
     */

    public static String longestSubStr(String input){
        char[] charArray = input.toCharArray();
        for (int i=0; i<charArray.length; i++) {
            if (charArray[i] == charArray[i+1]) {

            }
        }


        return "";

    }

}
