import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
    String school;
    List<String> subjects;

    public Teacher(String name, int age, String school, List<String> subjects){
        super(name, age);
        this.school = school;
        this.subjects =subjects;
    }
    public void addSubject(String subject){
        subjects.add(subject);
    }

    public List<String> getSubjects(){
        return new ArrayList<>(subjects);
    }

}
