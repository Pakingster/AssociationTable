/*
Student: Alexey Vartanov
Maman 14: Question 1 - Generic class
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class tester {

    public static void main(String[] args) throws Exception {
        Student s1 = new Student(123456957, "Israel", "Israel", new Date(1991, Calendar.JULY, 1));
        Student s2 = new Student(123456955, "John", "John", new Date(1992, Calendar.APRIL, 19));
        Student s3 = new Student(123456953, "Moshe", "Freeman", new Date(1993, Calendar.DECEMBER, 3));

        Student[] stArr = {s1, s2, s3};
        String[] numbers = {"0548565789", "0548854791", "0548565123"};
        AssociationTable<Student, String> table = new AssociationTable<>(stArr, numbers);

        System.out.println("After adding 3 students");
        Print(table);

        table.add(s2, "0508547851");
        System.out.println("After edit phone number of student 2");
        Print(table);

        table.remove(s3);
        System.out.println("After removing student 3");
        Print(table);
    }

    private static void Print(AssociationTable<Student, String> table) {
        for (Iterator<Comparable<Student>> it = table.keyIterator(); it.hasNext(); ) {
            Comparable<Student> st = it.next();
            System.out.println(st.toString() + " Phone:" + table.get(st));
        }
    }
}
