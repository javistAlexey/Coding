package code.LeedCode;

import java.util.Arrays;

/**
 * 88. Merge Sorted Array
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively. *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order. *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Example 1:
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * <p>
 * Example 2:
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * <p>
 * Example 3:
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class _88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums3 = {2, 5, 6};
        int m = 3;
        int n = 3;

        System.out.println(Arrays.toString(merge(nums1, m, nums3, n)));

    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            return nums2;
        }
        if (n == 0) {
            return nums1;
        }

        int[] res = new int[m + n];

        int index = n > m ? n : m;
        int iM = 0;
        int iN = 0;

        while (iM < m && iN < n) {
            if (nums1[iM] < nums2[iN]) {
                res[iM + iN] = nums1[iM];
                if (iM < m) {
                    iM++;
                }
            } else {
                res[iM + iN] = nums2[iN];
                if (iN < n) {
                    iN++;
                }
            }
        }

        if (iM == m) {
            for (int j = 0; j < n - iN; j++) {
                res[iM + iN + j] = nums2[iN + j];
            }
        } else {
            for (int j = 0; j < m - iM; j++) {
                res[iN + iM + j] = nums1[iM + j];
            }
        }
        nums1= Arrays.copyOf(res,res.length);
        System.out.println(Arrays.toString(nums1));
        return res;

    }

}
