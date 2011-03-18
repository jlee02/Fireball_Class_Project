import java.util.Vector;

public class Database {
	static String[] advisorDB = { "password", "fireball" };
	static Vector<Student> studentDB = new Vector<Student>();
	static Vector<DegreePlan> degreePlanDB = new Vector<DegreePlan>();
	static Vector<Course> courseDB = new Vector<Course>();
	
	public Database(){
		studentDB.add(new Student(9000,"Sam"));
		studentDB.add(new Student(9001,"Bob"));
		courseDB.add(new Course(0, "Fun"));
		
		degreePlanDB.add(new DegreePlan());
	}
	
	public Student find(int studentID) {
		for (Student i : studentDB)
		{
			if (i.studentID == studentID)
				return i;
		}
		return null;
	}
}
