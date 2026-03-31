class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            if((target-numbers[right])<numbers[left]){
                right--;
            }
            if((target-numbers[right])>numbers[left]){
                left++;
            }
            if((target-numbers[right]) == numbers[left]){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }
        }
        return result;
    }
}
