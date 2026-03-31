class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        ArrayList<Integer> values = new ArrayList<>();
        for(int data:set){
            values.add(data);
        }
        Collections.sort(values);
        int count =1;
        int maxValue = count;
        for(int i=1;i<values.size();i++){
            if((values.get(i-1))==(values.get(i)-1)){
                count ++;
                if(maxValue<count){
                    maxValue=count;
                }
            }else{
                count =1;
            }
        }

        return maxValue;
    }
}
