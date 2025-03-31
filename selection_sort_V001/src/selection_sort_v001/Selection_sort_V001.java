
package selection_sort_v001;

public class Selection_sort_V001 {

 
    public static void main(String[] args) {
       int group[]= { 52,53,15,86,38,5,13,97,45,76,34,763,57,347,55,467,3,4,65,241};
       int temp;
       for(int blue=0;blue<(group.length -1);blue++){
        
            for(int green=(blue+1);green<(group.length);green++){
                if(group[blue]< group[green]){
                    temp=group[blue];
                    group[blue]=group[green];
                    group[green]=temp;
                }
                
            }
    }
       printArr(group);
    }

    private static void printArr(int[] group) {
         for(int i=0; i<group.length;i++){
             System.out.println(i+"]=" + group[i]);
            
        }
    }
    
}
