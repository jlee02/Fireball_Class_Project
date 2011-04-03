import java.util.Vector;

public class InternalDB {
	private static Vector<DegreePlan> degreePlans = new Vector<DegreePlan>();
	private static InternalDB iDB = null;
	private static Vector<Requirement> requirements = new Vector<Requirement>();
	private static Vector<User> users = new Vector<User>();

	public static DegreePlan findDegreePlan(String major)
	{
		DegreePlan returnMe = null;
		for (DegreePlan degreePlan: degreePlans)
			if(degreePlan.getMajor().equals(major))
				returnMe = degreePlan;
		return returnMe;
	}
	
	public static Requirement findRequirement(long iD)
	{
		Requirement returnMe = null;
		for (Requirement req: requirements)
			if(req.getiD() == iD)
				returnMe = req;
		return returnMe;
	}

	public static Student findStudent(long iD) {
		Student returnMe = null;
		for (User user : users)
			if (user.getClass().equals(Student.class)
					&& (((Student) user).getStudentID() == iD))
				returnMe = (Student) user;
		return returnMe;
	}

	public static Vector<DegreePlan> getDegreePlans() {
		return degreePlans;
	}

	public static InternalDB getiDB() {
		return iDB;
	}

	public static InternalDB getInstance() throws Exception{
		if (iDB == null)
			iDB = new InternalDB();
		return iDB;
	}

	public static Vector<Requirement> getRequirements() {
		return requirements;
	}

	public static Vector<User> getUsers() {
		return users;
	}

	public static void setDegreePlans(Vector<DegreePlan> degreePlans) {
		InternalDB.degreePlans = degreePlans;
	}

	public static void setiDB(InternalDB iDB) {
		InternalDB.iDB = iDB;
	}

	public static void setRequirements(Vector<Requirement> requirements) {
		InternalDB.requirements = requirements;
	}
	
	public static void setUsers(Vector<User> users) {
		InternalDB.users = users;
	}
	
	public InternalDB() throws Exception {
		AdapterFactory.getInstance();
		Vector<Course> exampleCourseReqs = new Vector<Course>();
		Course exampleCourse = (Course) AdapterFactory.getCatalogAdapter().getCourse("CSE-4020");
		exampleCourseReqs.add(exampleCourse);
		exampleCourse = null;
		exampleCourse = (Course) AdapterFactory.getCatalogAdapter().getCourse("CSE-4001");
		exampleCourseReqs.add(exampleCourse);
		Requirement req = new Requirement(exampleCourseReqs);
		requirements.add(req);
		Vector<Requirement> cSReq = new Vector<Requirement>();
		cSReq.add(req);
		DegreePlan oneReqCS = new DegreePlan("Computer Science", cSReq);
		degreePlans.add(oneReqCS);
	}
}
