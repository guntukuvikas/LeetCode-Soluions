class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        if(len<2){
            return len;
        }
        
        int slow = 1,fast = 1;
        
        while(fast<len){
            while(fast<len && nums[fast]==nums[fast-1]){
                fast++;
            }
            
            if(fast>=len)
                break;
            
            nums[slow] = nums[fast];
            slow++;
            fast++;
        }
        
        return slow;
    }
}
