class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> resultList = new ArrayList<>();
        
        int len = nums.length;
        if(len<4)
            return resultList;
        Arrays.sort(nums);
        
        for(int i = 0;i < len-3; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<len-2;j++){
                if(j!=i+1 && nums[j]==nums[j-1])
                    continue;
                int left = j+1;
                int right = len-1;
                while(left<right){
                    if(nums[i]+nums[j]+nums[left]+nums[right] == target){
                        List<Integer> numList = new ArrayList<>();
                        numList.add(nums[i]);
                        numList.add(nums[j]);
                        numList.add(nums[left]);
                        numList.add(nums[right]);
                        resultList.add(numList);
                        left++;
                        right--;
                        while(left<right && nums[left]==nums[left-1])
                            left++;
                        while(left<right && nums[right] == nums[right+1])
                            right--;
                    }
                    else if(nums[i]+nums[j]+nums[left]+nums[right] <target)
                        left++;
                    else
                        right--;
                    
                }
                
            }
        }
        
        return resultList;
        
    }
}
