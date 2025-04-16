package Q1;

////Method-1
//public class Main {
//    public static void main(String[] args) {
//        NewThread newThread = new NewThread();
//        Thread t1 = new Thread(newThread);
//        t1.start();     //This will implement the run() method
//
//    }
//}



//Method-2
public class Main {
    public static void main(String[] args) {
        NewThread q1 = new NewThread();
        q1.thread.start();
    }
}