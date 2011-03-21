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

	// for a student with a fresh DegreePlan and no existing courses
	public Student(int studentID, String name, DegreePlan deg) {
		this.studentID = studentID;
		this.name = name;
		sDP = new SDP(deg);
	}
	
	// for an existing student with an existing SDP and unallocated courses
	public Student (int studentID, String name, SDP sdpStudent, 
			Vector<Course> cListOfCourses){
		this.studentID = studentID;
		this.name = name;
		this.sDP = sdpStudent;
		this.unallocatedCourses = cListOfCourses;		
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
