class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        boolean isOdd = false;
        int median1 = 0;
        int median2 = 0;
        if((len1+len2)%2!=0)
            isOdd = true;
        int i=0,j=0,count=0;
        int mid = (len1+len2)/2;
        while(i<len1 && j<len2 && count<=mid){
            median2=median1;
            if(nums1[i]<nums2[j]){
                median1 = nums1[i];
                i++;
            }
            else{
                median1 = nums2[j];
                j++;
            }
            count++;
        }
        
        
        
        if(count<mid){
            if(i == len1){
                if(isOdd){
                    return nums2[mid-count+j]/1.0;
                }
                else{
                    return (nums2[j+mid-count]+nums2[j+mid-count-1])/2.0;
                }
            }
            else{
                if(isOdd){
                    return nums1[i+mid-count]/1.0;
                }
                else{
                    return (nums1[i+mid-count]+nums1[i+mid-count-1])/2.0;
                }
            }
        }
        else if(count==mid){
            if(isOdd){
                if(i==len1){
                    return nums2[j];
                }
                else{
                    return nums1[i];
                }
            }
            else{
                if(i==len1){
                    return (nums2[j]+median1)/2.0;
                }
                else{
                    return (nums1[i]+median1)/2.0;
                }
            }
                
        }
        else{
            if(isOdd){
                return median1;
            }
            else{
                return (median1+median2)/2.0;
            }
        }
        
        
    }
}
