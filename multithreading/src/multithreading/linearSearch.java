package multithreading;


class linearSearch implements Runnable {

    
    private int target;
    private int nums[];
    linearSearch(int[] nums, int target) {
      this.target=target;
      this.nums=nums;
    }

    @Override
    public void run() {
      
        
         System.out.println(target+ " is found at index "+ linearSearch(nums,target));
    }

    public int linearSearch(int nums[],int target) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        
        return -1;
    }
    
}
