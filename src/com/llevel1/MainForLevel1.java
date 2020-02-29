package com.llevel1;

import java.util.*;
import java.util.stream.Collectors;

public class MainForLevel1 {
    public static void main(String[] args) {
    Methods method = new Methods();
 /*   System.out.println("Array is sorted? " + method.isSorted(method.scanArray()));

  */
    method.printArrayWithEvenNumbers(method.arrayWithEvenNumbers(method.scanArrayList()));
    }
}
