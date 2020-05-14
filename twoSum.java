class Solution {
    public int[] twoSum(int[] nums, int target) {
       
        int result[] = new int[2];
        HashMap<Integer,Integer> numMap = new HashMap<>();
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=target-nums[i];
            if(!numMap.isEmpty() && numMap.containsKey(temp)){
                if(i>numMap.get(temp)){
                    result[1]=i;
                    result[0]=numMap.get(temp);   
                }
                else{
                    result[0]=i;
                    result[1]=numMap.get(temp);
                }
                
                return result;
            }
            numMap.put(nums[i],i);
        }
        return result;
    }
}
