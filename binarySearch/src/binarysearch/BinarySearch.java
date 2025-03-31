package binarysearch;


public class BinarySearch {

    
    public static void main(String[] args) {
        int nums[]={2,3,5,7,9,12,45,50,60};
        int target=12;
        int start=0;
        int end=nums.length-1;
        System.out.println(target + " is found at index " + biSearch(nums,target,start,end));
        
        
    }

    private static int biSearch(int[] nums, int target,int start, int end) {
        
        
        
        while(start<=end){
            
            int mid=(start+end)/2;
            
          if(nums[mid]<target){
                return mid+1;
            }
          else if(nums[mid]==target){
              return mid;
          }else{
              end= mid-1;
          }
        }
        
        return -1;
    }
    
    
    
}
