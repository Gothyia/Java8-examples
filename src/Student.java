import java.util.function.Predicate;

public class Student extends Person implements Predicate{
    int grade;
    String school;

    public Student(String name, int age, int grade, String school){
        super(name, age);
        this.grade = grade;
        this.school = school;
    }

    @Override
    public boolean test(Object o) {
        return false;
    }
}
