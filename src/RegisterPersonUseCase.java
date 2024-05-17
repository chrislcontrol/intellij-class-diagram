import java.util.Date;
import java.util.List;

public class RegisterPersonUseCase {
    private final PersonRepository personRepository;
    private final ContactRepository contactRepository;

    public RegisterPersonUseCase(PersonRepository personRepository, ContactRepository contactRepository) {
        this.personRepository = personRepository;
        this.contactRepository = contactRepository;
    }

    public RegisterPersonUseCase() {
        this(new PersonRepository(), new ContactRepository());
    }

    public Person execute(Date birthdate, User user, String name, List<Contact> contacts) {
        Person person = personRepository.create(new Person());
        for (Contact contact : contacts) {
            contact.setPerson(person);
            contactRepository.getOrCreate(contact, "value", "contact");
        }
        return person;
    }
}
