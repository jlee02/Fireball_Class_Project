import java.util.Vector;

// Test Database used to contain student data, will connect to an adapter if
// a real student database is given later on in project.

public class ExternalDB {
	private static ExternalDB eDB = null;

	public static ExternalDB getInstance() throws Exception {
		if (eDB == null)
			eDB = new ExternalDB();
		return eDB;
	}

	public Vector<DBStudent> studentDB = new Vector<DBStudent>();

	// creates a database with some students with some taken classes
	public ExternalDB() throws Exception {
		Vector<Course> exampleCoursesTaken = new Vector<Course>();

		exampleCoursesTaken.add(findCourse("CSE-1001"));
		exampleCoursesTaken.add(findCourse("CSE-1002"));
		exampleCoursesTaken.add(findCourse("CSE-4020"));
		DBStudent exampleStudent = new DBStudent(900000000, "John", "a",
				exampleCoursesTaken);
		studentDB.add(exampleStudent);

		exampleCoursesTaken.clear();
		exampleCoursesTaken.add(findCourse("CSE-2050"));
		exampleCoursesTaken.add(findCourse("CSE-2010"));
		DBStudent exampleStudent2 = new DBStudent(900010001, "Bob", "b",
				exampleCoursesTaken);
		studentDB.add(exampleStudent2);
	}

	//
	public Course findCourse(String iD) throws Exception {
		Course returnMe = null;
		AdapterFactory.getInstance();
		for (Course course : AdapterFactory.getCatalogAdapter().getCourses())
			if (course.getiD().equals(iD)) {
				returnMe = course;
				break;
			}
		return returnMe;
	}

	//
	public DBStudent findStudent(long iD) {
		DBStudent returnMe = null;
		for (DBStudent dBStudent : studentDB)
			if (dBStudent.studentID == iD)
				returnMe = dBStudent;
		return returnMe;
	}
}
