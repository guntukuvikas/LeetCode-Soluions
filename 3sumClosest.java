class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int len = nums.length;
        int closest = nums[0]+nums[1]+nums[2];
        for(int i=0;i<len-2;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
                int left = i+1;
                int right = len-1;
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum == target)
                        return target;
                    else {
                        if(Math.abs(sum-target)<Math.abs(closest-target)){
                            closest = sum;
                        }
                        
                        if(sum>target){
                            right--;
                        }
                        else{
                            left++;
                        }
                    }
                    
                }
                
                
        }
        
        return closest;
        
    }
}
