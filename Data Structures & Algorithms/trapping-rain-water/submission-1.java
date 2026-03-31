class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] left = new int[len];
        int[] right = new int[len];

        int maxleft =0;
        int maxright =0;

        left[0]=0;
        for(int i=1;i<len;i++){
            if(height[i-1]>maxleft){
                maxleft=height[i-1];
            }
            left[i]=maxleft;
        }

        right[len-1]=0;
        for(int i=len-2;i>=0;i--){
            if(height[i+1]>maxright){
                maxright=height[i+1];
            }
            right[i]=maxright;
        }

        int maxArea=0;

        for(int i =0;i<len;i++){
            if(right[i]>height[i] && left[i]>height[i]){
                maxArea += (Math.min(right[i],left[i])-height[i]);
            }
        }

        return maxArea;
        
    }
}
