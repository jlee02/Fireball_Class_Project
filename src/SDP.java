import java.util.Vector;

public class SDP {
	Vector<CourseReq> courseReqs = new Vector<CourseReq>();
	Vector<ElectiveReq> electiveReqs = new Vector<ElectiveReq>();

	SDP(Vector<CourseReq> courseR, Vector<ElectiveReq> electiveR) {
		for (CourseReq courseReq : courseR)
			this.courseReqs.add(courseReq);
		for (ElectiveReq electiveReq : electiveR)
			this.electiveReqs.add(electiveReq);
	}

	SDP(DegreePlan deg) {
		for (CourseReq courseReq : deg.courseReqs)
			this.courseReqs.add(courseReq);
		for (ElectiveReq electiveReq : deg.electiveReqs)
			this.electiveReqs.add(electiveReq);
	}

	public String toString() {
		String returnMe = "";
		for (CourseReq courseR : courseReqs) {
			returnMe = returnMe + courseR.course.info + ": " + String.valueOf(courseR.met) + "\n";
		}
		for (ElectiveReq electiveR : electiveReqs) {
			returnMe = returnMe + electiveR.course.info + ": " + String.valueOf(electiveR.met) + "\n";
		}
		return returnMe;
	}
}
