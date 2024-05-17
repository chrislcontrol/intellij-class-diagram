public class LoginUseCase {
    private final UserRepository userRepository;

    public LoginUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginUseCase() {
        this(new UserRepository());
    }

    public User execute(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }
}
