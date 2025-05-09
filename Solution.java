import java.util.*;

public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        if (n1 > n2) return findMedianSortedArrays(nums2, nums1);

        int low = 0;
        int high = n1;
        int left = (n1 + n2 + 1) / 2;
        int n = n1 + n2;

        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 < n1) r1 = nums1[mid1];
            if (mid2 < n2) r2 = nums2[mid2];
            if (mid1 - 1 >= 0) l1 = nums1[mid1 - 1];
            if (mid2 - 1 >= 0) l2 = nums2[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 != 0) {
                    return Math.max(l1, l2);
                } else {
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
                }
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter first sorted array (space-separated): ");
        String[] input1 = sc.nextLine().split(" ");
        int[] nums1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();

        System.out.print("Enter second sorted array (space-separated): ");
        String[] input2 = sc.nextLine().split(" ");
        int[] nums2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();

        double result = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + result);
    }
}
