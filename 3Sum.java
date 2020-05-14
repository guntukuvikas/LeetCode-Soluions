class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        
        List<List<Integer>> tripletList = new ArrayList<>();
        int i,j,k,len;
        i=j=0;
        len = num.length;
        Arrays.sort(num);
        List<Integer> triplet;
        for(i=0;i<len-2;i++){
            j=i+1;
            k=len-1;
            if(i>0 && num[i] == num[i-1])
                continue;
            while(j<k){
                if(num[i]+num[j]+num[k] == 0){
                    triplet = new ArrayList<>();
                    triplet.add(num[i]);
                    triplet.add(num[j]);
                    triplet.add(num[k]);
                    tripletList.add(triplet);
                    j++;
                    k--;
                    while(j<k && num[j]==num[j-1]){
                        j++;
                    }
                    while(j<k && num[k] == num[k+1]){
                        k--;
                    }
                    
                    
                }
                else if(num[i]+num[j]+num[k] < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        
        
        return tripletList;
        
    }
}
