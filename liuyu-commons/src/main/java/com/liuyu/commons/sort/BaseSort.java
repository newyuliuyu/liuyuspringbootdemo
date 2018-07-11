package com.liuyu.commons.sort;

import java.util.Comparator;

/**
 * ClassName: BaseSort <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 下午3:16 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public abstract class BaseSort<T> {
    protected T[] dataset;
    public BaseSort(T[] dataset){
        this.dataset = dataset;
    }

    protected void swap(int i, int j) {
        T temp = dataset[i];
        dataset[i] = dataset[j];
        dataset[j] = temp;
    }
    public abstract void sort(Comparator<T> c);
}
