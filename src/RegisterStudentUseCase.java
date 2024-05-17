public class RegisterStudentUseCase {
    private final StudentRepository studentRepository;

    public RegisterStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public RegisterStudentUseCase() {
        this(new StudentRepository());
    }

    public Student execute(Person person, String guardianName) {
        return studentRepository.create(new Student(person, guardianName));
    }
}
