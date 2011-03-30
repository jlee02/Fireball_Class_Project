import java.util.Vector;

public interface Icourse {
	public String getiD();

	public String getName();

	public String getDescription();

	public String getAttributes();

	public int getCredits();

	public Vector<Icourse> getPrerequisites();

	public void setiD(String iD);

	public void setName(String name);

	public void setDescription(String description);

	public void setAttributes(String attributes);

	public void setCredits(int credits);

	public void setPrerequisites(Vector<Icourse> prerequisites);
}
