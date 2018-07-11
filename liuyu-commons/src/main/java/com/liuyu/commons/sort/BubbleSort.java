package com.liuyu.commons.sort;

import java.util.Comparator;

/**
 * ClassName: BubblingSort <br/>
 * Function:  冒泡算法.
 * 1.比较相邻的元素，如果前一个比后一个大，就把它们两个调换位置。
 * 2.对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。这步做完后，最后的元素会是最大的数。
 * 3.针对所有的元素重复以上的步骤，除了最后一个。
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 下午2:41 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class BubbleSort<T> extends BaseSort<T> {


    public BubbleSort(T[] dataset) {
        super(dataset);
    }
    
    @Override
    public void sort(Comparator<T> c) {
        int size = dataset.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (c.compare(dataset[j], dataset[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void cocktailSort(Comparator<T> c) {
        int left = 0;
        int right = dataset.length - 1;
        while (left < right) {

            for (int i = left; i < right; i++) {
                if (c.compare(dataset[i], dataset[i + 1]) > 0) {
                    swap(i, i + 1);
                }
            }
            right--;

            for (int i = right; i > left; i--) {
                if (c.compare(dataset[i - 1], dataset[i]) > 0) {
                    swap(i - 1, i);
                }
            }
            left++;
        }
    }


}
