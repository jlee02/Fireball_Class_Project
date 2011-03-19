import java.util.Vector;

public class Student {
	int studentID;
	String name;
	SDP sDP;
	Vector<Course> unallocatedCourses = new Vector<Course>();

	public Student(int studentID, String name, Vector<CourseReq> courseR,
			Vector<ElectiveReq> electiveR) {
		this.studentID = studentID;
		this.name = name;
		sDP = new SDP(courseR, electiveR);
	}

	public Student(int studentID, String name, DegreePlan deg) {
		this.studentID = studentID;
		this.name = name;
		sDP = new SDP(deg);
	}

	public String toString() {
		return String.valueOf(this.studentID) + " - " + this.name + "\n"
				+ this.sDP;
	}

	public void fillRequirements() {
		// TODO Auto-generated method stub
		for (Course course : unallocatedCourses)
		{
			for (CourseReq courseReq : this.sDP.courseReqs)
				if (course.courseID == courseReq.course.courseID)
					courseReq.met = true;
		}
	}
}
