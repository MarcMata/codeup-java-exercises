package JavaLeetCode;

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts){
        int maxWealthSoFar = 0;

        for (int[] customer: accounts){
            int currentCustomerWealth = 0;

            for (int bank : customer){
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }
    //Time Complexity: O(n x m);
    //Space Complexity: O(1) - constant
    public static void main(String[] args) {
        int[][] accounts1 = {{1, 2, 3}, {3, 5, 1}}; // 6
        RichestCustomerWealth richestCustomerWealth1 = new RichestCustomerWealth();
        int maxWealth1 = richestCustomerWealth1.maximumWealth(accounts1);
        System.out.println("Maximum wealth: " + maxWealth1);

        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}}; // 10
        RichestCustomerWealth richestCustomerWealth2 = new RichestCustomerWealth();
        int maxWealth2 = richestCustomerWealth2.maximumWealth(accounts2);
        System.out.println("Maximum wealth: " + maxWealth2);
    }
}
