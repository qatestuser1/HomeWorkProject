import com.array.Array;
import com.llevel1.Methods;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MethodsTests {
    @Test
    public void testIsSortedPositive(){
        Methods methods = new Methods();
        int[] array = {1 , 2, 3, 4, 5};
        assertTrue("Not True", methods.isSorted(array));
    }
    @Test
    public void testIsSortedNegative(){
        Methods methods = new Methods();
        int[] array = {4, 5, 2, 1, 8, 12};
        assertFalse("Not False", methods.isSorted(array));
    }
    @Test
    public void testFindMin(){
        Methods methods = new Methods();
        assertEquals(5, methods.findMinNumber(5, 12));
    }
    @Test
    public void testFindMax(){
        Methods methods = new Methods();
        assertEquals(12, methods.findMaxNumber(5, 12));
    }
    @Test
    public void testFindSum(){
        Methods methods = new Methods();
        int[] array = {25, 18, 78, 30, 55, 19};
        assertEquals(110, methods.findSum(array, 5));
    }
    @Test
    public void testZeroArray(){
        Methods methods = new Methods();
        int[] inputArray = {5, 4, 0, 3, 0, 0, 0, 1, 4, 0};
        ArrayList<Integer> outputArray = new ArrayList<>();
        outputArray.add(2);
        outputArray.add(4);
        outputArray.add(5);
        outputArray.add(6);
        outputArray.add(9);
        assertEquals(outputArray, methods.zeroArray(inputArray));
    }
    @Test
    public void testWhichEarlierPositiveNumber(){
        Methods methods = new Methods();
        int[] inputArray = {5, 8, -3, 1};
        assertEquals("Positive", methods.whichEarlier(inputArray));
    }
    @Test
    public void testWhichEarlierNegativeNumber(){
        Methods methods = new Methods();
        int[] inputArray = {0, -8, -3, 1};
        assertEquals("Negative", methods.whichEarlier(inputArray));
    }
    @Test
    public void testWhichEarlierZeroNumber(){
        Methods methods = new Methods();
        int[] inputArray = {0, 0, 0, 0};
        assertEquals("Zero", methods.whichEarlier(inputArray));
    }
    @Test
    public void testArrayWithEvenNumbers(){
        Methods methods = new Methods();
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(2);
        inputArray.add(5);
        inputArray.add(6);
        inputArray.add(22);
        inputArray.add(8);
        inputArray.add(15);
        ArrayList<Integer> outputArray = new ArrayList<>();
        outputArray.add(2);
        outputArray.add(6);
        outputArray.add(22);
        outputArray.add(8);
        assertEquals(outputArray, methods.arrayWithEvenNumbers(inputArray));
    }
    @Test
    public void testReplaceElements(){
        Methods methods = new Methods();
        int[] inputArray = {5, 66, 4, 9, 34, 15, 22};
        int[] outputArray = {5, 12, 4, 9, 12, 12, 12};
        assertArrayEquals(outputArray, methods.replaceElements(inputArray, 12));
    }
    @Test
    public void testCountAmountOfPosNegZero(){
        Methods methods = new Methods();
        Map<String, Integer> result = new HashMap<>();
        int[] inputArray = {5, -2, -3, 4, 0, 44, 0, -22, -33, 0, 0, -12, 0};
        result = methods.countAmountOfPosNegZero(inputArray);
        int positive = result.get("Positive");
        int negative = result.get("Negative");
        int zero = result.get("Zero");
        assertEquals(3, positive);
        assertEquals(5, negative);
        assertEquals(5, zero);
    }
    @Test
    public void testFindMinInArray(){
        int[] inputArray = {3, 5, -3, -6, 0, 12};
        Methods methods = new Methods();
        assertEquals(-6, methods.findMin(inputArray));
    }

    @Test
    public void testFindMaxInArray(){
        int[] inputArray = {3, 5, -3, -6, 0, 12};
        Methods methods = new Methods();
        assertEquals(12, methods.findMax(inputArray));
    }
    @Test
    public void testSwitchMaxAndMinInArray(){
        int[] inputArray = {3, 5, -3, -6, 0, 12};
        int[] outputArray = {3, 5, -3, 12, 0, -6};
        Methods methods = new Methods();
        assertArrayEquals(outputArray, methods.switchMaxAndMinInArray(inputArray));
    }
    @Test
    public void testArrayWithCondition(){
        Methods methods = new Methods();
        int[] inputArray = {3, 5, -3, -6, 0, 12};
        ArrayList<Integer> outputArray = new ArrayList<>();
        outputArray.add(-3);
        outputArray.add(-6);
        outputArray.add(0);
        assertEquals(outputArray, methods.arrayWithCondition(inputArray));
    }
    @Test
    public void testArrayMod(){
        Methods methods = new Methods();
        int[] inputArray = {6, 5, 12, 35, 17, 37, -5};
        ArrayList<Integer> outputArray = new ArrayList<>();
        outputArray.add(6);
        outputArray.add(12);
        assertEquals(outputArray, methods.arrayMod(inputArray, 2, 0));
    }
    @Test
    public void testSwitchPairsInArray(){
        Methods methods = new Methods();
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] outputArray = {2, 1, 4, 3, 6, 5};
        assertArrayEquals(outputArray, methods.switchPairsInArray(inputArray));
    }
    @Test
    public void testArrayBeforeNull(){
        Methods methods = new Methods();
        int[] inputArray = {9, -2, 12, 4, 0, 4, 3, 2, 1};
        ArrayList<Integer> outputArray = new ArrayList<>();
        outputArray.add(9);
        outputArray.add(-2);
        outputArray.add(12);
        outputArray.add(4);
        assertEquals(outputArray, methods.arrayBeforeNull(inputArray));
    }
    @Test
    public void testSumMaxAndMin(){
        Methods methods = new Methods();
        int[] inputArray = {9, -2, 12, 4, 0, 4, 3, 2, 1};
        assertEquals(10, methods.sumMaxAndMin(inputArray));
    }
    @Test
    public void testFindComposition(){
        Methods methods = new Methods();
        int[] inputArray = {45, 34, 32, 17, 28};
        assertEquals(1530, methods.findComposition(inputArray, 32));
    }
    @Test
    public void testReplaceWithZeroCondition(){
        Methods methods = new Methods();
        int[] inputArray = {9, -22, 12, 4, 0, 4, -33, 2, 1};
        int[] outputArray = {9, 0, 12, 4, 0, 4, 0, 2, 1};
        assertArrayEquals(outputArray, methods.replaceWithZeroCondition(inputArray));
    }
    @Test
    public void testFindGreaterCompositionAbsNegative(){
        Methods methods = new Methods();
        Map<String, Integer> result = new HashMap<>();
        int[] inputArray = {9, -22, 12, 4, 0, 4, -333, 2, 1};
        result = methods.findGreaterCompositionAbs(inputArray);
        int negative = result.get("Negative");
        assertEquals(7326, negative);
    }
    @Test
    public void testFindGreaterCompositionAbsPositive(){
        Methods methods = new Methods();
        Map<String, Integer> result = new HashMap<>();
        int[] inputArray = {9, -22, 125, 4, 0, 4, -3, 2, 1};
        result = methods.findGreaterCompositionAbs(inputArray);
        int negative = result.get("Positive");
        assertEquals(36000, negative);
    }
    @Test
    public void testReplaceFirstMaxElementWithZero(){
        Methods methods = new Methods();
        int[] inputArray = {45, 32, 56, 56, 43, 56, 49};
        int[] outputArray = {45, 32, 0, 56, 43, 56, 49};
        assertArrayEquals(outputArray, methods.replaceFirstMaxElementWithZero(inputArray));
    }
    @Test
    public void testReplaceArrayWithK(){
        Methods methods = new Methods();
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(25);
        inputArray.add(355);
        inputArray.add(24);
        inputArray.add(18);
        inputArray.add(175);
        inputArray.add(90);
        ArrayList<Integer> outputArray = new ArrayList<>();
        outputArray.add(25);
        outputArray.add(355);
        outputArray.add(175);
        assertEquals(outputArray, methods.replaceArrayWithK(inputArray, 5));
    }

}
