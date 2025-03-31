package linearsearch;


public class LinearSearch {

   
    public static void main(String[] args) {
        int nums[]={2,3,5,7,9,12,45,50,60};
        int target=2;
        
        
        System.out.println(target+ " is found at index "+ linearSearch(nums,target));
    }

    private static int linearSearch(int[] nums, int target) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                
                return i;
            }
        }
        return -1;
    }
    
    
}
