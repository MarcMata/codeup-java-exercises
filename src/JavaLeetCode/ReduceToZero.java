package JavaLeetCode;

public class ReduceToZero {
    public int numberOfSteps(int num){
        int steps = 0;
        while (num > 0){
            if (num % 2 == 0){
                num /= 2; // num = num /2;
            } else {
                num--;//remainder is 1
            }
            steps++;
        }
        return steps;
    }
    //halving step

    //subtraction step


//    time complexity: O(logn)
//    space complexity: O(1) - constant
}
