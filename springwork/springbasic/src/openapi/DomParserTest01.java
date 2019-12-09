package openapi;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomParserTest01 {

	public static void main(String[] args) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder domparser = factory.newDocumentBuilder();
		Document document = domparser.parse("src/openapi/dept.xml");
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		
		NodeList nodelist = root.getElementsByTagName("dept");
		System.out.println(nodelist.getLength());
		for(int i=0; i<nodelist.getLength();i++)
		{
			Node node = nodelist.item(i);
			System.out.println("³ëµå¸í: "+node.getNodeName());
		}
	}

}
