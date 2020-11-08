package test;

public class Robot implements Run_Jump{
    private String name;

    public Robot(String name){
        this.name = name;
    }
    @Override
    public void Run() {
        System.out.println("Умеет бегать");
    }

    @Override
    public void Jump() {
        System.out.println("Умеет прыгать");
    }

    @Override
    public void name1() {
        System.out.println(name);
    }
}
