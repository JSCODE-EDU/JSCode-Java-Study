package Week4_Practice;

import java.util.ArrayList;
import java.util.List;

public class Student_Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("제이슨", 87, 92));
        students.add(new Student("레이첼", 82, 92));
        students.add(new Student("리사", 92 ,88));

        for (Student student : students) {
            System.out.println("이름 : " + student.getName());
            System.out.println("국어 : " + student.getKoreanScore());
            System.out.println("영어 : " + student.getEngScore());
        }

    }
}
