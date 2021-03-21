package forOffer;

import java.util.Stack;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 思路：
 * 初始化两个栈a,b。
 * a用来存储刚入队列的元素
 * b用来存放a的倒置
 * 条件：如果b中有元素，a就不能往b中添加元素，因为必须保证b中最上面的是最早进队列的。
 */


class CQueue {
    Stack<Integer> a;
    Stack<Integer> b;
    public CQueue() {
        a=new Stack<>();
        b=new Stack<>();
    }

    public void appendTail(int value) {
        a.push(value);
    }

    public int deleteHead() {
        if(a.empty()){
            if(b.empty()){
                return -1;
            }else{
                return b.pop();
            }
        }else{
            if(!b.empty()){
                return b.pop();
            }else{
                while(!a.empty()){
                    b.push(a.pop());
                }
                return b.pop();
            }
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
