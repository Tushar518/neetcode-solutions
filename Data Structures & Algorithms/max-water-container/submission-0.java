class Solution {
    public int maxArea(int[] heights) {
        int i =0;
        int j = heights.length-1;
        List<Integer> areaList = new ArrayList<>();
        while(i<j){
           areaList.add((j-i)*minHeight(heights[i],heights[j]));
           if(minHeight(heights[i],heights[j])==(heights[i])){
            i++;
           }
           else{j--;}
        }
        int maxArea = Collections.max(areaList);
        return maxArea;
        
    }

    private int minHeight(int value1, int value2){
        if(value1<value2){
        return value1;
        }
        else{return value2;}
    }
}
