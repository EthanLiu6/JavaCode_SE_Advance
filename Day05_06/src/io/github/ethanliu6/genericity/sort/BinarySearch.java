package io.github.ethanliu6.genericity.sort;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 17:51
 * @Project JavaCode_SE_Advance
 * @Theme 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        //前提是数组有序
        int[] nums = {1, 2, 3, 5, 6, 7};
        System.out.println(binarySearch(nums, 6));
        System.out.println(binarySearch(nums, 4));
    }

    private static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) { //查找非终止条件
            if (arr[mid] > num) {
                right = mid - 1;
            }else if (arr[mid] < num) {
                left = mid + 1;
            }
            else {
                return mid;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }
}
