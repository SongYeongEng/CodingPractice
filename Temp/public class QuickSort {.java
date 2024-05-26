public class QuickSort {

    // Main function to perform QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort the sub-arrays
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    // Function to partition the array and return the pivot index
    private static int partition(int[] array, int low, int high) {
        // Choose the last element as pivot
        int pivot = array[high];
        
        // Index of the smaller element
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (array[j] <= pivot) {
                i++;
                
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap the pivot element with the element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }

    // Main method to test the QuickSort algorithm
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
