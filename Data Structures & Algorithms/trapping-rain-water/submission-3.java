class Solution {
    public int trap(int[] height) {
        int[] lh = new int[height.length];
        int[] rh = new int[height.length];

        int leftMax = 0;
        int rightMax = 0;

        lh[0] = 0;
        for(int i=1;i<height.length;i++){
            leftMax = Math.max(height[i-1],leftMax);
            lh[i] = leftMax;
        }

        rh[height.length-1] = 0;
        for(int i=height.length-2;i>=0;i--){
            rightMax = Math.max(height[i+1],rightMax);
            rh[i] = rightMax;
        }

        int totalArea = 0;
        for(int i=0;i<height.length;i++){
            int water = Math.min(lh[i],rh[i]) - height[i];
            if(water>0){
            totalArea = totalArea + water;}
        }

        return totalArea;
    }
}
