class Solution {
    public int trap(int[] height) {
        int trappedWater = 0;
        int[] leftHeight = height;
        int[] rightHeight = height; 
        for(int i=1;i<(height.length-1);i++){
            int maxLeftHeight = maxHeight(i,true,false,height);
            int maxRightHeight = maxHeight(i,false,true,height);
            System.out.println("Index: " +i+ " maxLeftHeight: "+maxLeftHeight+ " maxRightHeight: "+maxRightHeight+ " Height of index: " +height[i]);
            if(height[i]<maxLeftHeight && height[i]<maxRightHeight){
                System.out.println("Index: "+i+" came for validation");
                trappedWater +=minHeight(maxLeftHeight,maxRightHeight)-height[i];
            }
        }
        return trappedWater;
    }

    private int maxHeight(int index,boolean isLeft,boolean isRight,int[] height){
        int maxValue = 0;
        if(isLeft==true){
            for(int j=0;j<index;j++){
                if(maxValue<=height[j]){
                    maxValue = height[j];
                }
            }
        }
        if(isRight==true){
            for(int j=index+1;j<height.length;j++){
                if(maxValue<=height[j]){
                    maxValue = height[j];
                }
            }
        }
        return maxValue;
    }

    private int minHeight(int l,int r){
        if(l<r){
            return l;
        }
        else{
            return r;
        }
    }
}
