public class InsertionSort implements SortingAlgorithm {

    @Override
    //insertion sort overriding the sorting function in sorting algorightm
    public void sort(int[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp)
            {
                a[j + 1] = a[j];
                j--;
            } //while
            a[j+1] = temp;
        } //for
    }


}
