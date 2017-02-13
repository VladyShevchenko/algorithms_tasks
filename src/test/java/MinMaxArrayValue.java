import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MinMaxArrayValue {

    private int easyFindMinArrayValue(int[] a) {
        int min = Arrays.stream(a).min().getAsInt();
        System.out.println("Min array value: " + min);
        return min;

    }

    private int easyFindMaxArrayValue(int[] a) {
        int max = Arrays.stream(a).max().getAsInt();
        System.out.println("Max array value: "+ max);
        return max;
    }

    private int findMinArrayValue(int[] a){
        int result = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] < result){
                result = a[i];
            }
        }
        System.out.println("Min array value: "+result);
        return result;
    }

    private int findMaxArrayValue(int[] a){
        int result = a[0];
        for (int i = 0; i < a.length; i++){
            if (a[i] > result){
                result = a[i];
            }
        }
        System.out.println("Max array value: "+result);
        return result;
    }

    @Test
    public void checkArrayMinMax() {
        assertEquals(1, easyFindMinArrayValue(new int[]{5, 2, 3, 10, 1}));
        assertEquals(453, easyFindMaxArrayValue(new int[]{2, 7, 453, 100, 250}));
        assertEquals(1, findMinArrayValue(new int[]{5, 2, 3, 10, 1}));
        assertEquals(453, findMaxArrayValue(new int[]{2, 7, 453, 100, 250}));
    }
}


