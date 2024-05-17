import java.util.Date;

public class Course implements Entity {
    private Long id; 
    private String name; 
    private String schedule; 
    private Date beginAt; 
    private Date endsAt;
    private Teacher teacher;

    public Course(Long id, String name, String schedule, Date beginAt, Date endsAt, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.schedule = schedule;
        this.beginAt = beginAt;
        this.endsAt = endsAt;
        this.teacher = teacher;
    }

    public Course() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Date getBeginAt() {
        return beginAt;
    }

    public void setBeginAt(Date beginAt) {
        this.beginAt = beginAt;
    }

    public Date getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Date endsAt) {
        this.endsAt = endsAt;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
