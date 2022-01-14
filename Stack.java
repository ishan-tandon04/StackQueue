public class Stack <T> {
    private StackNode<T> ancestorNode;
    private int size;

    public Stack() { //constructor
        size = 0;
        ancestorNode = new StackNode<T>();
    }

    public T peek() { //peek method
        return ancestorNode.getValue();
    }

    public void push(T data) { //push method
        StackNode<T> newNode = new StackNode<T>(data);
        ancestorNode.setSecondNode(newNode);
        ancestorNode.setFirstNode(ancestorNode);
        ancestorNode = newNode;

        size++;
    }

    public T pop() { //pop method
        StackNode<T> currNode = ancestorNode;
        ancestorNode = currNode.getFirstNode();

        size--;

        return currNode.getValue();
    }

    public int size(){ //return size
        return size;
    }
    public boolean isEmpty(){ //check to see if boolean is empty
        return !(size>0);
    }
}