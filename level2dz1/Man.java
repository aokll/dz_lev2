package level_2.lesson_1;

import java.util.Random;

public class Man extends Run_jump implements Treadmil,Wall{
    String name;
    private int w = 0;
    public Man(String name){
        this.name = name;
    }
    public void run(){
        System.out.println(name + "умеет бегать");
    }
    public void jump(){
        System.out.println(name + "умеет прыгать");
    }

    @Override
    public void treadmil() {
        Random random = new Random();
        int q = random.nextInt(2);
        if (q == 1){
            System.out.print("Удалось пробежать");
        }else w = 1;}

    @Override
    public void wall() {
        Random random = new Random();
        int q = random.nextInt(2);
        if (q == 1){
            System.out.print("Удалось перепрыгнуть");
        }else w = 1;}

    public int getW(){
        return w;
    }
    }




