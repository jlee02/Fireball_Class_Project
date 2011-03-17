import java.util.Scanner;

public class UI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String advisorPass; //String password changed to advisorPass
		int advisorID;
		System.out.println("Team Fireball's Degree Planner");
		System.out.print("Advisor User ID: ");
		advisorID = Integer.parseInt(input.nextLine());
		System.out.print("Advisor Password: ");
		advisorPass = input.nextLine();
		System.out.println(advisorID + " " + advisorPass);
	}

}
