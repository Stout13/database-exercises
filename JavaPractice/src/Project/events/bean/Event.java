//package Project.events.bean;
//
//import java.sql.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.xml.bind.annotation.XmlAccessType;
//import javax.xml.bind.annotation.XmlAccessorType;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlAttribute;
//import javax.xml.bind.annotation.XmlRootElement;
//import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//import org.springframework.dao.*;
////IMPORT_ALL_BEAN_CLASS
////IMPORT_ALL_BASE_CALSS
//import javax.xml.bind.annotation.*;
//import com.fasterxml.jackson.annotation.*;
//
//import org.apache.log4j.*;
//
//
//
//import com.easycodeforall.dao.events.*;
//@XmlAccessorType(XmlAccessType.NONE)
//@XmlRootElement(name = "Event")
//public class Event extends CommonBean {
//private static Logger log = Logger.getLogger(Event.class );
//  private Integer eventId;
//  private String eventName;
//  private Double eventLon;
//  private Double eventLat;
//@Override
//	public String toString() {
//		if (log.isDebugEnabled()) {
//	StringBuilder builder = new StringBuilder();
//builder.append("\n eventId=" + eventId);
//builder.append("\n eventName=" + eventName);
//builder.append("\n eventLon=" + eventLon);
//builder.append("\n eventLat=" + eventLat);
//			return builder.toString();
//		} else {
//			return "eventId=" + eventId;
//		}
//	}
//
//@XmlAttribute(name = "eventid")
//public Integer getEventId() {
//    return eventId;
//}
//public void  setEventId(Integer eventId) {
//    this.eventId = eventId; //ForDebugging no.9989
//}
//@XmlAttribute(name = "eventname")
//public String getEventName() {
//    return eventName;
//}
//public void  setEventName(String eventName) {
//    this.eventName = eventName; //ForDebugging no.9989
//}
//@XmlAttribute(name = "eventlon")
//public Double getEventLon() {
//    return eventLon;
//}
//public void  setEventLon(Double eventLon) {
//    this.eventLon = eventLon; //ForDebugging no.9989
//}
//@XmlAttribute(name = "eventlat")
//public Double getEventLat() {
//    return eventLat;
//}
//public void  setEventLat(Double eventLat) {
//    this.eventLat = eventLat; //ForDebugging no.9989
//}
//
//}
