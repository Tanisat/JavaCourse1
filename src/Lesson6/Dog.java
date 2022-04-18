package Lesson6;

public class Dog extends Animals {
    Dog(String name, int runLimit, int swimLimit) {
        super(name, runLimit, swimLimit);
    }

    @Override
    public void swim(int distance) {
        if (distance >= swimLimit) {
            System.out.println(name + " не может столько проплыть");
        }
        else {
            System.out.println(name +  " проплыл " + distance + " метров");
        }
    }

    public void run(int distance){
        if (distance >= runLimit) {
           System.out.println(name + " не может столько пробежать");
            }
        else {
            System.out.println(name + " пробежал " + distance + " метров");
        }
        }
    }



