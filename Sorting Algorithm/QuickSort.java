/*Pseudo code
 * 2 function 
 * -partition
 * -sort
*/

public class QuickSort{

    public static void quickSort(int [] array,int high,int low){

        //partition array and get pivot index
        int pivotIndex = partition(array,high, low);
        
        //recursive sort the sub array
        quickSort(array,low, pivotIndex-1);
        quickSort(array, pivotIndex+1,high);
    }

    public static void partition(int[] array, int low, int high){
        // pivot most left
        int pivot = array[high];

        //Index of the smaller element but this is weird because it need to do it for recursion
        int i = low -1;

        for(int j = low; j< high ; j++){
            //here need two pointer one one j i think i track 0 j for iteration
            if(array[j] <= pivot){
                i++;//already move so it's okay ?

            }

        } 

    }

}