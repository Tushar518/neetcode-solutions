class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        Set<Integer> sortedSet = new LinkedHashSet<>();
        for (int num : nums){
            sortedSet.add(num);
        }
        Integer[] sortedList = new Integer[sortedSet.size()];
        sortedSet.toArray(sortedList);

        List<Integer> countArray = new ArrayList<>();

        int count =1;
        for (int i=0;i<sortedList.length;i++){
            if((i+1)<=sortedList.length-1){
            if(sortedList[i+1]==sortedList[i]+1){
                count++;
            }
            else{
                countArray.add(count);
                count =1;
            }
            }
            if(i==sortedList.length-1){
                countArray.add(count);
            }
        }

        return  Collections.max(countArray);
        
    }
}
