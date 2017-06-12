import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestPersonPredicate {

    public static void main(String[] args) {
        System.out.println(getFilteredStudents( s1 -> s1.getSchool().equals("Kärrtorp")));
        System.out.println(getFilteredStudents( s1 -> s1.getGrade() == 'A'));
        //System.out.println(getFilteredStudents( s1 -> s1.getShoeSize() == 43));
    }

    private static List<Student> getFilteredStudents(Predicate<Student> filter){
        List<Student> filteredStudents = new ArrayList<>();
        for(Student student: Helpers.getStudents()){
            if(filter.test(student)){
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

}
