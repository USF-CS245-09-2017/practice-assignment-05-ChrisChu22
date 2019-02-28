public class QuickSort implements SortingAlgorithm{

    //function to quick sort and uses partition
    void quicksort (int [] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quicksort(arr, left, p-1);
            quicksort(arr, p+1, right);
        } //if
    }

    //this function splits the array and chooses different pivots each time
    int partition (int [] arr, int left, int right) {
        if (left < right) {
            int pivot = left;
            int i = left + 1;
            int j = right;
            while (i < j) {
                while (i <= right && arr[i] <= arr[pivot]) {
                    ++i;
                } //while
                while (j >= i && arr[j] > arr[pivot]) {
                    --j;
                } //while
                if (i <= right && i < j) {
                    swap(arr, i, j);
                } //if
            } //while
            swap(arr, pivot, j);  // pivot to the middle
            return j;
        } //if
        return left;
    }


    @Override //overriding the sort method in the interface sorting algorithm
    public void sort(int[] a) {
        quicksort(a, 0, a.length - 1);
    }

    //swap function that just swaps 2 number in the array
    void swap(int[] b, int i, int j) {
        int temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }
}
