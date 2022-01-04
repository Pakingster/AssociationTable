/*
Student: Alexey Vartanov
Maman 14: Question 1 - Generic class
 */
import java.util.Date;

public class Student implements Comparable<Student> {

    private final int Id;
    private final String FirstName;
    private final String SecondName;
    private final Date BDate;


    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public Date getBDate() {
        return BDate;
    }

    public Student (int id, String name, String secondName, Date bdate){
        Id = id;
        FirstName = name;
        SecondName = secondName;
        BDate = bdate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", BDate="+BDate.getDate() + "." + BDate.getMonth()+"." + BDate.getYear() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.Id - o.Id;
    }
}
