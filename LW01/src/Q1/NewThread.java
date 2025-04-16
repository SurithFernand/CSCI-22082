package Q1;

////Method-1
//public class NewThread implements Runnable{
//    @Override
//    public void run() {
//        System.out.println("Thread is starting.");
//        try{
//            Thread.sleep(2000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println("Thread is running");
//    }
//}



//Method-2
public class NewThread implements Runnable{
    Thread thread;

    public NewThread() {
        thread = new Thread(this);
    }

    @Override
    public void run() {
        System.out.println("Thread is starting.");
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread is running");
    }
}

