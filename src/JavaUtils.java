public class JavaUtils {
    public static void main(String[] args) {
        System.out.println(randomNumber(12,100));
        System.out.printf("%n%n%nWe will sum");
    }
    private static int sumOfNumbersMethod(int number) {
        if (number == 0) {
            return number;
        } else {
            return number + sumOfNumbersMethod(number - 1);
        }
    }
    private static boolean isPalindromeMethod(String word) {
        if (word.length() == 0 || word.length() == 1){
            return true;
        }
        if (word.charAt(0) == word.charAt(word.length() -1)){
            return isPalindromeMethod(word.substring(1,word.length()-1));
        }
        return false;
    }
    //racecar
    public static long randomNumber(int min, int max) {
        long randomNumero = (long)(Math.random() * (max - min + 1)) + min;
        return randomNumero;
    }
}
