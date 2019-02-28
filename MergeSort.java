public class MergeSort implements SortingAlgorithm{


    @Override //overriding the sort function in order to perform merge sort
    public void sort(int[] a) {
        int li = 0;
        int ri = a.length-1;
        mergeSort(a, li, ri);
    }

    //merge sort function that is recursively called for both the left and right side of the array
    public void mergeSort(int[] arr, int l, int r)
    {
        //base case
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        } //if
    }


    public void merge(int arr[], int l, int m, int r) {
        int num1 = m - l + 1;
        int num2 = r - m;

        int left[] = new int[num1];
        int right[] = new int[num2];

        for (int i = 0; i < num1; ++i)
        {
            left[i] = arr[l + i];
        } //for

        for (int j = 0; j < num2; ++j)
        {
            right[j] = arr[m + 1 + j];
        } //for

        int ai = 0;
        int bi = 0;
        int num3 = l;

        while (ai < num1 && bi < num2)
        {
            if (left[ai] <= right[bi])
            {
                arr[num3] = left[ai];
                ai++;
            } //if

            else
            {
                arr[num3] = right[bi];
                bi++;
            } //else

            num3++;

        } //while

        while (ai < num1)
        {
            arr[num3] = left[ai];
            ai++;
            num3++;
        } //while

        while (bi < num2)
        {
            arr[num3] = right[bi];
            bi++;
            num3++;
        } //while



    }


}
