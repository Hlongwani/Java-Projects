
package testtt3;


class BubbleSort implements Runnable{

    private int nums[];
    
    BubbleSort(int[] nums) {
        this.nums=nums;
    }

    
    
    @Override
    public void run() {
        BubbleSort(nums);
    }

    public static void BubbleSort(int nums[]) {
        int temp;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j+1]<nums[j]){
                    temp=nums[j+1];
                    nums[j+1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
    
    
}
