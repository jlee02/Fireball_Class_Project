public abstract class User {
	private long iD;
	private String name;
	private String password;

	public User(long iD, String name, String password) {
		this.iD = iD;
		this.name = name;
		this.password = password;
	}
}
