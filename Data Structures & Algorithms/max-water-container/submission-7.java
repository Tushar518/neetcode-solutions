class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length-1;

        int totalArea = 0;

        while(left<right){
            if(heights[left]<heights[right]){
                int area = (right-left) * (heights[left]);
                totalArea = Math.max(totalArea,area);
                left++;
            }
            else{
                int area = (right-left) * heights[right];
                totalArea = Math.max(totalArea,area);
                right--; 
            }
        }
        return totalArea;
        
    }
}
