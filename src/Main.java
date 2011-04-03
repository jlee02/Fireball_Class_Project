import java.util.Scanner;

public class Main {

	static String currentCatalog = "";
	static Student currentStudent = null;
	static Scanner input = new Scanner(System.in);

	private static void addStudent() throws Exception {
		// TODO Auto-generated method stub
		long iD;
		String in;
		System.out.print("New student's ID: ");
		iD = Long.parseLong(input.nextLine());
		System.out.println(ExternalDB.getInstance().findStudent(iD).toString());
		System.out.print("Confirm (y/n)? ");
		in = input.nextLine();
		if (in.equals("y")) {
			InternalDB.getUsers().add(new Student(iD));
			currentStudent = InternalDB.findStudent(iD);
			System.out.println("Success");
		} else
			System.out.println("Cancelled");
		System.out.print("Major? ");
		InternalDB.getInstance();
		currentStudent
				.setDegreePlan(InternalDB.findDegreePlan(input.nextLine()));
		System.out.println("Success");
	}

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Degree Planner: Codename Fireball");
		System.out.print("Select operational course catalog: ");
		currentCatalog = input.nextLine();
		AdapterFactory.getInstance();
		AdapterFactory.getCatalogAdapter(currentCatalog);
		boolean running = true;
		do {
			System.out.println("========================================");
			if (currentStudent != null) {
				System.out.print("In work: ");
				System.out.println(currentStudent.getName());
			}
			System.out.println("----------------------------------------");
			System.out.println("1. Select a student");
			System.out.println("2. Add a new student");
			if (currentStudent != null)
				System.out.println("3. View Details");
			System.out.println("9. Exit");
			System.out.println("========================================");
			System.out.print("Query? ");
			switch (Short.parseShort(input.nextLine())) {
			case 1:
				selectStudent();
				break;
			case 2:
				addStudent();
				break;
			case 3:
				System.out.println(currentStudent.fullView());
				break;
			case 9:
				running = false;
				break;
			}
		} while (running);
	}

	private static void selectStudent() {
		// TODO Auto-generated method stub
		System.out.print("Student's ID: ");
		currentStudent = InternalDB
				.findStudent(Long.parseLong(input.nextLine()));
	}
}
