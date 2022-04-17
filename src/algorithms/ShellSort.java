/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algorithms;

import utils.SortingUtils;

/**
 *
 * @author mateus
 *
 */
public abstract class ShellSort {

    public static <T extends Comparable<T>> void sort(T[] arr) {

        int h = 1;
        for (h = 1; h < arr.length; h = h * 3 + 1);
        h = h / 3;

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                int j = i;
                while (j >= h && arr[j - h].compareTo(arr[j]) > 0) {
                    SortingUtils.swap(arr, j - h, j);
                    j -= h;
                }
            }
            h = h / 3;
        }

    }

}
