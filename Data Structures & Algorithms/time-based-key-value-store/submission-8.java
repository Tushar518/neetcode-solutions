class TimeMap {

    private Map<String,List<Pair>> map;
    private class Pair{
        String value;
        int timeStamp;
        Pair(String value,int timeStamp){
            this.value=value;
            this.timeStamp=timeStamp;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<Pair> pairs = map.get(key);
        int left = 0;
        int right = pairs.size()-1;
        String result = "";
        while(left<=right){
            int mid = left + ((right-left)/2);
            if(pairs.get(mid).timeStamp<=timestamp){
                result = pairs.get(mid).value;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return result;
    }
}
