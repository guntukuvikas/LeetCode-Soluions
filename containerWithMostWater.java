class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i,maxArea,area,j;
        i=maxArea=area=0;
        j=n-1;
        while(j>i){
            if(height[i]>height[j]){
                area=height[j]*(j-i);
                j--;
            }
            else{
                area=height[i]*(j-i);
                i++;
            }
            if(area>maxArea){
                maxArea=area;
            }
        }
        
        return maxArea;
    
    }
}
