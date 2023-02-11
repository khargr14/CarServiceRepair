package dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;

public class JDomParserExample {


    public static void main(String argv[])
            throws ParserConfigurationException, SAXException, IOException {


        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {

            System.out.println("---- This IS Employee.xml ----");
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("C:\\Users\\Aman\\IdeaProjects\\CarServiceRepair\\src\\main\\java\\util/Employees_info.xml");//Here i am fetching the details of country.xml file

            NodeList nodeList = document.getElementsByTagName("Personnelinformation");//Here i am fetching by tag name

            for (int i = 0; i <= nodeList.getLength() - 1; i++) {

                Node node = nodeList.item(i);
                Element element = (Element) node;

                System.out.println("---- Element: " + (i + 1) + " ----");
                System.out.println("Country Name: " + getElementText(element, "name"));
                System.out.println("Alfa Code: " + getElementText(element, "alpha_code"));
                System.out.println("Phonenumber: " + getElementText(element, "phonenumber"));
                System.out.println("Primary Language: " + getElementText(element, "primary_language"));

            }  Document document2 = documentBuilder.parse("C:\\Users\\Aman\\IdeaProjects\\CarServiceRepair\\src\\main\\java\\util/Customer_info.xml");
            System.out.println("---- This IS Customer.xml ----");
            NodeList nodeList2 = document2.getElementsByTagName("Personnel_informaion");
            for (int i = 0; i <= nodeList2.getLength() - 1; i++) {

                Node node = nodeList2.item(i);
                Element element = (Element) node;

                System.out.println("---- Element: " + (i + 1) + " ----");
                System.out.println("Name: " + getElementText(element, "name"));
                System.out.println("Alfa Code: " + getElementText(element, "alpha_code"));
                System.out.println("Phone: " + getElementText(element, "phone"));
                System.out.println("Car: " + getElementText(element, "car"));
            }
            Document document3 = documentBuilder.parse("C:\\Users\\Aman\\IdeaProjects\\CarServiceRepair\\src\\main\\java\\util/Cardetails.xml");
            ArrayList<JCardetails> cList = new ArrayList<>();
            document3.getDocumentElement().normalize();
            System.out.println("Root element: " + document3.getDocumentElement().getNodeName());
            NodeList nList = document3.getElementsByTagName("cardetail");
            JCardetails c;
            System.out.println("---- This IS Cardetails.xml ----");
            for(int i = 0;i<nList.getLength();i++) {
                c = new JCardetails();
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;
                    c.id = Integer.parseInt(e.getElementsByTagName("id").item(0).getTextContent());
                    c.carmodel = e.getElementsByTagName("carmodel").item(0).getTextContent();
                    c.carname = e.getElementsByTagName("carname").item(0).getTextContent();
                    cList.add(c);
                }
            }
            cList.forEach(e ->{
                System.out.println("---------------");
                System.out.println("id : "+e.id);
                System.out.println("name : "+e.carmodel);
                System.out.println("address : "+e.carname);
            });
            
            Document document4 = documentBuilder.parse("C:\\Users\\Aman\\IdeaProjects\\CarServiceRepair\\src\\main\\java\\util/Car_Spare_Part.xml");
            System.out.println("---- This IS Spare_Part.xml ----");
            NodeList nodeList4 = document4.getElementsByTagName("spareparts");
            for (int i = 0; i <= nodeList4.getLength() - 1; i++) {

                Node node = nodeList4.item(i);
                Element element = (Element) node;

                System.out.println("---- Element: " + (i + 1) + " ----");
                System.out.println("Tyres: " + getElementText(element, "tyres"));
                System.out.println("Gears: " + getElementText(element, "gears"));
                System.out.println("Stearing: " + getElementText(element, "stearing"));
                System.out.println("Crankshaft: " + getElementText(element, "crankshaft"));}}
            catch (ParserConfigurationException e) {
            e.getMessage();
        }


    }




    public static String getElementText(Element element, String tagName) {
        return element.getElementsByTagName(tagName).item(0).getTextContent();
    }

}
