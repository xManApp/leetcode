package com.idea.array;

/**
 * 88题 合并两个有序数组
 * @author 赵继
 * 2019/11/8.
 */
public class SortedTwoArray {

    // 从后往前合并
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;

        while (len1 >= 0 && len2 >= 0) {
            // len2的可能值  -1,0,len
            // -1表示nums2数组内的元素被复制完了
            // 0表示nums2数组内的元素还有一个没被复制完
            // len表示nums2数组内的元素一个都没有被复制
            nums1[len--] = (nums1[len1] > nums2[len2]) ?
                    nums1[len1--] : nums2[len2--];
        }

        // 最后一个参数表示 要从源数组拷贝到目标数组 几个元素
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }

}
