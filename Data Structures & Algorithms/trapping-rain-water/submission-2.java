class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        int maxArea = 0;

        left[0] = 0;
        int leftMax = 0;
        for(int i=1;i<height.length;i++){
            left[i] = Math.max(leftMax,height[i-1]);
            leftMax = Math.max(left[i],leftMax);
        }

        right[height.length-1] = 0;
        int rightMax = 0;
        for(int i=height.length-2;i>=0;i--){
            right[i] = Math.max(rightMax,height[i+1]);
            rightMax = Math.max(right[i],rightMax);
        }

        for(int i=0;i<height.length;i++){
            if(left[i]>height[i] && right[i]>height[i]){
                maxArea+= (Math.min(left[i],right[i])-height[i]);
            }
        }
        return maxArea;
    }
}
