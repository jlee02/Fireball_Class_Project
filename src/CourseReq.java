public class CourseReq {
	Course course;
	boolean met;

	public CourseReq(Course course) {
		this.course = course;
	}
	//test just a test
	// check to see if the course described by the course
	//requirement is the same as the course filling it	
	public boolean checkCourseRequirement(Course c){
		if(this.course.equals(c)){
			this.met = true;
			return true;		
		}
		return false;
	}
}
