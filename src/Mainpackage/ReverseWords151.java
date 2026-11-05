package Mainpackage;

import java.util.Arrays;

public class ReverseWords151 {
    public static String reverseWord(String s){
        StringBuilder sb = new StringBuilder();
        String[] word = s.trim().split("\\s+");
        for(int i=word.length-1;i>=0;i--){
            sb.append(word[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWord(s));

        }
}



