import java.util.ArrayList;
import java.util.Arrays;
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
        teachers.add(new Teacher("Blanka", 37, "Kärrtorp", Arrays.asList("Svenska", "Engelska")));
        teachers.add(new Teacher("Anders", 45, "Fruängen", Arrays.asList("Svenska", "SO")));
        teachers.add(new Teacher("Josefin", 48, "Bromma", Arrays.asList("Engelska", "Hälsa")));
        teachers.add(new Teacher("Mats", 28, "Kista", Arrays.asList("Matematik", "Engelska")));
        teachers.add(new Teacher("Gunnar", 55, "Nacka", Arrays.asList("Matematik", "Naturvetenskap")));
        teachers.add(new Teacher("Anna", 37, "Kärrtorp", Arrays.asList("Religion", "Musik")));
        teachers.add(new Teacher("Johan", 32, "Fruängen", Arrays.asList("Svenska", "Slöjd")));
        teachers.add(new Teacher("Oskar", 41, "Bromma", Arrays.asList("Svenska", "Engelska")));
        teachers.add(new Teacher("Sanna", 50, "Kista", Arrays.asList("Svenska", "Engelska")));
        teachers.add(new Teacher("Hilevi", 55, "Nacka", Arrays.asList("Svenska", "Samhällskunskap")));

        return teachers;
    }

    public static List<Student> getLargeListOfStudents(){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Svea", 11, 'C', "Kista"));
        students.add(new Student("Alfred", 11, 'C', "Nacka"));
        students.add(new Student("Alfrida",11, 'C', "Bromma"));
        students.add(new Student("Rut", 11, 'C', "Fruängen"));
        students.add(new Student("Hannele", 11,'C' , "Kärrtorp"));
        students.add(new Student("Hanne", 11, 'C', "Kista"));
        students.add(new Student("Hanny", 11, 'C', "Nacka"));
        students.add(new Student("Hanna",11, 'D', "Bromma"));
        students.add(new Student("Melker", 12, 'C', "Fruängen"));
        students.add(new Student("Melchior", 12,'D' , "Kärrtorp"));
        students.add(new Student("Baltsar", 12, 'D', "Kista"));
        students.add(new Student("Kasper", 12, 'D', "Nacka"));
        students.add(new Student("Agge",13, 'D', "Bromma"));
        students.add(new Student("Gusti", 12, 'D', "Kista"));
        students.add(new Student("August", 14,'D' , "Kista"));
        students.add(new Student("Jannika", 13, 'D', "Kista"));
        students.add(new Student("Sigge", 12, 'B', "Kista"));
        students.add(new Student("Felicia",13, 'B', "Kista"));
        students.add(new Student("Laura", 12, 'B', "Kista"));
        students.add(new Student("Hilda", 12,'B' , "Kärrtorp"));
        students.add(new Student("Mimmi", 13, 'B', "Kista"));
        students.add(new Student("Albin", 13, 'B', "Nacka"));
        students.add(new Student("Elvira",13, 'A', "Bromma"));
        students.add(new Student("Ester", 13, 'E', "Fruängen"));
        students.add(new Student("Markus", 13,'A' , "Kärrtorp"));
        students.add(new Student("Kajsa", 13, 'E', "Kista"));
        students.add(new Student("Stefan", 14, 'A', "Nacka"));
        students.add(new Student("Joakim",14, 'E', "Bromma"));
        students.add(new Student("Linda", 14, 'A', "Fruängen"));
        students.add(new Student("Jonas", 14,'E' , "Kärrtorp"));
        students.add(new Student("Kajsa", 14, 'B', "Kista"));
        students.add(new Student("Stefan", 14, 'B', "Nacka"));
        students.add(new Student("Joakim",14, 'C', "Nacka"));
        students.add(new Student("Linda", 15, 'C', "Nacka"));
        students.add(new Student("Jonas", 15,'D' , "Nacka"));
        students.add(new Student("Kajsa", 15, 'B', "Nacka"));
        students.add(new Student("Stefan", 15, 'B', "Nacka"));
        students.add(new Student("Joakim",15, 'C', "Nacka"));
        students.add(new Student("Linda", 15, 'C', "Nacka"));
        students.add(new Student("Jonas", 15,'C' , "Kärrtorp"));
        students.add(new Student("Kajsa", 15, 'C', "Kista"));
        students.add(new Student("Stefan", 15, 'C', "Nacka"));
        students.add(new Student("Joakim",11, 'C', "Bromma"));
        students.add(new Student("Linda", 12, 'D', "Fruängen"));
        students.add(new Student("Jonas", 14,'B' , "Kärrtorp"));
        students.add(new Student("Kajsa", 13, 'B', "Bromma"));
        students.add(new Student("Stefan", 15, 'D', "Bromma"));
        students.add(new Student("Joakim",11, 'A', "Bromma"));
        students.add(new Student("Linda", 12, 'E', "Fruängen"));
        students.add(new Student("Jonas", 14,'C' , "Fruängen"));
        students.add(new Student("Kajsa", 13, 'C', "Fruängen"));
        students.add(new Student("Stefan", 15, 'C', "Fruängen"));
        students.add(new Student("Joakim",11, 'C', "Bromma"));
        students.add(new Student("Linda", 12, 'C', "Bromma"));
        students.add(new Student("Jonas", 14,'C' , "Bromma"));

        return students;
    }
}
