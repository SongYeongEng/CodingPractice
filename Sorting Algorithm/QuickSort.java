/*Pseudo code
 * 2 function 
 * -partition
 * -sort
*/

public class QuickSort{

    public static void quickSort(int [] array,int low,int high){
        //wht is this ?
        if (low < high) {
        //partition array and get pivot index
        int pivotIndex = partition(array,low, high);
        
        //recursive sort the sub array
        quickSort(array,low, pivotIndex-1);
        quickSort(array, pivotIndex+1,high);
        }
    }

    public static int partition(int[] array, int low, int high){
        // pivot most right
        int pivot = array[high];

        //Index of the smaller element but this is weird because it need to do it for recursion
        int i = low -1;

        for(int j = low; j< high ; j++){
            //here need two pointer one one j i think i track 0 j for iteration
            if(array[j] <= pivot){
                i++;//already move so it's okay ? keep track big boi number cause if no it wont increment

                //swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        } 

        //swap pivot element
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;
        
        quickSort(array, 0, n - 1);
        
        System.out.println("Sorted array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

}