class Solution {
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int key : map.keySet())
        {
            list.add(key);
        }
        
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b)
            {
                return map.get(b)-map.get(a);
            }
        });
        
        return list.size()>k?list.subList(0,k): list;
        
    }
}

/*
// Solution 2
class Solution {
    
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new Comparator<Integer>(){
            public int compare(Integer a, Integer b)
            {
                return map.get(a)-map.get(b);
            }
        });
        
        for(int key : map.keySet())
        {
            pq.add(key);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        
        List<Integer> list = new ArrayList<Integer>();
        while(pq.size()!=0)
        {
            list.add(pq.poll());
        }
        
        Collections.reverse(list);
        return list;
    }
}
*/