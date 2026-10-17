interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
}

class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

public class Main {
    public static void main(String[] args) {
        Workable human = new HumanWorker();
        human.work();

        Eatable eater = new HumanWorker();
        eater.eat();

        Workable robot = new RobotWorker();
        robot.work();
    }
}