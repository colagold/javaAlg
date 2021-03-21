package LinkList;

/**
 * 经典排序算法
 */

/**
 * 规定：从小到大
 * 冒泡算法
 */
public class sortAlg {
    public int[] bubbleSort(int[] array){
        int size=array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(array[i]>array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
        return array;
    }
    /**
     * 选择排序
     * 先选出最小值下标，再调换
     */
    public int[] selectSort(int[] array){
        int minIndex,size=array.length;
        for (int i = 0; i < size; i++) {
            minIndex=i;
            for (int j = i+1; j < size; j++) {
                if (array[minIndex]>array[j]){
                    minIndex=j;
                }
            }
            int tmp=array[i];
            array[i]=array[minIndex];
            array[minIndex]=tmp;
        }
        return array;
    }
    /**
     * 插入排序
     */
    public void insertSort(int[] array){
        int size=array.length;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                if (array[j]<array[i]){
                    
                }
            }

        }
    }
    /**
     * 快速排序核心代码
     */
    public void quickSort(int[] array,int left,int right){
        int base=array[left];
        int i=left,j=right;
        while (i!=j){
            if (array[i]<base&&i<j){
                i++;
            }
            if (array[j]>base&&i<j){
                j--;
            }
            if (i<j){
                int tmp=array[i];
                array[i]=base;
                array[left]=tmp;
            }
        }
    }
}
