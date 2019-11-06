package com.idea.array;

/**
 * [189]旋转数组
 * 用取余的方式 把nums中的元素先放到数组a中，
 * 之后再倒腾到nums中
 * @author 赵继
 * 2019/11/6.
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }

}
