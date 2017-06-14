package paint;

import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/**
 *
 * @author HP SAUDI
 */
public class saveLoad {
    
    public void save(ArrayList<shape> shapes, String filePath) throws ParserConfigurationException, FileNotFoundException, IOException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();
        Document xmlDocument = builder.newDocument();
        Element rootEle = xmlDocument.createElement("Shapes");
        
        for (shape s : shapes) {
            if (s instanceof circle) {
                circle c = (circle) s;
                Element circ = xmlDocument.createElement("circle");
                Element x = xmlDocument.createElement("x-value");
                Element y = xmlDocument.createElement("y-value");
                Text xval = xmlDocument.createTextNode(c.getStartpoint().getX() + "");
                Text yval = xmlDocument.createTextNode(c.getStartpoint().getY() + "");
                Element Rad = xmlDocument.createElement("Radius");
                Text val = xmlDocument.createTextNode(c.getRaduis() + "");
               Element red = xmlDocument.createElement("Red");
                Element green = xmlDocument.createElement("green");
                Element blue = xmlDocument.createElement("Blue");
                Element stroke = xmlDocument.createElement("Stroke");
                Text st = xmlDocument.createTextNode(c.getStroke() + "");
                
                Text colorRed = xmlDocument.createTextNode(c.getColor().getRed() + "");
                Text colorGreen = xmlDocument.createTextNode(c.getColor().getGreen() + "");
                Text colorBlue = xmlDocument.createTextNode(c.getColor().getBlue() + "");
                
                red.appendChild(colorRed);
                green.appendChild(colorGreen);
                blue.appendChild(colorBlue);
                Element filled = xmlDocument.createElement("Filled");
                Text fill = xmlDocument.createTextNode(c.isFilled() + "");
                
                x.appendChild(xval);
                y.appendChild(yval);
                circ.appendChild(x);
                circ.appendChild(y);
                Rad.appendChild(val);
                circ.appendChild(Rad);
                circ.appendChild(red);
                circ.appendChild(green);
                circ.appendChild(blue);
                stroke.appendChild(st);
                circ.appendChild(stroke);
                filled.appendChild(fill);
                circ.appendChild(filled);
                rootEle.appendChild(circ);
                
            } else if (s instanceof line) {
                line l = (line) s;
                Element linee = xmlDocument.createElement("line");
                Element x = xmlDocument.createElement("x-value");
                Element y = xmlDocument.createElement("y-value");
                Text xval = xmlDocument.createTextNode(l.getStartpoint().getX() + "");
                Text yval = xmlDocument.createTextNode(l.getStartpoint().getY() + "");
                Element x1 = xmlDocument.createElement("x-value");
                Element y1 = xmlDocument.createElement("y-value");
                Text xval1 = xmlDocument.createTextNode(l.getEndppoint().getX() + "");
                Text yval1 = xmlDocument.createTextNode(l.getEndppoint().getY() + "");
               Element red = xmlDocument.createElement("Red");
                Element green = xmlDocument.createElement("green");
                Element blue = xmlDocument.createElement("Blue");
                
                Text colorRed = xmlDocument.createTextNode(l.getColor().getRed() + "");
                Text colorGreen = xmlDocument.createTextNode(l.getColor().getGreen() + "");
                Text colorBlue = xmlDocument.createTextNode(l.getColor().getBlue() + "");
                
                
                Element filled = xmlDocument.createElement("Filled");
                Text fill = xmlDocument.createTextNode(l.isFilled() + "");
                 Element stroke = xmlDocument.createElement("Stroke");
                Text st = xmlDocument.createTextNode(l.getStroke() + "");
                
                x.appendChild(xval);
                y.appendChild(yval);
                linee.appendChild(x);
                linee.appendChild(y);
                x1.appendChild(xval1);
                y1.appendChild(yval1);
                linee.appendChild(x1);
                linee.appendChild(y1);
                red.appendChild(colorRed);
                green.appendChild(colorGreen);
                blue.appendChild(colorBlue);
                linee.appendChild(red);
                linee.appendChild(green);
                linee.appendChild(blue);
                filled.appendChild(fill);
                linee.appendChild(filled);
                 stroke.appendChild(st);
                linee.appendChild(stroke);
                rootEle.appendChild(linee);
                
            } else if (s instanceof square) {
                square sq = (square) s;
                Element squaree = xmlDocument.createElement("square");
                Element x = xmlDocument.createElement("x-value");
                Element y = xmlDocument.createElement("y-value");
                Text xval = xmlDocument.createTextNode(sq.getStartpoint().getX() + "");
                Text yval = xmlDocument.createTextNode(sq.getStartpoint().getY() + "");
                Element side = xmlDocument.createElement("Side");
                Text val = xmlDocument.createTextNode(sq.getSide() + "");
              Element red = xmlDocument.createElement("Red");
                Element green = xmlDocument.createElement("green");
                Element blue = xmlDocument.createElement("Blue");
                
                Text colorRed = xmlDocument.createTextNode(sq.getColor().getRed() + "");
                Text colorGreen = xmlDocument.createTextNode(sq.getColor().getGreen() + "");
                Text colorBlue = xmlDocument.createTextNode(sq.getColor().getBlue() + "");
                Element filled = xmlDocument.createElement("Filled");
                Text fill = xmlDocument.createTextNode(sq.isFilled() + "");
                  Element stroke = xmlDocument.createElement("Stroke");
                Text st = xmlDocument.createTextNode(sq.getStroke() + "");
                
                red.appendChild(colorRed);
                green.appendChild(colorGreen);
                blue.appendChild(colorBlue);
                
                x.appendChild(xval);
                y.appendChild(yval);
                side.appendChild(val);
                squaree.appendChild(x);
                squaree.appendChild(y);
                squaree.appendChild(side);
                squaree.appendChild(red);
                squaree.appendChild(green);
                squaree.appendChild(blue);
                filled.appendChild(fill);
                squaree.appendChild(filled);
                 stroke.appendChild(st);
                squaree.appendChild(stroke);
                rootEle.appendChild(squaree);
                
            } else if (s instanceof ellipse) {
                ellipse el = (ellipse) s;
                Element elipsee = xmlDocument.createElement("Ellipse");
                Element x = xmlDocument.createElement("x-value");
                Element y = xmlDocument.createElement("y-value");
                Text xval = xmlDocument.createTextNode(el.getStartpoint().getX() + "");
                Text yval = xmlDocument.createTextNode(el.getStartpoint().getY() + "");
                Element Rad1 = xmlDocument.createElement("Radius1");
                Text val1 = xmlDocument.createTextNode(el.getRaduis1() + "");
                Element Rad2 = xmlDocument.createElement("Radius2");
                Text val2 = xmlDocument.createTextNode(el.getRaduis2() + "");
                Element red = xmlDocument.createElement("Red");
                Element green = xmlDocument.createElement("green");
                Element blue = xmlDocument.createElement("Blue");
                
                
                Text colorRed = xmlDocument.createTextNode(el.getColor().getRed() + "");
                Text colorGreen = xmlDocument.createTextNode(el.getColor().getGreen() + "");
                Text colorBlue = xmlDocument.createTextNode(el.getColor().getBlue() + "");
                 Element filled = xmlDocument.createElement("Filled");
                Text fill = xmlDocument.createTextNode(el.isFilled() + "");
                  Element stroke = xmlDocument.createElement("Stroke");
                Text st = xmlDocument.createTextNode(el.getStroke() + "");
                
                red.appendChild(colorRed);
                green.appendChild(colorGreen);
                blue.appendChild(colorBlue);
                x.appendChild(xval);
                y.appendChild(yval);
               
                Rad1.appendChild(val1);
                Rad2.appendChild(val2);
                elipsee.appendChild(Rad1);
                elipsee.appendChild(Rad2);
                 elipsee.appendChild(x);
                elipsee.appendChild(y);
                elipsee.appendChild(red);
                elipsee.appendChild(green);
                elipsee.appendChild(blue);
                filled.appendChild(fill);
                elipsee.appendChild(filled);
                stroke.appendChild(st);
                elipsee.appendChild(stroke);
                rootEle.appendChild(elipsee);
                
            } else if (s instanceof rectangle) {
                rectangle rect = (rectangle) s;
                Element rectanglee = xmlDocument.createElement("Rectangle");
                Element x = xmlDocument.createElement("x1-value");
                Element y = xmlDocument.createElement("y1-value");
                Text xval = xmlDocument.createTextNode(rect.getStartpoint().getX() + "");
                Text yval = xmlDocument.createTextNode(rect.getStartpoint().getY() + "");
                Element x1 = xmlDocument.createElement("x2-value");
                Element y1 = xmlDocument.createElement("y2-value");
                Text xval1 = xmlDocument.createTextNode(rect.getEndpt().getX() + "");
                Text yval1 = xmlDocument.createTextNode(rect.getEndpt().getY() + "");
              Element red = xmlDocument.createElement("Red");
                Element green = xmlDocument.createElement("green");
                Element blue = xmlDocument.createElement("Blue");
                
                Text colorRed = xmlDocument.createTextNode(rect.getColor().getRed() + "");
                Text colorGreen = xmlDocument.createTextNode(rect.getColor().getGreen() + "");
                Text colorBlue = xmlDocument.createTextNode(rect.getColor().getBlue() + "");
                    Element stroke = xmlDocument.createElement("Stroke");
                Text st = xmlDocument.createTextNode(rect.getStroke() + "");
                
                red.appendChild(colorRed);
                green.appendChild(colorGreen);
                blue.appendChild(colorBlue);
                Element filled = xmlDocument.createElement("Filled");
                Text fill = xmlDocument.createTextNode(rect.isFilled() + "");
               
                
                x.appendChild(xval);
                y.appendChild(yval);
                rectanglee.appendChild(x);
                rectanglee.appendChild(y);
                x1.appendChild(xval1);
                y1.appendChild(yval1);
                rectanglee.appendChild(x1);
                rectanglee.appendChild(y1);
                rectanglee.appendChild(red);
                rectanglee.appendChild(green);
                rectanglee.appendChild(blue);
                filled.appendChild(fill);
                rectanglee.appendChild(filled);
                stroke.appendChild(st);
                rectanglee.appendChild(stroke);
                rootEle.appendChild(rectanglee);
                
            } else if (s instanceof triangle) {
               
            
                triangle tri = (triangle) s;
                
                     
                 
                Element trianglee = xmlDocument.createElement("Triangle");
                Element x1 = xmlDocument.createElement("x1-value");
                Element y1 = xmlDocument.createElement("y1-value");
                Element k= xmlDocument.createElement("k");
                Text xval1 = xmlDocument.createTextNode(tri.getStartpoint().getX() + "");
                Text yval1 = xmlDocument.createTextNode(tri.getStartpoint().getY() + "");
                Text k1=xmlDocument.createTextNode(tri.k + "");

                Element x3 = xmlDocument.createElement("x3-value");
                Element y3 = xmlDocument.createElement("y3-value");
                Text xval3 = xmlDocument.createTextNode(tri.getThirdpt().getX() + "");
                Text yval3 = xmlDocument.createTextNode(tri.getThirdpt().getY() + "");
                
                Element red = xmlDocument.createElement("Red");
                Element green = xmlDocument.createElement("green");
                Element blue = xmlDocument.createElement("Blue");
                
                Text colorRed = xmlDocument.createTextNode(tri.getColor().getRed() + "");
                Text colorGreen = xmlDocument.createTextNode(tri.getColor().getGreen() + "");
                Text colorBlue = xmlDocument.createTextNode(tri.getColor().getBlue() + "");
                
                red.appendChild(colorRed);
                green.appendChild(colorGreen);
                blue.appendChild(colorBlue);
                
                Element filled = xmlDocument.createElement("Filled");
                Text fill = xmlDocument.createTextNode(tri.isFilled() + "");
                  Element stroke = xmlDocument.createElement("Stroke");
                Text st = xmlDocument.createTextNode(tri.getStroke() + "");
                
                x1.appendChild(xval1);
                y1.appendChild(yval1);

                x3.appendChild(xval3);
                y3.appendChild(yval3);
                k.appendChild(k1);
                
                trianglee.appendChild(x1);
                
                trianglee.appendChild(y1);

                trianglee.appendChild(x3);
                
                trianglee.appendChild(y3);
                trianglee.appendChild(k);
                
                
                trianglee.appendChild(red);
                trianglee.appendChild(green);
                trianglee.appendChild(blue);
                filled.appendChild(fill);
                trianglee.appendChild(filled);
                 stroke.appendChild(st);
                trianglee.appendChild(stroke);
                rootEle.appendChild(trianglee);
                 

            }
                

        }
        xmlDocument.appendChild(rootEle);
        OutputFormat outformat = new OutputFormat(xmlDocument);
        outformat.setIndenting(true);
        File xmlfile = new File(filePath);
        
        FileOutputStream outstream = new FileOutputStream(xmlfile);
        XMLSerializer serializer = new XMLSerializer(outstream, outformat);
        serializer.serialize(xmlDocument);
        
        
    }
    
     public ArrayList<shape> Load(String filePath) throws ParserConfigurationException, FileNotFoundException, IOException, SAXException {
        ArrayList<shape> sh = new ArrayList();
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = fact.newDocumentBuilder();
        Document xmlDocument = builder.parse(new File(filePath));
        Element e = (Element) xmlDocument.getElementsByTagName("Shapes").item(0);
       
        
        NodeList n = e.getChildNodes();
        for (int i = 0; i < n.getLength(); i++) {

                {
            if (n.item(i).getNodeName().equalsIgnoreCase("Triangle")) {
                NodeList c = n.item(i).getChildNodes();
               int x=0;
               int y=0;
               
               
                
                int xval1 = Integer.parseInt(c.item(1).getTextContent());
                int yval1 = Integer.parseInt(c.item(3).getTextContent());
                
                int xval3 = Integer.parseInt(c.item(5).getTextContent());
                int yval3 = Integer.parseInt(c.item(7).getTextContent());
                int k = Integer.parseInt(c.item(9).getTextContent());
                point p=new point(x,y);
                int red = Integer.parseInt(c.item(11).getTextContent());;
                int green = Integer.parseInt(c.item(13).getTextContent());;
                int blue = Integer.parseInt(c.item(15).getTextContent());;
                boolean filled = Boolean.parseBoolean(c.item(17).getTextContent());
                triangle t = new triangle(new point(xval1, yval1),new point(xval3,yval3),k , new Color(red, green, blue), filled);
                p.setX(xval3);
                p.setY(yval3);
                
                t.setThirdpt(p);
                
                sh.add(t);
               

            }

              else if (n.item(i).getNodeName().equalsIgnoreCase("circle")) {
                NodeList c = n.item(i).getChildNodes();
                
                int xval = Integer.parseInt(c.item(1).getTextContent());
                int yval = Integer.parseInt(c.item(3).getTextContent());
                int rad=Integer.parseInt(c.item(5).getTextContent());
                int red = Integer.parseInt(c.item(7).getTextContent());;
                int green = Integer.parseInt(c.item(9).getTextContent());;
                int blue = Integer.parseInt(c.item(11).getTextContent());;
                boolean filled = Boolean.parseBoolean(c.item(13).getTextContent());
                circle circ = new circle(new point(xval, yval),rad,new Color(red, green, blue), filled);
                circ.setRaduis(rad);
               
                sh.add(circ);
               

            }
            else if (n.item(i).getNodeName().equalsIgnoreCase("elipse")) {
                NodeList c = n.item(i).getChildNodes();
                 int rad1 = Integer.parseInt(c.item(1).getTextContent());
                int rad2 = Integer.parseInt(c.item(3).getTextContent());
                int xval = Integer.parseInt(c.item(5).getTextContent());
                int yval = Integer.parseInt(c.item(7).getTextContent());
               
                int red = Integer.parseInt(c.item(9).getTextContent());;
                int green = Integer.parseInt(c.item(11).getTextContent());;
                int blue = Integer.parseInt(c.item(13).getTextContent());;
                boolean filled = Boolean.parseBoolean(c.item(15).getTextContent());
                ellipse el = new ellipse(rad1,rad2,new point(xval, yval),new Color(red, green, blue), filled);
                el.setRaduis1(rad1);
                el.setRaduis2(rad2);
               
                sh.add(el);
                

            }
            else if (n.item(i).getNodeName().equalsIgnoreCase("line")) {
                NodeList c = n.item(i).getChildNodes();
                int x=0;
                int y=0;
                int xval1 = Integer.parseInt(c.item(1).getTextContent());
                int yval1 = Integer.parseInt(c.item(3).getTextContent());
                int xval2 = Integer.parseInt(c.item(5).getTextContent());
                int yval2 = Integer.parseInt(c.item(7).getTextContent());
                point p=new point(x,y);
                int red = Integer.parseInt(c.item(9).getTextContent());;
                int green = Integer.parseInt(c.item(11).getTextContent());;
                int blue = Integer.parseInt(c.item(13).getTextContent());;
                boolean filled = Boolean.parseBoolean(c.item(15).getTextContent());
                line l = new line(new point(xval1, yval1),new point(xval2, yval2), new Color(red, green, blue), filled);
            p.setX(xval2);
            p.setY(yval2);
            l.setEndppoint(p);
               
                sh.add(l);
               

            }

             else if (n.item(i).getNodeName().equalsIgnoreCase("rectangle")) {
                NodeList c = n.item(i).getChildNodes();
                int x=0;
                int y=0;
                int xval1 = Integer.parseInt(c.item(1).getTextContent());
                int yval1 = Integer.parseInt(c.item(3).getTextContent());
                int xval2 = Integer.parseInt(c.item(5).getTextContent());
                int yval2 = Integer.parseInt(c.item(7).getTextContent());
                point p=new point(x,y);
                int red = Integer.parseInt(c.item(9).getTextContent());;
                int green = Integer.parseInt(c.item(11).getTextContent());;
                int blue = Integer.parseInt(c.item(13).getTextContent());;
                boolean filled = Boolean.parseBoolean(c.item(15).getTextContent());
                rectangle r = new rectangle(new point(xval1, yval1),new point(xval2, yval2), new Color(red, green, blue), filled);
            p.setX(xval2);
            p.setY(yval2);
            r.setEndpt(p);
               
                sh.add(r);
              

            }
             else if (n.item(i).getNodeName().equalsIgnoreCase("square")) {
                NodeList c = n.item(i).getChildNodes();
                
                int xval1 = Integer.parseInt(c.item(1).getTextContent());
                int yval1 = Integer.parseInt(c.item(3).getTextContent());
                int side=Integer.parseInt(c.item(5).getTextContent());
                int red = Integer.parseInt(c.item(7).getTextContent());;
                int green = Integer.parseInt(c.item(9).getTextContent());;
                int blue = Integer.parseInt(c.item(11).getTextContent());;
                boolean filled = Boolean.parseBoolean(c.item(13).getTextContent());
                square sq = new square( side,new point(xval1, yval1), new Color(red, green, blue), filled);
          sq.setSide(side);
               
                sh.add(sq);
               

            }
            

                }
        
    }
         return sh;
}
}


    
