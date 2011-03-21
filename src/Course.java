public class Course {
	int courseID;
	String info;

	public Course(int courseID, String info) {
		this.courseID = courseID;
		this.info = info;
	}
	public void main(String[] args){
		Course c = new Course (102, "Failing Class");
		
	}
	// checks for equality between two courses
	// if the elements of course are equal, then return true
	public boolean equals(Course c){
		if (this.courseID == c.courseID && 
				this.info.equals(c.info)){
			return true;
		}
		return false;
	}
}

