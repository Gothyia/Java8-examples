import java.util.List;

public class TestLambdaSorting {

    public static void main(String[] args) {

        List<Person> persons = Helpers.getPersons();

        persons.sort((p1,p2) ->p1.getAge()-p2.getAge());
        persons.sort((p1,p2) ->p1.getName().compareTo(p2.getName()));

    }
}
