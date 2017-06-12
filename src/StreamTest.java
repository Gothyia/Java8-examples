import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<Person> persons = Helpers.getPersons();

        persons.stream()
                .filter(p -> p.getAge() > 40)
                .count();

        persons.stream()
                .map(p -> new Person(p.getName(), p.getAge() + 1))
                .collect(Collectors.toList());

    }

}
