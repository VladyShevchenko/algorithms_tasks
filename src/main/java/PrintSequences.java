import org.testng.annotations.Test;

import java.util.Arrays;

public class PrintSequences {

    private static void printAllSequenceOfGivenLength(int k, int n) {
        if(k<=0 || n<=0)
            return;
        int[] a = new int[k];
        Arrays.fill(a, 1);
        boolean flag=true;
        while(flag) {
            printArray(a);
            for(int i=k-1;i>=0;--i,flag=false)
                if(a[i] < n) {
                    ++a[i];
                    Arrays.fill(a, i+1, k, 1);
                    flag = true;
                    break;
                }
        }
    }

    private static void printArray(int[] a) {
        if(a==null||a.length==0) {
            System.out.println();
            return;
        }
        for (int i : a)
            System.out.print( i + " ");
        System.out.println();
    }

    @Test
    public void testSequences(){
        printAllSequenceOfGivenLength(2,3);
    }
}