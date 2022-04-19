package Algorithm;
// LIFO(Last In First Out) 후입선출 방식의 자료구조
public class ArrayStack {
    int top;
    int size;
    int[] arrayStack;

    public ArrayStack(int size) {
        this.size = size;
        arrayStack = new int[size];
        top = -1;
    }

    public boolean IsFull() {
        if(top == size - 1) {
            return true;
        }
        return false;
    }

    public boolean IsEmpty() {
        if(top == -1)
        {
            return true;
        }
        return false;
    }

    public void push(int item) {
        if(IsFull() == true)
        {
            System.out.println("Stack is Full.");
            return;
        }
        arrayStack[++top] = item;
        System.out.println(arrayStack[top] + " Push");
    }

    public void pop() {
        if(IsEmpty() == true)
        {
            System.out.println("Stack is Empty.");
            return;
        }
        System.out.println(arrayStack[top] + " Pop");
        top--;
    }

    public void peek() {
        System.out.println(arrayStack[top] + " Peek");
    }
}
