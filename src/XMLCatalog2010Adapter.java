import java.io.File;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLCatalog2010Adapter implements IcatalogAdapter {
	private Vector<Course> courses = new Vector<Course>();

	public XMLCatalog2010Adapter() throws Exception {
		Course newCourse = null;
		Course preCourse = null;
		File file = new File("Catalog.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nodeLst = doc.getElementsByTagName("Course");

		for (int s = 0; s < nodeLst.getLength(); s++) {

			Node fstNode = nodeLst.item(s);
			newCourse = new Course();

			if (fstNode.getNodeType() == Node.ELEMENT_NODE) {

				Element fstElmnt = (Element) fstNode;

				NodeList fstNmElmntLst = fstElmnt
						.getElementsByTagName("CourseName");
				Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
				NodeList fstNm = fstNmElmnt.getChildNodes();
				newCourse.setName(fstNm.item(0).getNodeValue().toString());

				NodeList lstNmElmntLst = fstElmnt
						.getElementsByTagName("CourseNumber");
				Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
				NodeList lstNm = lstNmElmnt.getChildNodes();
				newCourse.setiD(lstNm.item(0).getNodeValue());

				NodeList secNmElmntLst = fstElmnt
						.getElementsByTagName("Descriptions");
				Element secNmElmnt = (Element) secNmElmntLst.item(0);
				NodeList secNm = secNmElmnt.getChildNodes();
				newCourse.setDescription(secNm.item(0).getNodeValue());

				NodeList thNmElmntLst = fstElmnt.getElementsByTagName("Credit");
				Element thNmElmnt = (Element) thNmElmntLst.item(0);
				NodeList thNm = thNmElmnt.getChildNodes();
				newCourse.setCredits(Integer.parseInt(thNm.item(0)
						.getNodeValue()));

				newCourse.setPrerequisites(new Vector<Icourse>());
				NodeList foNmElmntLst = fstElmnt
						.getElementsByTagName("PrerequisitName");
				Element foNmElmnt = (Element) foNmElmntLst.item(0);
				NodeList foNm = foNmElmnt.getChildNodes();
				preCourse = new Course();
				preCourse.setName(foNm.item(0).getNodeValue());

				NodeList fivNmElmntLst = fstElmnt
						.getElementsByTagName("PrerequisitNumber");
				Element fivNmElmnt = (Element) fivNmElmntLst.item(0);
				NodeList fivNm = fivNmElmnt.getChildNodes();
				preCourse.setiD(fivNm.item(0).getNodeValue());

				newCourse.getPrerequisites().add(preCourse);

				NodeList sixNmElmntLst = fstElmnt
						.getElementsByTagName("Department");
				Element sixNmElmnt = (Element) sixNmElmntLst.item(0);
				NodeList sixNm = sixNmElmnt.getChildNodes();

				NodeList sevNmElmntLst = fstElmnt
						.getElementsByTagName("CourseAttributes");
				Element sevNmElmnt = (Element) sevNmElmntLst.item(0);
				NodeList sevNm = sevNmElmnt.getChildNodes();
				newCourse.setAttributes(sevNm.item(0).getNodeValue());

				courses.add(newCourse);
			}

		}
	}

	@Override
	public Course getCourse(String iD) {
		Course returnMe = null;
		// TODO Auto-generated method stub
		for (Course course : courses)
			if (course.getiD().equals(iD))
				returnMe = course;
		return returnMe;
	}

	public Vector<Course> getCourses() {
		return courses;
	}
}
