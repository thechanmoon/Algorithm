class BubbleSort {
    int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public int[] sort() {
        return sort(array.length);
    }

    public int[] sort(int last) {
        if (last > 0) {
            for (int i = 1; i < last; i++) {
                if (array[i] < array[i - 1]) {
                    swap(i, i - 1);
                }
            }
            sort(last - 1);
        }
        return array;
    }

    public void swap(int i1, int i2) {
        int temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
        // array[i1] = array[i1] + array[i2];
        // array[i2] = array[i1] - array[i2];
        // array[i1] = array[i1] - array[i2];
    }

    static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    // swap(a[j], a[j + 1]);
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                }
            }

        }
        return a;
    }
}