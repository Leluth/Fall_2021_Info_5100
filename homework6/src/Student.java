import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Shaoshuai Xu
 * @version 1.0
 * @description: Student
 * @date 2021/12/5 10:24
 */
public class Student {
    public static void main(String[] args) throws ParseException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(0, "Alice", 85.4,
                new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01")));
        students.add(new Student(1, "Bob", 90.1,
                new SimpleDateFormat("yyyy-MM-dd").parse("1995-02-01")));
        students.add(new Student(2, "Cart", 100.0,
                new SimpleDateFormat("yyyy-MM-dd").parse("2000-04-01")));

        students.sort(new NameComparator());
        System.out.println(students);
        students.sort(new GpaComparator());
        System.out.println(students);
        students.sort(new DateOfBirthComparator());
        System.out.println(students);
    }

    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;

    public Student(int id, String name, double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }

    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

    public static class GpaComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return -Double.compare(o1.gpa, o2.gpa);
        }
    }

    public static class DateOfBirthComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.dateOfBirth.compareTo(o2.dateOfBirth);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
