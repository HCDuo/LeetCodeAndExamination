package com.剑指_Offer.秋招.链表;

import com.剑指_Offer.ListNode;

import java.util.Random;

/**
 * <pre>
 *  合并两个无序链表
 *  1. 初始化两个无序链表 l1 和 l2
 *  2. 打印并展示初始链表内容
 *  3. 对每一个链表进行归并排序（merge_sort 方法）
 *  4. 合并两个已排序的链表（merge 方法）
 *  5. 打印并展示合并后的链表
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @project Learning
 * @date 2024/1/16 16:57:03
 */
public class 合并两个无序链表 {

    // 两个无序链表
    static ListNode l1;
    static ListNode l2;
    /**
     * 初始化两个无序链表
     */
    private static void init() {
        // 虚拟头节点
        ListNode vir1 = new ListNode();
        ListNode vir2 = new ListNode();
        ListNode p = vir1;
        ListNode q = vir2;
        // 生成随机数填充链表节点值
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            ListNode np = new ListNode(random.nextInt(30));
            p.next = np;
            p = np;
            ListNode nq = new ListNode(random.nextInt(30));
            q.next = nq;
            q = nq;
        }
        // 设置链表头
        l1 = vir1.next;
        l2 = vir2.next;
    }
    /**
     * 打印并展示链表内容
     * @param l1 第一个链表
     * @param l2 第二个链表
     */
    private static void show(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        // 打印第一个链表
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
        // 打印第二个链表
        while (q != null) {
            System.out.print(q.val + " ");
            q = q.next;
        }
        System.out.println();
    }
    /**
     * 合并两个已排序链表
     * @param h1 第一个链表头节点
     * @param h2 第二个链表头节点
     * @return 合并后的链表头节点
     */
    private static ListNode merge(ListNode h1, ListNode h2) {
        // 虚拟头节点
        ListNode vir = new ListNode();
        ListNode sc = vir;
        ListNode p = h1;
        ListNode q = h2;
        // 按顺序合并两个链表
        while (p != null && q != null) {
            if (p.val <= q.val) {
                ListNode pn = p.next;
                sc.next = p;
                p = pn;
            } else {
                ListNode qn = q.next;
                sc.next = q;
                q = qn;
            }
            sc = sc.next;
        }
        // 处理剩余的节点
        if (p != null) sc.next = p;
        if (q != null) sc.next = q;

        return vir.next;
    }
    /**
     * 对链表进行归并排序
     * @param head 链表头节点
     * @return 排序后的链表头节点
     */
    private static ListNode merge_sort(ListNode head) {
        // 链表为空或只有一个节点，直接返回
        if (head == null || head.next == null) {
            return head;
        }
        // 快慢指针找到链表中点，low为中点的前一个节点
        ListNode fast = head;
        ListNode low = new ListNode(0, head);
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
        }
        // 将链表分为两部分
        ListNode rhead = low.next;
        low.next = null; // 断开连接
        // 递归对两部分进行归并排序
        ListNode lh = merge_sort(head);
        ListNode rh = merge_sort(rhead);
        // 合并两个已排序链表
        ListNode merge = merge(lh, rh);
        return merge;
    }
    /**
     * 主程序入口
     * @param args 参数
     */
    public static void main(String[] args) {
        // 初始化两个无序链表
        init();
        // 打印并展示初始链表内容
        show(l1, l2);
        // 对两个链表进行归并排序
        l1 = merge_sort(l1);
        l2 = merge_sort(l2);
        // 合并两个有序链表
        ListNode res = merge(l1, l2);
        // 打印并展示合并后的链表
        show(res, null);
    }
}
