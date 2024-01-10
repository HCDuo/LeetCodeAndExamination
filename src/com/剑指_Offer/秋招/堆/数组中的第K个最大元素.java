package com.剑指_Offer.秋招.堆;

import java.util.PriorityQueue;

/**
 * <pre>
 *
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/8/28 21:00
 */
public class 数组中的第K个最大元素 {
//    public int findKthLargest(int[] nums, int k) {
//        // 创建一个大小为 k 的小顶堆
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
//
//        // 遍历数组，将元素添加到小顶堆
//        for (int num : nums) {
//            minHeap.offer(num);
//            // 如果堆的大小超过 k，则移除堆顶元素，保持堆的大小为 k
//            if (minHeap.size() > k) {
//                minHeap.poll();
//            }
//        }
//
//        // 堆顶元素就是第 k 个最大的元素
//        return minHeap.peek();
//    }
    public int findKthLargest(int[] nums, int k) {
        int heapSize = nums.length; // 堆的大小
        buildMaxHeap(nums, heapSize); // 构建最大堆

        // 循环将堆顶元素（最大值）移到数组末尾，然后调整堆，重复 k 次
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i); // 将堆顶元素交换到数组末尾
            --heapSize; // 缩小堆的大小
            maxHeapify(nums, 0, heapSize); // 对交换后的堆进行调整，保持最大堆的性质
        }

        return nums[0]; // 返回第 k 个最大的元素
    }

    // 构建最大堆
    public void buildMaxHeap(int[] a, int heapSize) {
        // 从最后一个非叶子节点开始，依次进行最大堆调整
        for (int i = heapSize / 2; i >= 0; --i) {
            maxHeapify(a, i, heapSize);
        }
    }

    // 最大堆调整
    public void maxHeapify(int[] a, int i, int heapSize) {
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest); // 将当前节点和最大子节点交换
            maxHeapify(a, largest, heapSize); // 递归调整被交换的子节点
        }
    }

    // 交换数组中的两个元素
    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
