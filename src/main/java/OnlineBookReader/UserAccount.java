package OnlineBookReader;

/**
 * Created by mayan on 9/9/17.
 */
public interface UserAccount {
    User registerNewUser();
    void updateUser(User user);
    void removeUser(User user);
}
