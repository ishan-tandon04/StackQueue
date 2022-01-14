public class StackNode <T>{
    private StackNode firstNode; /**instance data, 2 nodes to assign pointers**/
    private StackNode secondNode;
    private T value;//value to store nodes

    public StackNode(){ /**default constructor**/
        firstNode = null;
        secondNode = null;
        value = null;
    }

    /**variable constructor**/
    public StackNode(T value){
        firstNode = null;
        secondNode = null;
        this.value = value;
    }

    /**3 variable constructor**/
    public StackNode(T value, StackNode node1, StackNode node2){
        this.value = value;
        this.firstNode = node1.firstNode;
        this.secondNode = node1.secondNode;
    }

    /**mutators**/
    public void setValue(T value){
        this.value = value;
    }
    public void setFirstNode(StackNode firstNode){
        this.firstNode = firstNode;
        makeChild(firstNode);
    }
    public void setSecondNode(StackNode secondNode){
        this.secondNode = secondNode;
        makeParent(secondNode);
    }

    /**child node**/
    private void makeChild(StackNode secondNode){
        this.firstNode = secondNode;
    }
    /**parent node**/
    private void makeParent(StackNode secondNode){
        this.firstNode = secondNode;
    }

    /**accessors being made**/
    public T getValue() {
        return value;
    }
    public StackNode<T> getFirstNode(){return firstNode;}
    public StackNode<T> getSecondNode(){return secondNode;}

    /**toString method**/
    public String toString() {
        if (value == null) {
            return "";
        } else {
            return "Node: " + value.toString();
        }
    }

    /** .equals method**/
    public boolean equals(StackNode node) {
        if (this.value == null && node.value == null) {
            return true;  /**if both return null then print true**/
        } else if (this.value == null || node.value == null) {
            return false; /**if only one returns null then print fast**/
        } else { /**if neither return true, return node value**/
            return this.value == node.value;
        }
    }
}
