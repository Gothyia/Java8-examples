public class Teacher extends Person {
    String school;
    List<String> subjects;

    public Teacher(String name, int age, String school, String Subject){
        super(name, age);
        this.school = school;
        subjects = new ArrayList<>();
        addSubject(subject);
    }


    public void addSubject(String subject){
        subjects.add(subject);
    }

}
