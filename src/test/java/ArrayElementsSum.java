import org.testng.annotations.Test;

import java.util.stream.IntStream;

import static org.testng.Assert.assertEquals;

public class ArrayElementsSum {

    private int findArraySum(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++){
            result += a[i];
        }
        System.out.println("Sum of array is :"+result);
        return result;
    }

    private int easyFindArraySum(int[] a){
        int result = IntStream.of(a).sum();
        System.out.println("Sum of array is :"+result);
        return result;
    }

    @Test
    public void checkArraySum(){
        assertEquals(16, findArraySum(new int[]{0, 1, 2, 3, 10}));
        assertEquals(16, easyFindArraySum(new int[]{0, 1, 2, 3, 10}));
    }
}


