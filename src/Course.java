import java.util.Vector;

public class Course implements Icourse {
	private int credits;
	private String iD, name, description, attributes;
	private Vector<Icourse> prerequisites;

	@Override
	
	// equality for courses is based on course ID
	// returns true if the courseIDs are the same
	public boolean equals(Course course) {
		// TODO Auto-generated method stub
		boolean returnMe = false;
		if (this.iD == course.getiD())
			returnMe = true;
		return returnMe;
	}

	public String getAttributes() {
		return attributes;
	}

	public int getCredits() {
		return credits;
	}

	public String getDescription() {
		return description;
	}

	public String getiD() {
		return iD;
	}

	public String getName() {
		return name;
	}

	public Vector<Icourse> getPrerequisites() {
		return prerequisites;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setiD(String iD) {
		this.iD = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrerequisites(Vector<Icourse> prerequisites) {
		this.prerequisites = prerequisites;
	}
}
