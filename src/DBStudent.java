import java.util.Vector;

public class DBStudent {
	Vector<Course> coursesTaken;
	String name;
	String password;
	long studentID;

	// contains information about a student in the database
	
	public DBStudent(long studentID, String name, String password,
			Vector<Course> coursesTaken) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.password = password;
		this.coursesTaken = coursesTaken;
	}

	// Prints the student's ID and Name
	public String toString() {
		String returnMe = "==============================\n";
		returnMe += "Student ID:   " + String.valueOf(this.studentID) + "\n";
		returnMe += "Student Name: " + this.name + "\n";
		returnMe += "==============================";
		return returnMe;
	}
}
