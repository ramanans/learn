public static void reverseArray(final int[] array) {
        if (array == null) {
            return;
        }
        int tmp;
        int j = array.length;
        while (j > 0) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }
