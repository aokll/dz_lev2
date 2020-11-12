package streamms;

public class MainStream {
    public static void main(String[] args) {
       ChildThread childThread = new ChildThread();
       childThread.child();
    }
}
