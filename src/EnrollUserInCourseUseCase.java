public class EnrollUserInCourseUseCase {
    private final EnrollmentRepository enrollmentRepository;

    public EnrollUserInCourseUseCase(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public EnrollUserInCourseUseCase() {
        this(new EnrollmentRepository());
    }

    public Enrollment execute(Student student, Course course) {
        return enrollmentRepository.create(new Enrollment());
    }
}
