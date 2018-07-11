package com.liuyu.commons.sort;

import java.util.Comparator;

/**
 * ClassName: InsertionSort <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date: 18-7-10 下午3:30 <br/>
 *
 * @author liuyu
 * @version v1.0
 * @since JDK 1.7+
 */
public class InsertionSort<T> extends BaseSort<T> {
    public InsertionSort(T[] dataset) {
        super(dataset);
    }

    @Override
    public void sort(Comparator<T> c) {
        int size  = dataset.length;
        for(int i=1;i<size;i++){
            T get = dataset[i];
            int j=i-1;
            while (j>=0&&c.compare(get,dataset[j])<0){
                dataset[j+1]=dataset[j];
                j--;
            }
            dataset[j+1]=get;
        }
    }
}
