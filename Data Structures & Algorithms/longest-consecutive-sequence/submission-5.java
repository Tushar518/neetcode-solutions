class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int longest = 0;

        for(int value:set){
            if(!set.contains(value-1)){
                int currentValue = value;
                int currStreak = 1;

                while(set.contains(currentValue+1)){
                    currentValue++;
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
