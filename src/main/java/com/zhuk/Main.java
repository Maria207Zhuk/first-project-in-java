package com.zhuk;
import com.zhuk.exams.Evi;
import com.zhuk.objects.Admin;
import com.zhuk.objects.Student;
import com.zhuk.objects.user;

public class Main
{
    public static void main(String[] args)
    {
        Admin admin = new Admin();

        admin.setName("Maria");
        admin.setLastname("Zhuk");
        admin.setAge(18);

        Student student = new Student();

        student.setName("Maria");
        student.setLastname("Zhuk");
        student.setAge(25);

        Student student2 = new Student();

        student2.setName("Biktoria");
        student2.setLastname("Letnts");

        System.out.println(admin.equals(student));


        printUser(student);
        printUser(student2);

        System.out.println(admin.hashCode());
        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println("________________________________________________PART 2");

        printUser(admin);

        happyirthday(admin);
        printUser(admin);

        System.out.println("________________________________________________PART 3");

        Evi eviExam = new Evi();

        eviExam.registersStudent(student);
        eviExam.registersStudent(student2);

        eviExam.printAllParticipants();

    }

    private static void printUser(user user) {
        System.out.println(user);
    }

    private static void happyirthday(user user) {
        user.setAge(user.getAge() +1);
    }

}
