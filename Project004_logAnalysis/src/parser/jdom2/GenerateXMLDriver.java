package parser.jdom2;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class GenerateXMLDriver {
		
	/** STATIC FUNCTION: */
	public static String generateChannelXML(List<String> times, List<String> uid, String uidString, String startString) {
		//DOCUMENT
		Document document = new Document();
		
		//ELEMENTS
		Element channelElement = new Element("report");
		document.setRootElement(channelElement);
		
		//GENERATE
		generateChannelXML(channelElement, "//still to implement1", uid, uidString);
		generateChannelXML(channelElement, "//still to implement2", times, startString);

		//RETURN
		return (new XMLOutputter(Format.getPrettyFormat())).outputString(document);
	}
	
	/** STATIC PROCEDURE: */
	public static void generateChannelXML(Element channelElement, String topicName, List<String> topicTutorials, String tag) {
		Element topicElement = new Element("rendering");
		channelElement.addContent(topicElement);
			
		Element nameElement = new Element("document");
		nameElement.addContent(topicName);
		topicElement.addContent(nameElement);
		
		//LOOP
		int i = 0;
		while (i < topicTutorials.size()) {
			nameElement = new Element(tag);
			nameElement.addContent(topicTutorials.get(i++));
			topicElement.addContent(nameElement);
		}
	}

}
