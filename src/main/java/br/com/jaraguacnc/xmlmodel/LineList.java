package br.com.jaraguacnc.xmlmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LineList {
	
    List<Line> line = new ArrayList<Line>();

    @XmlElement(name = "Line")
    public void setList(List<Line> line) {
        this.line = line;
    }
}
