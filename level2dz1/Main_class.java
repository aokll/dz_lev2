package level_2.lesson_1;
/*
1) Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).

2)Создайте два класса: беговая дорожка и стена, при прохождении через которые,
участники должны выполнять соответствующие действия (бежать или прыгать),
результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).

3)Создайте два массива: с участниками и препятствиями, и заставьте всех
участников пройти этот набор препятствий.

*4) У препятствий есть длина (для дорожки) или высота (для стены), а участников
ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
то дальше по списку он препятствий не идет.
 */

public class Main_class {
    public static void main(String[] args){

       /* Man man = new Man("Frank ");
        man.run();
        man.jump();
        man.treadmil();
        man.wall();
        Cat cat = new Cat("Vaska ");
        cat.run();
        cat.jump();
        cat.treadmil();
        cat.wall();
        Robot robot = new Robot("C3PO ");
        robot.run();
        robot.jump();
        robot.treadmil();
        robot.wall();, new Robot("boryka"), new Robot("R2D2")*/

        Robot[] arrayRobot = {new Robot("T113"),new Robot("R054"), new Robot("R2D2")};
        for(Robot robot1 : arrayRobot){
            System.out.println("");
            int[] obstacles = {1,2,1,2,1};
                 System.out.println("");
                 System.out.print(robot1.name + " -->");
                    for (int a : obstacles){
                    if (a == 1){ if (robot1.getW() == 1){System.out.print(" ПРОВАЛ"); break;}
                        else robot1.treadmil();}
                    else robot1.wall();
                }
        }
        Cat[] arrayCat = {new Cat("васька"),new Cat("пушок"), new Cat("барсик")};
        for(Cat cat1 : arrayCat){
            System.out.println("");
            int[] obstacles = {1,2,1,2,1};
            System.out.println("");
            System.out.print(cat1.name + " -->");
            for (int a : obstacles){
                if (a == 1){ if (cat1.getW() == 1){System.out.print(" ПРОВАЛ"); break;}
                else cat1.treadmil();}
                else cat1.wall();
            }
        }
        Man[] arrayMan = {new Man("Василиса"),new Man("Константин"), new Man("Герман")};
        for(Man man1 : arrayMan){
            System.out.println("");
            int[] obstacles = {1,2,1,2,1};
            System.out.println("");
            System.out.print(man1.name + " -->");
            for (int a : obstacles){
                if (a == 1){ if (man1.getW() == 1){System.out.print(" ПРОВАЛ"); break;}
                else man1.treadmil();}
                else man1.wall();
            }
        }

    }
}
