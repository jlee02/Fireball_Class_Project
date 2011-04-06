import java.util.Vector;

// Defines a course defined by the database requirements

public interface Icourse {
	boolean equals(Course course);

	public String getAttributes();

	public int getCredits();

	public String getDescription();

	public String getiD();

	public String getName();

	public Vector<Icourse> getPrerequisites();

	public void setAttributes(String attributes);

	public void setCredits(int credits);

	public void setDescription(String description);

	public void setiD(String iD);

	public void setName(String name);

	public void setPrerequisites(Vector<Icourse> prerequisites);
}
