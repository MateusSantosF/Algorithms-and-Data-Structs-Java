package algorithms;

import enums.SortOrdering;
import utils.SortingUtils;

/**
 *
 * @author Mateus
 */
public abstract class BubbleSort {

    public static <Type extends Comparable<Type>> void sort(Type[] array) {

        boolean swaped;
        int size = array.length - 1;
        int indexOrdered = 0;

        do {
            swaped = false;
            for (int indexDesordered = 0; indexDesordered < (size - indexOrdered); indexDesordered++) {
                if (array[indexDesordered].compareTo(array[indexDesordered + 1]) > 0) {
                    SortingUtils.swap(array, indexDesordered, indexDesordered + 1);
                    swaped = true;
                }
            }

            indexOrdered++;
        } while (indexOrdered <= size && swaped);

    }

    public static <Type extends Comparable<Type>> void sort(Type[] array, SortOrdering sortOrder) {

        boolean swaped;
        int size = array.length - 1;
        int indexOrdered = 0;

        if (sortOrder == SortOrdering.ASCEDING) {
            do {
                swaped = false;
                for (int indexDesordered = 0; indexDesordered < (size - indexOrdered); indexDesordered++) {
                    if (array[indexDesordered].compareTo(array[indexDesordered + 1]) > 0) {
                        SortingUtils.swap(array, indexDesordered, indexDesordered + 1);
                        swaped = true;
                    }
                }

                indexOrdered++;
            } while (indexOrdered < size && swaped);
        }else{
            do {
                swaped = false;
                for (int indexDesordered = 0; indexDesordered < (size - indexOrdered); indexDesordered++) {
                    if (array[indexDesordered].compareTo(array[indexDesordered + 1]) < 0) {
                        SortingUtils.swap(array, indexDesordered, indexDesordered + 1);
                        swaped = true;
                    }
                }
                indexOrdered++;
            } while (indexOrdered < size && swaped);
        }

    }

}
