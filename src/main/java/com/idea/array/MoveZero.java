package com.idea.array;

/**
 * 283 移动零
 * @author 赵继
 *         2019/11/12.
 */
public class MoveZero {

    public static void main(String[] args) {
        int[] nums = {1, 0, 1};
        int j = 0; // 存放下一个非0整数的位置
        for (int i=0; i < nums.length; i++) {

            if (nums[i]!=0) {

                if (i!=j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }

        }

        for (int i=0; i < nums.length; i++) {

            System.out.println(nums[i]);

        }

    }


}
