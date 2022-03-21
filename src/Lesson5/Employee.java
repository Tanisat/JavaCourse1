package Lesson5;public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int age;
    private int salary;
    private int phone;

    public int getAge() {
        return age;
    }

    public Employee (String fullName, String position, String email, int age, int salary, int phone){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("****************");
        System.out.println("Полное имя: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Возраст: " + age);
        System.out.println("Зарплата: " + salary);
        System.out.println("Телефон: " +phone);
        System.out.println("Email: " + email);
        System.out.println("****************");
    }
}
