
package merge_sort_v002;

public class Merge_sort_v002 {

    
    public static void main(String[] args) {
        
        int inputArray[] ={12,44,343,54,36,43,654,65,4,54,64,654,65,12,94};
        
        int retArr[];
        retArr=mergeSort(inputArray);
        
        
    }

    private static int[] mergeSort(int[] inputArray) {
        int output[]= new int [inputArray.length];
        int leftArr[];
        int rightArr[];
        
        leftArr= arrayCopy(inputArray,0,inputArray.length/2);
         rightArr= arrayCopy(inputArray,inputArray.length/2,inputArray.length);
        
        return output;
    }

    private static int[] arrayCopy(int [] inputArray,int startIndex, int endIndex) {
        int output[] = new int [endIndex- startIndex];
        
       return output; 
    }
    
    
    
}
