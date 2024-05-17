import java.util.ArrayList;
import java.util.List;

public class ConsultClassUseCase {

    private final EnrollmentRepository enrollmentRepository;


    public ConsultClassUseCase() {
        this(new EnrollmentRepository());
    }

    public ConsultClassUseCase(EnrollmentRepository enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository;
    }

    public List<Enrollment> execute(Course course) {
        return enrollmentRepository.listByCourse(course);
    }
}
