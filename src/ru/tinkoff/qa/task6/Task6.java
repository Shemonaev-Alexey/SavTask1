package ru.tinkoff.qa.task6;

public class Task6 {

    /**
     * Сделать класс Student, у которого будет три поля, имя, возраст, пол
     * Собрать массив из 10 студентов
     * Вывести в консоль только студентов старше 19 лет
     * Чтобы было красиво выводить, переопределить метод toString для класса Student
     * Сделать конструктор для класса Student
     */
    public static void main(String[] args) {
        Student student1 = new Student("Masha", "ж", 23);
        Student student2 = new Student("Misha", "м", 20);
        Student student3 = new Student("Mis", "м", 18);
        Student student4 = new Student("Mi", "ж", 19);
        Student student5 = new Student("M", "ж", 21);
        Student student6 = new Student("з", "а", 121);
        Student student7 = new Student("о", "к", 12);
        Student student8 = new Student("ы", "к", 26);
        Student student9 = new Student("е", "д", 26);
        Student student10 = new Student("Лёпша", "а", 26);
        Student[] students = {student1, student2, student3, student4,
                student5, student6, student7, student8, student9, student10};
        for (Student student: students) {
            if (student.age>19){
                System.out.println(student);
            }

        }
    }
}
