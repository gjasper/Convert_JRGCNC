package br.com.jaraguacnc.xmlmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLLineList {
	
    List<XMLLine> line = new ArrayList<XMLLine>();

    @XmlElement(name = "Line")
    public void setList(List<XMLLine> line) {
        this.line = line;
    }
}
