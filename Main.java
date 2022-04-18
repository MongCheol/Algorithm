package Algorithm;

public class Main {

    public static void main(String[] args) {
        TestArrayStack();
    }

    public static void TestArrayStack() {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.pop();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.push(1);
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.push(0);
        arrayStack.peek();
        arrayStack.pop();
    }
}
