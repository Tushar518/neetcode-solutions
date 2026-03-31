class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] freqCount = new int[26];

        for(int r=0;r<s.length();r++){
            freqCount[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freqCount[s.charAt(r)-'A']);
            while(((r-left+1)-maxFreq)>k){
                freqCount[s.charAt(left)-'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,r-left+1);
        }
        return maxLength;
    }
}
