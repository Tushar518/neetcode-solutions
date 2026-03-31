class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> checkMap = new HashMap<>();
        for(int num:nums){
            checkMap.put(num,checkMap.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:checkMap.entrySet()){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
 
    }
}
