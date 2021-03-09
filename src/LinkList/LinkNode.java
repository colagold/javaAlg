package LinkList;

import java.util.HashSet;
import java.util.Set;

public class LinkNode {

    /**
     * 方法一：正常思路
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int tmp;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return 0;
    }
    /**
     * 方法二:如果数组的最大值不会超过数组的长度，可以使数组的值当索引。
     */
    public int findRepeatNumber(int[] nums,int a) {
        int[] list=new int[nums.length];
        int tmp;
        for(int i=0;i<nums.length;i++){
            tmp=++list[nums[i]];
            if(tmp>1){
                return nums[i];
            }
        }
        return 0;
    }

    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        Set<Integer> stapleSet=new  HashSet<Integer>();
        Set<Integer> drinkSet=new  HashSet<Integer>();
        for(int i=0;i<staple.length;i++){
            stapleSet.add(staple[i]);
        }
        for(int i=0;i<drinks.length;i++){
            drinkSet.add(drinks[i]);
        }
        return stapleSet.size()*drinkSet.size();
    }
}
