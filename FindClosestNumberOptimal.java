
public class FindClosestNumberOptimal {

    public static int findClosestNumber(int[] nums) {

        int ans = Integer.MAX_VALUE;

        for (int num : nums) {

            if (Math.abs(num) < Math.abs(ans)) {
                ans = num;}
            else if (Math.abs(num) == Math.abs(ans) && num > ans) {
                ans = num;
            }}

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {-4,-5,-1,3,7,1};

        System.out.println(findClosestNumber(nums));
    }
}