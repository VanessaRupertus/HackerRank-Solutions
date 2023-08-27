/*
You are given a list of student information: ID, FirstName, and CGPA.
Your task is to rearrange them according to their CGPA in decreasing order.
If two student have the same CGPA, then arrange them according to their
first name in alphabetical order. If those two students also have the same
first name, then order them according to their ID. No two students have the same ID.
 */
import java.util.*;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Comparator<Student> compareStudents = Comparator.comparing(Student::getCgpa)
                .reversed().thenComparing(Student::getFname).thenComparing(Student::getId);

        List<Student> sortedList = studentList.stream().sorted(compareStudents)
                                    .collect(Collectors.toList());

        for(Student st: sortedList){
            System.out.println(st.getFname());
        }
    }
}