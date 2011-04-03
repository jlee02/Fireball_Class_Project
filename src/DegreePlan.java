import java.util.Vector;

public class DegreePlan {
	private String major;
	private Vector<Requirement> requirements = new Vector<Requirement>();

	public DegreePlan(String major, Vector<Requirement> requirements) {
		super();
		this.major = major;
		this.requirements = requirements;
	}

	public String getMajor() {
		return major;
	}

	public Vector<Requirement> getRequirements() {
		return requirements;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setRequirements(Vector<Requirement> requirements) {
		this.requirements = requirements;
	}
}
