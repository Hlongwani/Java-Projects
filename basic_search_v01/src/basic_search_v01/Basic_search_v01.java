
package basic_search_v01;


public class Basic_search_v01 {


    public static void main(String[] args) {
       int array[]={13,64,32,86,46,962,41,547,45,27,48,63,13,563,12};
       int retIndex,valToSearchFor;
       valToSearchFor=41;
       retIndex = searchingArray(array,valToSearchFor);
        System.out.println("The value was found at index number " +retIndex);
       
      
    }

    private static int searchingArray(int[] array, int valToSearchFor) {
        int output;
        output=-1;      
        for(int i=0; i<array.length;i++){
        
            
            if( array[i]==valToSearchFor){
              
            output=i;
        
        }
        }
        return output;
    }
    
    
}
