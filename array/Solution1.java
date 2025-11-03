package array;
import java.util.Arrays;

// ====MInimun Difference Between Highest abd Lowest of K Scores====

//You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.
//
//Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.
//
//Return the minimum possible difference.


class Solution1 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        if(nums.length <= 1)
            return 0;

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int diff = nums[i + k - 1] - nums[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;

    }
}
