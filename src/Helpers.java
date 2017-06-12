import java.util.ArrayList;
import java.util.List;

public class Helpers {

    public static List<Person> getPersons(){
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Lina", 43));
        persons.add(new Person("Oskar", 54));
        persons.add(new Person("Jenny", 50));
        persons.add(new Person("Anna", 28));
        persons.add(new Person("Karl", 35));

        return persons;
    }

    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Kajsa", 13, 'B', "Kista"));
        students.add(new Student("Stefan", 15, 'A', "Nacka"));
        students.add(new Student("Joakim",11, 'D', "Bromma"));
        students.add(new Student("Linda", 12, 'C', "Fruängen"));
        students.add(new Student("Jonas", 14,'E' , "Kärrtorp"));

        return students;
    }

    public static List<Teacher> getTeachers(){
        List<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Blanka", 37, "Kärrtorp"));
        teachers.add(new Teacher("Anders", 45, "Fruängen"));
        teachers.add(new Teacher("Josefin", 48, "Bromma"));
        teachers.add(new Teacher("Mats", 28, "Kista"));
        teachers.add(new Teacher("Gunnar", 55, "Nacka"));

        return teachers;
    }
}
