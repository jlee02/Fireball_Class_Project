import java.util.Vector;

public class Database {
	static String[] advisorDB = { "password", "fireball" };
	static Vector<Student> studentDB = new Vector<Student>();
	static Vector<DegreePlan> degreePlanDB = new Vector<DegreePlan>();
	static Vector<Course> courseDB = new Vector<Course>();
	static Vector<CourseReq> courseRDB = new Vector<CourseReq>();
	static Vector<ElectiveReq> electiveRDB = new Vector<ElectiveReq>();

	public Database() {
		Vector<CourseReq> courseR = new Vector<CourseReq>();
		Vector<ElectiveReq> electiveR = new Vector<ElectiveReq>();
		courseDB.add(new Course(0, "Fun"));
		courseDB.add(new Course(1, "Bad"));
		courseDB.add(new Course(2, "Weird"));
		courseRDB.add(new CourseReq(courseDB.elementAt(0)));
		courseRDB.add(new CourseReq(courseDB.elementAt(1)));
		courseRDB.add(new CourseReq(courseDB.elementAt(2)));
		electiveRDB.add(new ElectiveReq(courseDB.elementAt(0)));
		electiveRDB.add(new ElectiveReq(courseDB.elementAt(1)));
		electiveRDB.add(new ElectiveReq(courseDB.elementAt(2)));
		degreePlanDB.add(new DegreePlan());
		degreePlanDB.firstElement().courseReqs.add(courseRDB.elementAt(0));
		degreePlanDB.firstElement().courseReqs.add(courseRDB.elementAt(1));
		degreePlanDB.firstElement().electiveReqs.add(electiveRDB.elementAt(0));
		degreePlanDB.firstElement().name = "mechanical engineering";
		courseR.add(courseRDB.firstElement());
		courseR.add(courseRDB.lastElement());
		electiveR.add(electiveRDB.firstElement());
		electiveR.add(electiveRDB.lastElement());
		studentDB.add(new Student(9000, "Sam", courseR, electiveR));
		studentDB.elementAt(0).unallocatedCourses.add(courseDB.elementAt(0));
		studentDB.elementAt(0).unallocatedCourses.add(courseDB.elementAt(2));
		studentDB.elementAt(0).fillRequirements();
		courseR.remove(courseR.lastElement());
		electiveR.remove(electiveR.lastElement());
		studentDB.add(new Student(9001, "Bob", courseR, electiveR));
	}

	public Student find(int studentID) {
		for (Student i : studentDB) {
			if (i.studentID == studentID)
				return i;
		}
		return null;
	}
}
