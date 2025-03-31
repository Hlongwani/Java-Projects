
package multithreading;


class biSearch implements Runnable{

    private int nums[],target,start,end;
    
    biSearch(int[] nums, int target, int start, int end) {
        this.nums=nums;
        this.target=target;
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
            System.out.println (target+" is found at index "+biSearch(nums, target,start,end));

    }

    public static int biSearch(int[] nums, int target, int start, int end) {
        
        
        while(start<=end){
            
            int mid=(start+end)/2;
            
            if(nums[mid]<target){
               return mid + 1;
                
            }else if(nums[mid]==target){
                return mid;
            }else{
                return mid-1;
            }
            
            
            
        }
        
        return -1;
    }
    
    
    
}
