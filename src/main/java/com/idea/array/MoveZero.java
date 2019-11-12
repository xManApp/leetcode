package com.idea.array;

/**
 * 283 移动零
 * @author 赵继
 * 2019/11/12.
 */
public class MoveZero {

    // j放置非0的数
    // i和j同时向前移动 遇到为0的数，j停下
    // i继续向前，nums[i]不为0，为就交换位置
    // 因为j已经在可以放置非0的位置上等上了  也就是在为0的位置上等上了
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i=0; i<nums.length;i++) {
            if (nums[i]!=0) {
                if (i!=j){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
                j++;
            }
        }
    }


}
