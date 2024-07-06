import java.util.HashMap;
import java.util.Map;

public class UserRegistration {
    private Map<String, String> users;

    public UserRegistration() {
        this.users = new HashMap<>();
    }

    public void registerUser(String username, String password) {
        users.put(username, password);
    }

    public boolean isValidUser(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}