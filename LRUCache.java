class LRUCache {

    List<Integer> list;
    Map<Integer, Integer> map;
    int cap;
    public LRUCache(int capacity) {
        cap = capacity;
        list = new ArrayList<Integer>(capacity);
        map = new HashMap<Integer, Integer>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        else
        {
            int index = list.indexOf(key);
            list.remove(index);
            list.add(key);
            return map.get(key);
        }
    }
    
    public void put(int key, int value) {
        if (get(key) != -1) 
        {
            map.put(key, value);
            return;
        }
        
        if(list.size() == cap)
        {
            int removedKey = list.get(0);
            list.remove(0);
            map.remove(removedKey);     
        }
        list.add(key);
        map.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */