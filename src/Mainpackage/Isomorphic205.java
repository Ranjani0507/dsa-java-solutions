package Mainpackage;

import java.util.HashMap;

public class Isomorphic205 {
    public static boolean isomorphic(String s,String t){
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(mapST.containsKey(chs) && mapST.get(chs) != cht){
               return false;
            }
            if(mapTS.containsKey(cht) && mapTS.get(cht) != chs){
                return false;
            }
            mapST.put(chs,cht);
            mapTS.put(cht,chs);

        }
      return true;
    }
    public static void main(String[] args) {
      String s = "eeg";
      String t = "add";
        System.out.println(isomorphic(s,t));
    }
}
