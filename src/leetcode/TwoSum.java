package leetcode;

public class TwoSum {
	
	
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i=0; i <= nums.length-1; i++) {
            for (int j=1; j <= nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i=0; i <= nums.length-1; i++) {
            for (int j=1; j <= nums.length-1; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }
}