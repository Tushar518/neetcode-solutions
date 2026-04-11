class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        {return "";}

        int[] freq = new int[128];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }
        int left =0;
        int right=0;
        int start =0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        while(right<s.length()){
            if(freq[s.charAt(right)]>0){
                required--;
            }
            freq[s.charAt(right)]--;
            right++;
            while(required==0){
                if(minLen>right-left){
                    minLen = right-left;
                start = left;
                }
                freq[s.charAt(left)]++;
                if(freq[s.charAt(left)]>0){
                    required++;
                }
                left++;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
