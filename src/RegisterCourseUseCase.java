import java.util.Date;

public class RegisterCourseUseCase {
    private final CourseRepository courseRepository;

    public RegisterCourseUseCase(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public RegisterCourseUseCase() {
        this(new CourseRepository());
    }

    public Course execute(String name, String schedule, Date beginAt, Date endsAt, Teacher teacher) {
        return courseRepository.create(new Course());
    }

    ;
}
