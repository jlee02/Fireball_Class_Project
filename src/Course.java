import java.util.Vector;

public class Course implements Icourse {
	int courseID;
	String info;

	private String iD, name, description, attributes;
	private int credits;
	private Vector<Icourse> prerequisites;

	public String getiD() {
		return iD;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getAttributes() {
		return attributes;
	}

	public int getCredits() {
		return credits;
	}

	public Vector<Icourse> getPrerequisites() {
		return prerequisites;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setPrerequisites(Vector<Icourse> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public Course(int courseID, String info) {
		this.courseID = courseID;
		this.info = info;
	}

	public void main(String[] args) {
		Course c = new Course(102, "Failing Class");

	}

	// checks for equality between two courses
	// if the elements of course are equal, then return true
	public boolean equals(Course c) {
		if (this.courseID == c.courseID && this.info.equals(c.info)) {
			return true;
		}
		return false;
	}
}
