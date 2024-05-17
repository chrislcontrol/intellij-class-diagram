public class Student implements Entity {
    private Long id; 
    private Person person; 
    private String guardianName;

    public Student(Long id, Person person, String guardianName) {
        this.id = id;
        this.person = person;
        this.guardianName = guardianName;
    }

    public Student(Person person, String guardianName) {
        this(0L, person, guardianName);
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

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }
}
