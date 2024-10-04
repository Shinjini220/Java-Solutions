//Given a rotated sorted array, return the index of a target value. If it's not found, return -1.

public class RotatedSortedArraySearch {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Left portion is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;  // Target is in the left half
                } else {
                    left = mid + 1;   // Target is in the right half
                }
            }
            // Right portion is sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;   // Target is in the right half
                } else {
                    right = mid - 1;  // Target is in the left half
                }
            }
        }

        // Target is not present
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}