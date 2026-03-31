class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            int[] freqArray = new int[26];
            for(char c: str.toCharArray()){
                freqArray[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i:freqArray){
                sb.append(i);
                sb.append("#");
            }

            if(!map.containsKey(sb.toString())){
                map.put(sb.toString(),new ArrayList<String>());
            }

            map.get(sb.toString()).add(str);

        }

        return new ArrayList(map.values());
    }
}
