class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length-1;
        if(nums.length==0){
            return -1;
        }
        int low =0;
        while(low<=high){
            int mid = low + ((high-low)/2);
            if(nums[mid]>target){
                high = mid-1;
            }
            if(nums[mid]<target){
                low = mid+1;
            }
            if(nums[mid]==target){
                return mid;
            }
        }
        return -1;
    }
}
