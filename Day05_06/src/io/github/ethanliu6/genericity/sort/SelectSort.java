package io.github.ethanliu6.genericity.sort;

import java.util.Arrays;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 17:34
 * @Project JavaCode_SE_Advance
 * @Theme 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] nums = {2, 6, 3, 5, 1, 7};
        System.out.println("排序前:" + Arrays.toString(nums));
        selectSort(nums);
        System.out.println("排序后:" + Arrays.toString(nums));
    }

    private static int[] selectSort(int[] nums) {
        if (nums == null) {
            return nums;
        } else {
            for (int i = 0; i < nums.length - 1; i++) { //轮次
                for (int j = i + 1; j < nums.length; j++) { //与后面所有元素比
                    if (nums[i] > nums[j]) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
                }
            }
        }
        return nums;
    }
}
