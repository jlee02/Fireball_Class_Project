public abstract class User {
	private long iD;
	private String name;
	private String password;

	// defines a user as a name with an ID and password
	
	public User(long iD, String name, String password) {
		this.iD = iD;
		this.name = name;
		this.password = password;
	}

	public long getiD() {
		return iD;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setiD(long iD) {
		this.iD = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
