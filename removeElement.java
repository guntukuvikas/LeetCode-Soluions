class Solution {
    public int removeElement(int[] num, int val) {
        
        int count = 0;
        int i=0;
        int j=num.length -1;
        
        while(i<=j){
            if(num[i]==val){
                while(i<=j && num[j]==val){
                    j--;
                }
                if(j<i)
                    break;
                num[i]=num[j];
                j--;
            }
            count++;
            i++;
        }
        return count;
        
    }
}
