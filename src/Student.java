import java.util.Vector;

public class Student {
	int studentID;
	String name;
	SDP sDP;
	Vector<Course> unallocatedCourses = new Vector<Course>();

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
}
