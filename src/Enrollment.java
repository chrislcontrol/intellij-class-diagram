import java.util.Date;

public class Enrollment implements Entity {
    private Long id; 
    private Date startedAt; 
    private Student student; 
    private Course course;

    public Enrollment(Long id, Date startedAt, Student student, Course course) {
        this.id = id;
        this.startedAt = startedAt;
        this.student = student;
        this.course = course;
    }

    public Enrollment() {
        this(null, null, null, null);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
