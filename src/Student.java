// Cat class definition
public class Student {

    // instance variables
    private String name;
    private int grade;

    // constructor
    public Student(String studentName, int studentGrade) {
        name = studentName;
        grade = studentGrade;
    }

    // method that introduces the Cat
    public void introduceMyself() {
        System.out.print("Hello my name is " + name + " and I am in ");
        if (grade > 12) {
            System.out.println("college");
        } else if (grade > 8) {
            System.out.println("high school");
        } else if (grade > 5) {
            System.out.println("middle school");
        } else {
            System.out.println("elementary school");
        }
    }
}