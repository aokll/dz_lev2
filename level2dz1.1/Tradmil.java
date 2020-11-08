package test;

import java.util.Random;

public class Tradmil {
    private int q;
    public void overcoming(){
        Random random = new Random();
        int a = random.nextInt(2);
        if (a == 1){
            q = 0;
        }else q = 1;
    }
    public int getQ(){
        return q;
    }
}
