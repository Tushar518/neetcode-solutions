class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest =0;
        for(int val:set){
            if(!set.contains(val-1)){
                int currValue = val;
                int currStreak = 1;
                while(set.contains(currValue+1)){
                    currValue++;
                    currStreak++;
                }
                if(longest<currStreak){
                    longest=currStreak;
                }
            }
        }
        return longest;
    }
}
