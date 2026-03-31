class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftPrefix = new int[nums.length];
        int[] rightSuffix = new int[nums.length];
        int[] prodResult = new int[nums.length];

        leftPrefix[0] = 1;
        rightSuffix[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            leftPrefix[i] =nums[i-1]*leftPrefix[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            rightSuffix[i]=nums[i+1]*rightSuffix[i+1];
        }

        for(int i=0;i<nums.length;i++){
            prodResult[i]=leftPrefix[i]*rightSuffix[i];
        }

        return prodResult;

    }
}  
