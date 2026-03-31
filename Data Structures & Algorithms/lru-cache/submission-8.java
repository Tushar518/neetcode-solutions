class LRUCache {

    private class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> cache;
    private Node tail;
    private Node head;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        tail = new Node(0,0);
        head = new Node(0,0);

        tail.prev = head;
        head.next = tail;
        
    }
    
    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }
        Node node = cache.get(key);

        removeNode(node);
        addToFront(node);

        return node.value;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            node.value = value;

            removeNode(node);
            addToFront(node);
            return;
        }

        Node addNode = new Node(key,value);
        cache.put(key,addNode);
        addToFront(addNode);

        if(cache.size()>capacity){
            Node lruNode = tail.prev;
            removeNode(lruNode);
            cache.remove(lruNode.key);
        }
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addToFront(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
}
