class TimeMap {

    class Data {
        String value;
        int timestamp;
        Data(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }

    private Map<String, List<Data>> store;

    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList<>());
        store.get(key).add(new Data(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!store.containsKey(key)){
            return "";
        }
        List<Data> history = store.get(key);
        return binarySearchFloor(history, timestamp);
    }

    private String binarySearchFloor(List<Data> history, int target) {
        int low = 0;
        int high = history.size() - 1;
        String result = "";
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midTime = history.get(mid).timestamp;
            if (midTime == target) {
                return history.get(mid).value;
            } else if (midTime < target) {
                result = history.get(mid).value;
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
