class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<Integer>();
        int index=0;
        int swaps=0;
        
        int newIndex;
        while(swaps<=nums.length && index<nums.length)
        {
            newIndex=nums[index]-1;
            if(nums[newIndex]==nums[index])
            {
                index++;
            }
            else
            {
                int temp=nums[index];
                nums[index]=nums[newIndex];
                nums[newIndex]=temp;
                swaps++;
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]!=i+1)
            {
                missingNumbers.add(i+1);
            }
        }
        return missingNumbers;
    }
}