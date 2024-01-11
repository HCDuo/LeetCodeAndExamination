package com.剑指_Offer.春招实习;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <pre>
 *给定一个整数数据流和一个窗口大小，根据该滑动窗口的大小，计算滑动窗口里所有数字的平均值。
 * 实现 MovingAverage 类：
 * MovingAverage(int size) 用窗口大小 size 初始化对象。
 * double next(int val) 成员函数 next 每次调用的时候都会往滑动窗口增加一个整数，
 * 请计算并返回数据流中最后 size 个值的移动平均值，即滑动窗口里所有数字的平均值。
 * </pre>
 *
 * @author <a href="https://github.com/HCDUO">HCDUO</a>
 * @date:2023/4/6 10:27
 */
public class 滑动窗口的平均值 {
    Queue<Integer> queue;
    int size;
    double sum;
    public 滑动窗口的平均值(int size) {
        queue = new ArrayDeque<Integer>(size);
        this.size = size;
        sum = 0;
    }

    public double next(int val) {
        if (queue.size()==size){
            sum -= queue.poll();
        }
        queue.offer(val);
        sum += val;
        return sum / queue.size();
    }
}
