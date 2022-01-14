public class DriverStackQueue {
    public static void main(String[] args) {
         StackQueue q = new StackQueue();
         //testing isEmpty method
         System.out.println("Test the isEmpty method (true): " + q.isEmpty());
         //testing size method
         System.out.println("Test the size method (0): " + q.size());
         //testing peek method
         System.out.println("Test the peek method (null): " + q.peek());
         //testing dequeue method
         System.out.println("Test the dequeue method (null): " + q.dequeue());
         //testing enqueue method
         System.out.println("Test the enqueue method (added phrase how ya doing) ");
         q.enqueue("how ya doing");
         //testing peek method
         System.out.println("Test the peek method (how ya doing): " + q.peek());
         //testing size method
         System.out.println("Test the size method(1): " + q.size());
         //testing isEmpty method
         System.out.println("Test the isEmpty method (false): " + q.isEmpty());
         //testing dequeue method
         System.out.println("Adding YO YO YO using the enqueue method");
         q.enqueue("YO YO YO");
        }
}
