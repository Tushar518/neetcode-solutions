class Solution {
    public boolean isPalindrome(String s) {
        String nonAlphaNumString = s.replaceAll("[^a-zA-Z0-9]","");
        if(nonAlphaNumString.length()==0){
            return true;
        }
        char[] charArray = nonAlphaNumString.toCharArray();
        int e = charArray.length-1;
        boolean check = false;
        for(int i=0;i<charArray.length;i++){
            if(i<=e){
                if(Character.toLowerCase(charArray[i])== Character.toLowerCase(charArray[e])){
                    e--;
                    check = true;
                }
                else{
                    return false;
                }

            }
            else{
               break;
            }
        }
        return check;
        
    }
}
