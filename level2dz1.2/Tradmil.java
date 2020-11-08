package test1;

public class Tradmil implements Obstacle{

    @Override
    public boolean Pass(Ability a) {
        return a.Run();
    }
}
