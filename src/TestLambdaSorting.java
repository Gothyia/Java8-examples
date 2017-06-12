import java.util.Collections;
import java.util.List;

public class TestLambdaSorting {

    public static void main(String[] args) {

        List<Person> persons = Helpers.getPersons();

        Collections.sort(persons, (p1,p2) ->p1.getAge()-p2.getAge());
        Collections.sort(persons, (p1,p2) ->p1.getName().compareTo(p2.getName()));

        persons.sort((p1,p2) ->p1.getAge()-p2.getAge());
        persons.sort((p1,p2) ->p1.getName().compareTo(p2.getName()));

        //Below will give you a compilation error
        //persons.sort((p1 -> "We want to print instead of sorting"));

    }
}
