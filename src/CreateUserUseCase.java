public class CreateUserUseCase {
    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public CreateUserUseCase() {
        this(new UserRepository());
    }

    public User execute(String username, String password) {
        return userRepository.create(new User(0L, username, password));
    }
}
