import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class ArraysCommonElements {

    String easyFindArraysCommonElement(Integer [] firstArray, Integer[] secondArray) {
        List<Integer> array1 = new ArrayList<>(Arrays.asList(firstArray));
        List<Integer> array2 = new ArrayList<>(Arrays.asList(secondArray));
        array1.retainAll(array2);
        System.out.println("Common element(s) in both array(s) :" + array1);
        return array1.toString();
    }

    String findArraysCommonElemtn(int [] firstArray, int [] secondArray){
        int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};
        List<Integer> finalArr = new ArrayList<Integer>();
        for(int i=0;i<firstArray.length;i++){
            for(int j=0;j<secondArray.length;j++){
                if(firstArray[i]==secondArray[j]){
                    finalArr.add(firstArray[i]);
                }
            }
        }
        System.out.println("Common element(s) in both array(s) :"+finalArr);
        return finalArr.toString();
    }

    @Test
    void checkCommonElements (){
        assertEquals("[1, 3, 677, 55664]", easyFindArraysCommonElement(new Integer[]{1, 3, 4, 100, 677, 4334, 55664}, new Integer[]{1, 2, 3, 5, 6, 677, 55664}));
        assertEquals("[7, 505]", findArraysCommonElemtn(new int[]{7, 9, 505, 1001, 2013, 6001}, new int[]{1, 7, 505, 1000, 10000}));
    }


}
