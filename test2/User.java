
public class User implements IValidate{

	private String userid;
	private String password;
	
	public User() {}
	
	public User(String userid, String password) {
		
		this.userid = userid;
		this.password = password;
	}
	
	public void addUser(String userid, String password) {
		
		this.userid = userid;
		this.password = password;
	}
	
	public boolean IsAuthenticated(String userid, String password) {
        return this.userid.equals(userid) && this.password.equals(password);
    }
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
	

