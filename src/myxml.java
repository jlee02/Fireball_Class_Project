/**
 * 
 */
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author behzadtorkian
 *
 */
public class myxml {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			  File file = new File("/Users/behzadtorkian/Desktop/Catalog.xml");
			  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			  DocumentBuilder db = dbf.newDocumentBuilder();
			  Document doc = db.parse(file);
			  doc.getDocumentElement().normalize();
			  System.out.println("Root element " + doc.getDocumentElement().getNodeName());
			  NodeList nodeLst = doc.getElementsByTagName("Course");
			  System.out.println("Catalog Entries");

			  for (int s = 0; s < nodeLst.getLength(); s++) {

			    Node fstNode = nodeLst.item(s);
			    System.out.println(s);
			    
			    if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
			    	
			    
			  
			           Element fstElmnt = (Element) fstNode;
			      NodeList fstNmElmntLst = fstElmnt.getElementsByTagName("CourseName");
			      Element fstNmElmnt = (Element) fstNmElmntLst.item(0);
			      NodeList fstNm = fstNmElmnt.getChildNodes();
			      System.out.println("Course Name : "  + ((Node) fstNm.item(0)).getNodeValue());
			      
			      NodeList lstNmElmntLst = fstElmnt.getElementsByTagName("CourseNumber");
			      Element lstNmElmnt = (Element) lstNmElmntLst.item(0);
			      NodeList lstNm = lstNmElmnt.getChildNodes();
			      System.out.println("Course Number: " + ((Node) lstNm.item(0)).getNodeValue());
			      
			      NodeList secNmElmntLst = fstElmnt.getElementsByTagName("Descriptions");
			      Element secNmElmnt = (Element) secNmElmntLst.item(0);
			      NodeList secNm = secNmElmnt.getChildNodes();
			      System.out.println("Descriptions: " + ((Node) secNm.item(0)).getNodeValue());
			      
			      NodeList thNmElmntLst = fstElmnt.getElementsByTagName("Credit");
			      Element thNmElmnt = (Element) thNmElmntLst.item(0);
			      NodeList thNm = thNmElmnt.getChildNodes();
			      System.out.println("Credit: " + ((Node) thNm.item(0)).getNodeValue());
			      
			      
			      NodeList foNmElmntLst = fstElmnt.getElementsByTagName("PrerequisitName");
			      Element foNmElmnt = (Element) foNmElmntLst.item(0);
			      NodeList foNm = foNmElmnt.getChildNodes();
			      System.out.println("PrerequisitName: " + ((Node) foNm.item(0)).getNodeValue());
			      
			      NodeList fivNmElmntLst = fstElmnt.getElementsByTagName("PrerequisitNumber");
			      Element fivNmElmnt = (Element) fivNmElmntLst.item(0);
			      NodeList fivNm = fivNmElmnt.getChildNodes();
			      System.out.println("PrerequisitNumber: " + ((Node) fivNm.item(0)).getNodeValue());
			      
			      
			      
			      NodeList sixNmElmntLst = fstElmnt.getElementsByTagName("Department");
			      Element sixNmElmnt = (Element) sixNmElmntLst.item(0);
			      NodeList sixNm = sixNmElmnt.getChildNodes();
			      System.out.println("Department: " + ((Node) sixNm.item(0)).getNodeValue());
			      
			      
			      
			      
			      NodeList sevNmElmntLst = fstElmnt.getElementsByTagName("CourseAttributes");
			      Element sevNmElmnt = (Element) sevNmElmntLst.item(0);
			      NodeList sevNm = sevNmElmnt.getChildNodes();
			      System.out.println("CourseAttributes: " + ((Node) sevNm.item(0)).getNodeValue());
			      
			      
			      
			      
			      
			      
			      
			      
			      
			    }

			  }
			  } catch (Exception e) {
			    e.printStackTrace();
			  }

	}

}