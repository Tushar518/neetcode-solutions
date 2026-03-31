class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        int[] freq = new int[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        int l =0;
        for(int i=0;i<s2.length();i++){
            freq[s2.charAt(i)-'a']--;
            while(i-l+1>s1.length()){
                freq[s2.charAt(l)-'a']++;
                l++;
            }
            if(i-l+1==s1.length() && allZero(freq)){
                return true;
            }
        }
        return false;
        
    }

    private boolean allZero(int[] freq){
        for(int n:freq){
            if(n!=0)return false;
        }
        return true;
    }
}
