package test1;

import java.util.Random;

public class Human implements Ability{
    private String name;
    private int i = 0;
    public Human(String name){
        this.name = name;
    }
    Random random = new Random();
    @Override
    public boolean Jump() {
        int r = random.nextInt(2);
        if(r == 1){
            System.out.print(" Перепрыгнул ");
        }else {
            i = 1;
        System.out.print(" ПРОВАЛ ");
        }
        return true;
    }

    @Override
    public boolean Run() {
        int r = random.nextInt(2);
        if(r == 1){
            System.out.print(" Пробежал ");
        }else {
            i = 1;
            System.out.print(" ПРОВАЛ ");
        }
        return true;
    }
    public String getname(){
        return name;
    }
    public int getI(){
        return i;
    }
}
