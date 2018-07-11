package com.liuyu.commons.sort;

import java.util.Comparator;

/**
 * ClassName: SelectionSort <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 下午3:15 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class SelectionSort<T> extends BaseSort<T> {

    public SelectionSort(T[] dataset) {
        super(dataset);
    }

    @Override
    public void sort(Comparator<T> c) {
        int size = dataset.length;
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (c.compare(dataset[min], dataset[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(i, min);
            }
        }
    }

}
