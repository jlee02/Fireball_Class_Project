import java.util.Scanner;

public class UI {

	/**
	 * @param args
	 */
	static Scanner input = new Scanner(System.in);
	static boolean loggedIn = false;
	static Student currentStudent = null;
	static Database tracks = new Database();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Team Fireball's Degree Planner");
		while (!loggedIn) {
			login();
		}
		while (loggedIn) {
			currentStudent = findStudent(Integer.parseInt(input.nextLine()));
			System.out.println("Editing " + currentStudent.name);
		}
	}

	private static void login() {
		String advisorPass; // String password changed to advisorPass
		int advisorID;
		System.out.print("Advisor User ID: ");
		advisorID = Integer.parseInt(input.nextLine());
		System.out.print("Advisor Password: ");
		advisorPass = input.nextLine();
		if (Database.advisorDB[advisorID].equals(advisorPass)) {
			System.out.print("Student User ID: ");
			loggedIn = true;
		}
	}

	private static void logout() {
		loggedIn = false;
	}

	private static Student findStudent(int studentID) {
		if (tracks.find(studentID) == null)
			tracks.studentDB.add(new Student(studentID, input.nextLine()));
		return tracks.find(studentID);
	}
}
