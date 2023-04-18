package JavaLeetCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return ""; // return empty string if input is null or empty
        }

        String prefix = strs[0]; // initialize prefix with first string in the array

        for (int i = 1; i < strs.length; i++){
//            System.out.println(strs[i]);//never see's flower because it starts at one
            while(strs[i].indexOf(prefix) != 0){
                // keep removing last character from prefix until it becomes a prefix of strs[i]
                prefix = prefix.substring(0, prefix.length() - 1);
//                System.out.println(prefix);
//                System.out.println(strs[i]);
                if(prefix.isEmpty()){
                    return "";// return empty string if no common prefix found
                }
            }
        }
        return prefix;// return longest common prefix
    }
    public static void main(String[] args) {
        // Test cases
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"", "abc", "abcdef"};

        LongestCommonPrefix solution = new LongestCommonPrefix();

        System.out.println("Longest common prefix for strs1: " + solution.longestCommonPrefix(strs1)); // Expected output: "fl"
        System.out.println("Longest common prefix for strs2: " + solution.longestCommonPrefix(strs2)); // Expected output: ""
        System.out.println("Longest common prefix for strs3: " + solution.longestCommonPrefix(strs3)); // Expected output: ""
    }
}
