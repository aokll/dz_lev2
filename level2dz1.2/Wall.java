package test1;

public class Wall implements Obstacle{
    @Override
    public boolean Pass(Ability a) {
        return a.Jump();
    }
}
