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
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }
        List<Pair> list = map.get(key);
        int left = 0;
        int right = list.size()-1;
        String result = "";
        while(left<=right){
            int mid = left+((right-left)/2);
            if(list.get(mid).timeStamp<=timestamp){
                result = list.get(mid).value;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return result;
    }
}
