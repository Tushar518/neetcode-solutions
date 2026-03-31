class Solution {
    public int search(int[] nums, int target) {
        int low =0;
        int high = nums.length-1;
         while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the target is present at mid
            if (nums[mid] == target) {
                return mid;
            }

            // If target greater, ignore left half
            if (nums[mid] < target) {
                low = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }
        return -1;
        
    }
}
