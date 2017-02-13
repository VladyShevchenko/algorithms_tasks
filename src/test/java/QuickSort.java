import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class QuickSort {

    private static String quickSort(int [] inputArray, int first, int last){
        if(first < last){
            int q = partition(inputArray, first, last);
            quickSort(inputArray, first, q-1);
            quickSort(inputArray, q+1, last);
        }
        return Arrays.toString(inputArray);
    }

    private static int partition(int [] inputArray, int first, int last){

        int q = inputArray[last];
        int i = first - 1;

        for(int j = first; j <= last-1; j++){
            if(inputArray[j] <= q){
                i++;
                int ivalue = inputArray[i];
                int jvalue = inputArray[j];
                inputArray[i] = jvalue;
                inputArray[j] = ivalue;
            }
        }

        int ivalue  = inputArray[i+1];
        inputArray[last] = ivalue;
        inputArray[i+1] = q;

        return i+1;
    }

    @Test
    public static void checkQuickSort(){
        int [] array = {5, 2, 3, 10, 1};
        assertEquals("[1, 2, 3, 5, 10]", quickSort(array, 0, array.length-1));
        System.out.println(quickSort(array, 0, array.length-1));
    }

    private String easyQuickSort(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        return Arrays.toString(a);
    }

    @Test
    public void checkEasyQuickSort(){
        assertEquals("[1, 2, 3, 5, 10]", easyQuickSort(new int[]{5, 2, 3, 10, 1}));
    }
}
