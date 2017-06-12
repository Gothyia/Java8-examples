
public class Student extends Person{
    char grade;
    String school;

    public Student(String name, int age, char grade, String school){
        super(name, age);
        this.grade = grade;
        this.school = school;
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", school='" + school + '\'' +
                '}';
    }
}
