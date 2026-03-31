class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()){
            return "";
        }

        int[] freq = new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }

        int left=0;
        int right=0;
        int start=0;
        int required =t.length();
        int minLen = Integer.MAX_VALUE;
        while(right<s.length()){
            char rChar = s.charAt(right);
            if(freq[rChar]>0){
                required--;
            }
            freq[rChar]--;
            right++;
            while(required==0){
                if(minLen>right-left){
                    minLen=right-left;
                    start=left;
                }
                char lChar = s.charAt(left);
                freq[lChar]++;
                if(freq[lChar]>0){
                    required++;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
