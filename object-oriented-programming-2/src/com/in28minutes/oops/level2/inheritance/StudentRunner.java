package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Ranga");
//        student.setEmail("in28minutes@gmail.com");
//        student.getName();
//        Person person = new Person();
//        person.setName("ranga");
//        person.setEmail("we@fs.asd");
//        person.setPhoneNumber("12312312");
//        String value  = person.toString();
//        System.out.println(value);
//        System.out.println(person);
        Employee employee = new Employee("Ranger", "Programmer Analyst");
//        employee.setName("ranga");
        employee.setEmail("this@ismysecond.com");
        employee.setPhoneNumber("12312312");
        employee.setEmployeeGrade('A');
//        employee.setTitle("Programmer Analyst");
        System.out.println(employee);
    }
}
