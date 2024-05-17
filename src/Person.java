import java.util.Date;

public class Person implements Entity {
    private Long id;
    private Date birthdate;
    private String name;
    private User user;

    public Person() {
        this(null, null, null, null);
    }

    public Person(Long id, Date birthdate, String name, User user) {
        this.id = id;
        this.birthdate = birthdate;
        this.name = name;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
