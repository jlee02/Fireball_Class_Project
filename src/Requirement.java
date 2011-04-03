import java.util.Vector;

public class Requirement {
	private boolean fulfilled;
	private long iD;
	private Vector<Course> mayBeFulfilledBy = new Vector<Course>();

	public Requirement(Vector<Course> mayBeFulfilledBy) {
		super();
		this.fulfilled = false;
		this.iD = InternalDB.getRequirements().size();
		this.mayBeFulfilledBy = mayBeFulfilledBy;
	}

	public long getiD() {
		return iD;
	}

	public Vector<Course> getMayBeFulfilledBy() {
		return mayBeFulfilledBy;
	}

	public boolean isFulfilled() {
		return fulfilled;
	}

	public void setFulfilled(boolean fulfilled) {
		this.fulfilled = fulfilled;
	}

	public void setiD(long iD) {
		this.iD = iD;
	}

	public void setMayBeFulfilledBy(Vector<Course> mayBeFulfilledBy) {
		this.mayBeFulfilledBy = mayBeFulfilledBy;
	}

	@Override
	public String toString() {
		String returnMe = "";
		returnMe += "Requirement:\n";
		for (Course cr : mayBeFulfilledBy)
			returnMe += cr.getiD() + "\n";
		returnMe += "Met: " + fulfilled;
		return returnMe;
	}
}
