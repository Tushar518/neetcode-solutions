class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            int[] count = new int[26];

            for(char c: word.toCharArray()){
                count[c-'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int num : count){
                sb.append("#");
                sb.append(num);
            }

            String key = sb.toString();

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
