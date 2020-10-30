package test1;

public class Main {
        public static void main (String[] args){
        Ability[] abilities = {new Cat("vasyka"), new Human("Frank"), new Robot("C3PI0")};
        Obstacle[] obstacles = {new Tradmil(), new Wall(), new Wall(), new Tradmil(), new Wall()};
        for (Ability a : abilities) {
            System.out.println("");
            System.out.print(a.getname() + " - ");
            for (Obstacle o : obstacles) {
                o.Pass(a);
                if (a.getI() == 1) {
                    break;
                }

            }

        }

    }
    }


