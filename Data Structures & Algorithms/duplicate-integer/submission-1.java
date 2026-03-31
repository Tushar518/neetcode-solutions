class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Boolean> mapCheck = new HashMap<>();
        for(int ele:nums){
            if(mapCheck.get(ele)!=null){
                return true;
            }
            else{
                mapCheck.put(ele,true);
            }
            
        }
        return false;
 
    }
}
