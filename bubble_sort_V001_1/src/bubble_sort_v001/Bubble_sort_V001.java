
package bubble_sort_v001;


public class Bubble_sort_V001 {

    public static void main(String[] args) {
        int info[]={23,54,15,97,17,2,17,41,815,7845,561,755,35};
        
        for(int count=0;count<info.length;count++){
       hSort(info);
        
    }
        printArr(info);
    }

    private static void hSort(int[] info) {
          int temp,j;
       for(int i=0;i<(info.length-1);i++){
        
           j=i+1;
           if(info[i]>info[j]){
               
                 temp=info[i];
                    info[i]=info[j];
                    info[j]=temp;
               
           }
           
    }
        
    }

    private static void printArr(int inputArr[]) {
      for(int i=0; i<inputArr.length;i++){
             System.out.println(i+"]=" + inputArr[i]);
            
        }
    }
    
    
}
