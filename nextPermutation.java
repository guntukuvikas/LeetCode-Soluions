class Solution {
    public void nextPermutation(int[] nums) {
        int sortStart = 0;
        
        for(int i = nums.length-1;i>0;i--){
                if(nums[i]>nums[i-1]){
                    sortStart = i;
                    break;
                }
        }
        
        Arrays.sort(nums,sortStart,nums.length);
        if(sortStart>0){
            for(int i=sortStart;i<nums.length;i++){
            if(nums[i]>nums[sortStart-1]){
                int temp = nums[i];
                nums[i] = nums[sortStart-1];
                nums[sortStart-1] = temp; 
                break;
            }
        }
            
        }
          
        
    }
}
