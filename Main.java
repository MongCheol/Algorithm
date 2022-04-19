package Algorithm;

public class Main {

    public static void main(String[] args) {
        TestArrayStack();
        //TestArrayQueue();
    }

    public static void TestArrayStack() {
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.pop();
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);
        arrayStack.push(6);
        arrayStack.push(7);
        arrayStack.push(8);
        arrayStack.push(9);
        arrayStack.push(10);
        arrayStack.push(11);
        arrayStack.push(12);
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.peek();
        arrayStack.push(13);
        arrayStack.peek();
        arrayStack.pop();
    }

    public static void TestArrayQueue(){
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.Enqueue(1);
        arrayQueue.Enqueue(2);
        arrayQueue.Enqueue(3);
        arrayQueue.Enqueue(4);
        arrayQueue.Enqueue(5);
        arrayQueue.Enqueue(6);
        arrayQueue.Dequeue();
        arrayQueue.Enqueue(7);
        arrayQueue.Enqueue(8);
        arrayQueue.Dequeue();
        arrayQueue.Dequeue();
        arrayQueue.Dequeue();
        arrayQueue.Dequeue();
        arrayQueue.Dequeue();
        arrayQueue.Dequeue();
    }
}
