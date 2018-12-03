class Node
{
    public int key;
    public int value;
    public Node(int k, int v)
    {
        key = k;
        value = v;
    }
}
class MyHashMap {
    private Node[] buckets;
    private int bucketSize;
    
    private int getBucket(int key)
    {
        return Integer.hashCode(key) % bucketSize;
    }

    /** Initialize your data structure here. */
    public MyHashMap() {
        bucketSize = 1000000;
        buckets = new Node[bucketSize];
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index = getBucket(key);
        buckets[index] = new Node(key, value);
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = getBucket(key);
        if(buckets[index] == null)
        {
            return -1;
        }
        else
        {
            return buckets[index].value;
        } 
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index = getBucket(key);
        buckets[index] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */