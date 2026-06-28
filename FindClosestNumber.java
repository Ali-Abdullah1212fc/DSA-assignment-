

public class FindClosestNumber{

    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(nums[i]) < Math.abs(closest)) {
                closest = nums[i];}
            else if (Math.abs(nums[i]) == Math.abs(closest) && nums[i] > closest) {
                closest = nums[i];
            }}

        return closest;
    }

    public static void main(String[] args) {

        int[] nums = {-1,-5,4,3,1};

        System.out.println("Closest Number is " + findClosestNumber(nums));
    }
}