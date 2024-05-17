public class Teacher implements Entity {
    private Long id; 
    private Person person;

    public Teacher(Long id, Person person) {
        this.id = id;
        this.person = person;
    }

    public Teacher(Person person) {
        this(null, person);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
