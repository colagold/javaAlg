import LinkList.sortAlg;

import java.awt.*;

public class mainTest {
    public static void outArray(int[] array){
        for (int i:array
             ) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a={2,8,500,9,7,-1,88};
        outArray(new sortAlg().bubbleSort(a));
        outArray(new sortAlg().selectSort(a));
    }

}
