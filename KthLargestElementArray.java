class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b)
            {
                return b-a;
            }
        });
        
        int limit = nums.length - k + 1;
        for(int num : nums)
        {
            pq.add(num);
            if(pq.size()>limit)
            {
                pq.poll();
            }
        }
        return pq.poll();
    }
}