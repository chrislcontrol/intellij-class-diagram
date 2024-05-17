public class RegisterTeacherUseCase {
    private final TeacherRepository teacherRepository;

    public RegisterTeacherUseCase(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public RegisterTeacherUseCase() {
        this(new TeacherRepository());
    }

    public Teacher execute(Person person) {
        return teacherRepository.create(new Teacher(person));
    }

}
