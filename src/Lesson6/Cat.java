package Lesson6;

public class Cat extends Animals {
    private int distance;

    Cat(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public void swim(int distance) {
        this.distance = distance;
        System.out.println(name + " не умеет плавать");
    }


    public void run(int distance) {
        if (distance >= runLimit) {
            System.out.println(name + " не может столько пробежать");
        }
        else {
            System.out.println(name + " пробежал " + distance + " метров");
        }
    }
}
