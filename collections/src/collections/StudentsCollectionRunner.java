package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}
//compartor class

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Ranga"),
                new Student(2, "Neil"),
                new Student(3, "sinead"));

        ArrayList<Student> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Desc" + studentsAl);

//        Collections.sort(studentsAl, new DescendingStudentComparator());
//        System.out.println("DescendingStudentComparator " + studentsAl);

        studentsAl.sort(new AscendingStudentComparator());
        System.out.println("AscendingStudentComparator " + studentsAl);



    }
}
