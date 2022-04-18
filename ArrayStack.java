package Algorithm;

public class ArrayStack {
    int top;
    int size;
    int[] stack;

    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
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
        stack[++top] = item;
        System.out.println(stack[top] + " Push");
    }

    public void pop() {
        if(IsEmpty() == true)
        {
            System.out.println("Stack is Empty.");
            return;
        }
        System.out.println(stack[top] + " Pop");
        top--;
    }

    public void peek() {
        System.out.println(stack[top] + " Peek");
    }
}
