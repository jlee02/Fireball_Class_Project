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
		String returnMe = "";
		returnMe.concat(this.name + "\n" + this.studentID + "\n" + this.sDP);
		return name;
	}
}
