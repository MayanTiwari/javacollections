package OnlineBookReader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mayan on 9/9/17.
 */
public class UserManager implements UserAccount,Payments{
    Map<Integer,User> userMap = new HashMap<>();
    @Override
    public void registerNewUser() {
        userMap.put(1,new User());
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public void purchace(Book book) {

    }
}
