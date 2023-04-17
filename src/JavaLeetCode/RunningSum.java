package JavaLeetCode;

public class RunningSum {
    private int[] nums;
    public RunningSum(int[] nums){
        this.nums = nums;
    }

    public int[] runningSum() {
        int[] results = new int[nums.length];
        results[0] = nums[0];

        for (int i = 1; i < nums.length; i++){
            results[i] = nums[i] + results[i-1];
        }
        return results;
    }

    //time complexity = 0(n)
    //space complexity = 0(1)

    //overwritten input complexity
    public int[] runningSum2(int[] nums){
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
    //time complexity = 0(n)
    //Space complexity = 0(1)

    public void printResults(int[] results){
        for (int num:results){
            System.out.println(num + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        RunningSum runningSum = new RunningSum(nums);
        int[] results = runningSum.runningSum();
        runningSum.printResults(results);
    }
}
