class SelectionSort
{
    public static void swap(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
        // array[i1] = array[i1] + array[i2];
        // array[i2] = array[i1] - array[i2];
        // array[i1] = array[i1] - array[i2];
    }
    
    public static int[] sort(int[] array)
    {
        return sort(array, 0);
    }

    public static int[] sort(int[] array, int start)
    {
        int min_index = start;
        if(start<array.length-1)
        {
            for(int i = start; i < array.length; i++)
            {
                if(array[i]<array[min_index])
                {
                    
                    swap(array,i,min_index);
                    min_index = i;
                }
            }
            sort(array,start+1);
        }
        return array;
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
        int[] array = {3,6,1,8,2,4};
        print(array);
        sort(array);
        print(array);
    }
}