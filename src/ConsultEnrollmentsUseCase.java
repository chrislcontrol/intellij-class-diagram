import java.util.List;

public class ConsultEnrollmentsUseCase {
    private EnrollmentRepository enrollmentRepository;


    public List<Enrollment> execute(Student student) {
        return this.enrollmentRepository.findByStudent(student);
    }

}
