package st;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int d = 2;
        rotateUsingTempArray(array, d);
        System.out.println(Arrays.toString(array));
        List<String> al = new ArrayList<>();
    }

    private static void rotateUsingTempArray(int[] array, int d) {
        int[] tempArray = new int[array.length];
        int n = array.length - 1;
        for (int i = 0; i <= n; i++) {
            if (i + d <= n) {
                tempArray[i] = array[i + d];
            } else {
                int z = i - (d+1);
                tempArray[i] = array[z];
            }
        }
        System.arraycopy(tempArray, 0, array, 0, array.length);

    }
}
