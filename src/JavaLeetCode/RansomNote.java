package JavaLeetCode;

import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }
            magazine = magazine.substring(0, matchingIndex) + magazine.substring(matchingIndex + 1);
        }
        return true;
    }

    //    complexity O (n x m)
    public boolean canConstruct2(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, currentCount + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if(currentCount == 0){
                return false;
            } magazineLetters.put(r,currentCount-1);
        }
        return true;
    }

    //time complexity = O(m)
    //space complexity = 0(1)
    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();

        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Can construct ransom note 1: " + ransomNote.canConstruct(ransomNote1, magazine1));
        System.out.println("Can construct ransom note 2: " + ransomNote.canConstruct2(ransomNote1, magazine1));
        System.out.println("----------");
        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Can construct ransom note 1: " + ransomNote.canConstruct(ransomNote2, magazine2));
        System.out.println("Can construct ransom note 2: " + ransomNote.canConstruct2(ransomNote2, magazine2));
        System.out.println("----------");
        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Can construct ransom note 1: " + ransomNote.canConstruct(ransomNote3, magazine3));
        System.out.println("Can construct ransom note 2: " + ransomNote.canConstruct2(ransomNote3, magazine3));
    }
}

