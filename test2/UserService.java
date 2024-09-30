import java.util.ArrayList;

public class UserService {
	
	
	private static ArrayList<User> udb = new ArrayList<>();
	
	public UserService() {
		udb.add(new User("AA","aa"));
		udb.add(new User("BB","bb"));
		udb.add(new User("CC","cc"));
	}

	public static ArrayList<User> getUdb() {
		return udb;
	}

	public static void setUdb(ArrayList<User> udb) {
		UserService.udb = udb;
	}
	
    public boolean authenticateUser(String userid, String password) {
        return udb.stream()
                .anyMatch(user -> user.IsAuthenticated(userid, password));
    }
    
    

}
