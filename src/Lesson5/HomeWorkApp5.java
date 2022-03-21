package Lesson5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Петросян Евгений Ваганович","Комедиант", "vaganych@yahoo.com", 69, 3000000, 2282282);
        employee1.printInfo();
        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Комар Лидия Семеновна", "Главный редактор", "komarlida@vzik.ru", 50, 65320, 2564322);
        employeesArr[1] = new Employee("Кривошеев Вадим Петрович", "Помощник редактора", "krivosheev@ya.ru", 31, 48850, 2564320);
        employeesArr[2] = new Employee("Кальмаров Георгий Гургенович", "Автор", "kolmar_at@sea.ru", 28, 35150, 2564300);
        employeesArr[3] = new Employee("Жмышенко Валерий Альбертович", "Автор", "bakbak@daya.ru", 54, 30228, 2228228);
        employeesArr[4] = new Employee("Жмышенко Богдан Валерьевич", "Школьник", "yabogdan@yazdes.ru", 13, 14558, 2658942);
        for (int i = 0; i < employeesArr.length; i++) {
            if (employeesArr[i].getAge() > 40) {
                employeesArr[i].printInfo();
            }
        }
    }


}
