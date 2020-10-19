class QuickSort{
    public static void sort(int[] arr)
    {
        sort(arr, 0, arr.length-1);
    }

    public static void sort(int[] arr, int start, int end)
    {
        int part2 = partition(arr, start, end);
        if(start < part2-1){
            sort(arr, start,part2 -1);
        }
        if(part2 < end) {
            sort(arr, part2, end);
        }
    }

    public static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[(start + end)/2];
        while (start <= end){
            while(arr[start] < pivot)
            {
                start++;
            }

            while (arr[end] > pivot)
            {
                end--;
            }

            if(start <= end)
            {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
        // array[i1] = array[i1] + array[i2];
        // array[i2] = array[i1] - array[i2];
        // array[i1] = array[i1] - array[i2];
    }

    public static void print(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
            if(i != array.length -1)
            {
                System.out.print(",");
            }
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int[] array = {3,5,4,6,2,1,7};

        print(array);
        sort(array);
        print(array);
    }
}