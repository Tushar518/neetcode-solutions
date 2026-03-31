class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        int[] resultArray = new int[nums.length];

        prefixArray[0] = 1;
        suffixArray[nums.length-1] = 1;

        int pr = 1;
        for(int i = 1; i<nums.length ; i++){
            pr = nums[i-1]*pr;
            prefixArray[i] = pr; 
        }

        int sr = 1;
        for(int i = nums.length-2; i>=0 ; i--){
            sr = nums[i+1]*sr;
            suffixArray[i] = sr;
        }

        for(int i=0;i<nums.length;i++){
            resultArray[i]= prefixArray[i]*suffixArray[i];
        }

        return resultArray;
    }
}  
