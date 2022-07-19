//package Project.events.service;
//
//import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;
//import org.apache.log4j.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import com.easycodeforall.dao.events.bean.Event;
//import com.easycodeforall.dao.events.dao.EventDAO;
////IMPORT_ALL_BEAN_CLASS
////IMPORT_ALL_BASE_CALSS
//
//public class EventService implements Service {
//private static Logger log = Logger.getLogger(EventService.class.getName() );
//@Autowired
//private  EventDAO EventDAO ;
//public CommonBean  create(Event Event, Map<String, Object> params) throws Exception {
//log.debug("Create Event has been initiated.");
//try {EventDAO.createEvent(Event);
//return Event;
//    } catch (Exception exception) {
//            log.error("Errorin.create", exception);
//            throw exception;
//
//}}
//
//    public CommonBean update(Event Event, Map<String, Object> params) throws Exception {
//
//        log.debug("Update Event has been initiated.");
//        try {
//        Event EventObjFromDB = EventDAO.getEventByEventLatAndOths(Event);  //change it to a correct method to get the Obj from DB.
//setValuesToDbObjectToUpdate( EventObjFromDB,  Event);
//            EventDAO.updateEvent(EventObjFromDB); return EventObjFromDB;
//        } catch (Exception exception) {
//            log.error("Event.Update", exception);
//            throw exception;
//        }
//
//    }
//
//
//    private void setValuesToDbObjectToUpdate(Event EventObjFromDB, Event Event) throws Exception {
//
//if(Event.getEventId()!=null) {
//    EventObjFromDB.setEventId(Event.getEventId());
//}
//if(Event.getEventName()!=null) {
//    EventObjFromDB.setEventName(Event.getEventName());
//}
//if(Event.getEventLon()!=null) {
//    EventObjFromDB.setEventLon(Event.getEventLon());
//}
//if(Event.getEventLat()!=null) {
//    EventObjFromDB.setEventLat(Event.getEventLat());
//}
//
//}
//
//    public CommonBean manage(Event Event, Map<String, Object> params) throws Exception {
//
//        log.debug("Update Event has been initiated.");
//        try {
//        Event EventObjFromDB = EventDAO.getEventByEventLatAndOths(Event);  //change it to a correct method to get the Obj from DB.
//if(EventObjFromDB==null) {
//create(Event, params);
//return Event ;
//}
//setValuesToDbObjectToUpdate( EventObjFromDB,  Event);
//            EventDAO.updateEvent(EventObjFromDB);
//return EventObjFromDB ;
//        } catch (Exception exception) {
//            log.error("Event.Update", exception);
//            throw exception;
//        }
// }
//
//
//    public CommonBean delete(Event Event, Map<String, Object> params) throws Exception {
//
//        log.debug("delete Event has been initiated.");
//        try {
//        Event EventObjFromDB = EventDAO.getEventByEventLatAndOths(Event);  //change it to a correct method to get the Obj from DB.
//            EventDAO.deleteEvent(EventObjFromDB);
//return EventObjFromDB;
//        } catch (Exception exception) {
//            log.error("Event.delete", exception);
//            throw exception;
//        }
//
//        //log.debug("delete done EventKey=" + Event);
//
//    }
//
//    public CommonBean get(Event Event, Map<String, Object> params) throws Exception {
//        log.debug("Update invDemandType has been initiated.");
//        Event EventObjFromDB = null;
//        try {
//            EventObjFromDB = EventDAO.getEventByEventLatAndOths(Event); //Change it to correct mentods
//return EventObjFromDB;
//        } catch (Exception exception) {
//            log.error("Event.delete", exception);
//            throw exception;
//        }
//
//    }
//public List<Event>  getEventListByEventId(Event Event, Map<String, Object> params)
//			throws Exception {
//		log.debug("ListApi has been initiated.");
//		List<Event> EventObjListFromDB = null;
//		try {
//			EventObjListFromDB = EventDAO.getEventListByEventIdAndOtrs(Event);
// return EventObjListFromDB ;		} catch (Exception exception) {
//			log.error("Event.ListApi", exception);
//			throw exception;
//		}
//
//}
//
////##PLACE_FOR_PUB_API_SERVICE_CODE##//
//}
