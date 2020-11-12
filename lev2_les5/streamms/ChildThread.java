package streamms;

public class ChildThread{

    private final int size = 10000000;
    private final int h = size / 2;
    private float[] arr = new float[size];


    public void child(){
        long start = System.currentTimeMillis();
        float[] arr1 = new float[h];
        float[] arr2 = new float[h];

        System.arraycopy(arr,0,arr1,0,h);
        System.arraycopy(arr,h,arr2,0,h);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < arr1.length - 1; i++) {
                arr1[i] = 1;
                arr1[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) *
                        Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < arr1.length - 1; i++) {
                arr2[i] = 1;
                arr2[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) *
                        Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

            }
        });

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.arraycopy(arr1,0,arr,0,h);
        System.arraycopy(arr2,0,arr,h,h);

        long end = System.currentTimeMillis() - start;
        System.out.println(end);

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}

