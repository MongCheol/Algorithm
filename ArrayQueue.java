package Algorithm;

import java.lang.reflect.Array;

// FIFO(First In First Out) 선입선출 방식의 자료구조
public class ArrayQueue {
    int size;
    int front;
    int rear;
    int[] arrayQueue;

    public ArrayQueue(int size){
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.arrayQueue = new int[size];
    }

    public boolean IsEmpty(){
        return (front == rear);
    }

    public boolean IsFull(){
        // 이 방법으로는 Queue를 사이즈-1 밖에 사용을 못한다. 배열의 크기를 2배로 늘려주는 방법으로 다시 구현하자.
        if((rear + 1) % size == front)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean Enqueue(int value){
        if(IsFull() == true)
        {
            System.out.println("Queue is full.");
            return false;
        }
        arrayQueue[rear] = value;
        System.out.println("Queue : " + value);
        rear++;
        if(rear == size)
        {
            rear = 0;
        }
        return true;
    }

    public int Dequeue(){       // 자바에서는 주소값으로 인자를 받아서 값을 저장할수가 없네.
        if(IsEmpty() == true)
        {
            System.out.println("Queue is Empty.");
            return 0;       // 0을 리턴해버리면 0을 큐안엥 넣어놓은 경우에 문제가 생김
        }
        int ret = arrayQueue[front];
        front++;
        if(front == size)
        {
            front = 0;
        }
        System.out.println("Dequeue : " + ret);
        return ret;
    }
}
