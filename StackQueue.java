/**
 StackQueue: This lab creates a StackQueue that is made of two stacks
 Author: Ishan Tandon
 Collaborator(s): n/a
 Collaboration: n/a
 Date: 1/14/22
 **/


public class StackQueue <T> {
    //instance data created
    private int counter;
    private Stack stackOne;
    private Stack stackTwo;

    //default constructor
    public StackQueue(){
        counter = 0;
        stackOne = new Stack();
        stackTwo = new Stack();
    }

    //enqueue method
    public void enqueue(T data){  //add data to the very first stack
        stackOne.push(data);
        counter++; //increasing the counter
    }

    //dequeue method
    public T dequeue(){
        //variable to store the data removed
        StackNode pop;
        //return null if no data
        if(counter == 0){
            return null;
        }
        //one piece of data, use pop method
        else if(counter == 1){
            pop = (StackNode) stackOne.pop();
        }
        //if stack is greater than one, remove the data and add to stack2
        else{
            //remove the elements and add to the other stack
            for(int i = 1; i<counter; i++){
                stackTwo.push(stackOne.pop());
            }
            //pop the data and store the return in a variable
            pop = (StackNode) stackOne.pop();
            //move the data back to stackOne
            for(int i = 1; i<counter; i++){
                stackOne.push(stackTwo.pop());
            }
        }

        if(counter > 0){
            counter--; //decrease counter, make sure counter is above zero as well
        }
        //return the removed value
        return (T) pop;
    }

    //peek method
    public T peek(){
        if(counter == 0){
            return null;
        }
        //if there is one piece of data, use the peek method
        else if(counter == 1){
            return (T) stackOne.peek();
        } else{
            //go through and remove elements
            for(int i = 1; i<counter; i++){
                stackTwo.push(stackOne.pop());
            }
            //store the data to return
            StackNode returnStack = (StackNode) stackOne.peek();
            //move all the data back to stackOne
            for(int i = 1; i<counter;i++){
                stackOne.push(stackTwo.pop());
            }
            //return the data
            return (T) returnStack;

        }
    }
    //isEmpty method
    public boolean isEmpty(){
        boolean b = counter>0;
        return !b;
    }

    //size method
    public int size(){
        return counter;
    }
}
