public class Contact implements Entity{
    private Long id; 
    private String value; 
    private Person person;

    public Contact(Long id, String value, Person person) {
        this.id = id;
        this.value = value;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
