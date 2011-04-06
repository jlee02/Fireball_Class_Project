import java.util.Vector;

// 

public class Student extends User {
	private Vector<Course> coursesTaken;
	private DegreePlan degreePlan;
	private long studentID;
	private Vector<Course> unusedCourses;

	
	public Student(long studentID) throws Exception {
		// defines a student as a user
		super(0, "", "");
		DBStudent temp = ExternalDB.getInstance().findStudent(studentID);
		
		// gains information from student Database
		this.setiD(InternalDB.getUsers().size());
		this.setName(temp.name);
		this.setPassword(temp.password);
		this.setStudentID(studentID);
		this.coursesTaken = temp.coursesTaken;
		this.unusedCourses = temp.coursesTaken;
	}

	//  shows student's name, ID and Major
	public String fullView() {
		String returnMe = "========================================\n";
		returnMe += "Student ID:   " + String.valueOf(this.getStudentID())
				+ "\n";
		returnMe += "Student Name: " + this.getName() + "\n";
		returnMe += "Student Major: " + this.degreePlan.getMajor() + "\n";
		for (Requirement req : this.degreePlan.getRequirements())
			returnMe += req + "\n";
		returnMe += "========================================";
		return returnMe;
	}

	public Vector<Course> getCoursesTaken() {
		return coursesTaken;
	}

	public DegreePlan getDegreePlan() {
		return degreePlan;
	}

	/**
	 * @return the studentID
	 */
	public long getStudentID() {
		return studentID;
	}

	public Vector<Course> getUnusedCourses() {
		return unusedCourses;
	}

	public void setCoursesTaken(Vector<Course> coursesTaken) {
		this.coursesTaken = coursesTaken;
	}

	public void setDegreePlan(DegreePlan degreePlan) {
		this.degreePlan = degreePlan;
		unusedCourses.clear();
		for (Course course : coursesTaken)
			unusedCourses.add(course);
		for (Course course : unusedCourses)
			for (Requirement req : degreePlan.getRequirements())
				for (Course cR : req.getMayBeFulfilledBy())
					if (course.equals(cR)) {
						req.setFulfilled(true);
						break;
					}
	}

	/**
	 * @param studentID
	 *            the studentID to set
	 */
	public void setStudentID(long studentID) {
		this.studentID = studentID;
	}

	public void setUnusedCourses(Vector<Course> unusedCourses) {
		this.unusedCourses = unusedCourses;
	}

	public String toString() {
		String returnMe = "==============================\n";
		returnMe += "Student ID:   " + String.valueOf(this.getStudentID())
				+ "\n";
		returnMe += "Student Name: " + this.getName() + "\n";
		returnMe += "==============================";
		return returnMe;
	}
}
