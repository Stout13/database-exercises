//package Project.events.dao;
//
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Types;
//import java.util.*;
//import java.io.*;
//import org.apache.log4j.*;
////IMPORT_ALL_BEAN_CLASS
////IMPORT_ALL_BASE_CALSS
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.BatchPreparedStatementSetter;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.PreparedStatementCallback;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.dao.EmptyResultDataAccessException;
//import org.springframework.stereotype.Repository;
//import javax.xml.bind.annotation.XmlAttribute;
//import org.springframework.jdbc.core.*;
//import java.sql.*;
//
//import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.JsonMappingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import Project.events.bean.Event;
//import javax.xml.bind.annotation.*;
//import com.fasterxml.jackson.annotation.*;
//@Repository
//@PropertySource(value = {"classpath:event-dao.properties"})
//public class EventDAO {
//private static Logger log = Logger.getLogger(EventDAO.class.getName() );
//@Autowired
//private JdbcTemplate jdbcTemplate;
//@Autowired
//private NamedParameterJdbcTemplate namedJdbcTemplate;
//@Value(value="${EventDao.createEvent}")
//private String createEventQuery;
//@Value(value="${EventDao.updateEvent}")
//private String updateEventQuery;
//@Value(value="${EventDao.deleteEvent}")
//private String deleteEventQuery;
//@Value(value="${EventDao.getEvent}")
//private String getEventQuery;
//@Value(value="${EventDao.getEventListByEventIdOtrs}")
//private String getEventListByEventIdOtrs;
//@Value(value="${EventDao.getEventListByEventIdList}")
//private String getEventListByEventIdList;
//@Value(value="${EventDao.getEventListByDynamicAttrs}")
//private String getEventListByDynamicAttrs;
//@Value(value="${EventDao.getEventListByEventLatOths}")
//private String getEventListByEventLatOths;
///** The batch insert size. */
//@Value(value = "${EventDao.insertBatchSize}")
//private int batchInsertSize;
//
///** The find Event query. */
//@Value(value = "${EventDao.findEventQuery}")
//private String findEventQuery;
//
//public void createEvent( final Event Event) throws SQLException, DataAccessException{        log.debug("createRecord start");
//        log.debug("createRecord start");
//        jdbcTemplate.execute(createEventQuery ,new PreparedStatementCallback<Object>() {              @Override              public Object doInPreparedStatement(PreparedStatement ps)                      throws SQLException, DataAccessException {
//int indx=1;
//  ps.setInteger(indx++, Event.getEventId());
//  ps.setString(indx++, Event.getEventName());
//  ps.setDouble(indx++, Event.getEventLon());
//  ps.setDouble(indx++, Event.getEventLat());
//
//
//                return ps.executeUpdate();              }          }); }
//
//
//
//    public void updateEvent( final Event Event)
//            throws JsonParseException, JsonMappingException, IOException {
//
//        log.debug("updateEvent start");
//        jdbcTemplate.execute(updateEventQuery, new PreparedStatementCallback<Object>() {
//
//            @Override            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//int indx=1;
//  ps.setString(indx++, Event.getEventName());
//  ps.setDouble(indx++, Event.getEventLon());
//  ps.setDouble(indx++, Event.getEventLat());
//  ps.setInteger(indx++, Event.getEventId());
//
//int count = ps.executeUpdate();
//log.debug("Number of records updated="+count);
//if(count==0) throw new SQLException("STALE_DATA_ERROR");
//return count;
//
//            }
//
//        });
//        log.debug("updateEvent end");
//
//    }
//
//    public void deleteEvent( final Event Event) throws IOException {
//        log.debug("deleteEvent start");
//
//       Integer eventId  = Event.getEventId();
//        log.debug("Key.=" + eventId);
//
//        jdbcTemplate.execute(deleteEventQuery, new PreparedStatementCallback<Object>() {
//
//            @Override            public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//                ps.setInteger(1, Event.getEventId());
//                return ps.executeUpdate();
//            }
//
//        });
//        log.debug("delete Event end");
//    }
//
//    public Event getEvent(Event Event) {
//         Integer eventId = Event.getEventId();
//
//        log.debug("KeyCol for Get::" + eventId);
//        Event EventFromDB = null;
//try {
//
//         EventFromDB = jdbcTemplate.queryForObject(getEventQuery  ,
//                new Object[] { eventId }, new BeanPropertyRowMapper<Event>(Event.class));
//        log.debug("VAlue=::" + EventFromDB);} catch(EmptyResultDataAccessException ex) {log.info("No Record Found. It Maybe expected."+ex.toString());
// return null;}
//
//        return EventFromDB;
//    }
//
//    public Event getEventForUpdate(Event Event) {
//         Integer eventId = Event.getEventId();
//
//        log.debug("KeyCol for Get::" + eventId);
//        Event EventFromDB = null;
//try {
//
//         EventFromDB = jdbcTemplate.queryForObject(getEventQuery + " FOR UPDATE "  ,
//                new Object[] { eventId }, new BeanPropertyRowMapper<Event>(Event.class));
//        log.debug("VAlue=::" + EventFromDB);} catch(EmptyResultDataAccessException ex) {log.info("NO RECORD. IT MAY BE EXPECTED."+ex.toString());
// return null;}
//
//        return EventFromDB;
//    }
//public List<Event> getEventListByEventIdAndOtrs(Event Event) {
//		log.debug("Event::" + Event);
//		Object[] parameters = new Object[] { Event.getEventId(),Event.getEventName(),Event.getEventLon(),Event.getEventLat() };
//
//		List<Event> EventObjListFromDB = jdbcTemplate.query(getEventListByEventIdOtrs, parameters,
//				new BeanPropertyRowMapper<Event>(Event.class));
//
//		log.debug("No.Of RecordFoundCount in list=::" + EventObjListFromDB.size());
//		return EventObjListFromDB;
//	}
//
//	public Event getEventByEventIdAndOtrs(Event Event) {
//		List<Event> EventObjListFromDB = getEventListByEventIdAndOtrs(Event);
//		Event EventFromDB = null;
//
//		if (EventObjListFromDB.size() > 0) {
//			EventFromDB = EventObjListFromDB.get(EventObjListFromDB.size() - 1);
//			log.debug("EventFromDBVAlue=::" + EventObjListFromDB.get(EventObjListFromDB.size() - 1));
//		}
//
//		return EventFromDB;
//	}
//
//public List<Event> getEventListByEventLatAndOths(Event Event) {
//		log.debug("Event::" + Event);
//		Object[] parameters = new Object[] { Event.getEventLat(),Event.getEventLat(),Event.getEventLat(),Event.getEventLat() };
//
//		List<Event> EventObjListFromDB = jdbcTemplate.query(getEventListByEventLatOths, parameters,
//				new BeanPropertyRowMapper<Event>(Event.class));
//
//		log.debug("No.Of RecordFoundCount in list=::" + EventObjListFromDB.size());
//		return EventObjListFromDB;
//	}
//
//	public Event getEventByEventLatAndOths(Event Event) {
//		List<Event> EventObjListFromDB = getEventListByEventLatAndOths(Event);
//		Event EventFromDB = null;
//
//		if (EventObjListFromDB.size() > 0) {
//			EventFromDB = EventObjListFromDB.get(EventObjListFromDB.size() - 1);
//			log.debug("EventFromDBVAlue=::" + EventObjListFromDB.get(EventObjListFromDB.size() - 1));
//		}
//
//		return EventFromDB;
//	}
//
//public List<Event> getEventListByEventLatList(
//		List<Event> EventList) {
//	log.debug("EventList::" + EventList);
//	String whereClause = " WHERE 1=2 ";
//	List<Object> list = new ArrayList<Object>();
//	for (Event Event : EventList) {
//		list.add(Event.getEventLat());
//		whereClause = whereClause + " OR event_lat=? ";
//	}
//
//	Object[] parameters = list.toArray();
//
//	List<Event> EventObjListFromDB = jdbcTemplate.query(
//			getEventListByEventIdList + whereClause, parameters,
//			new BeanPropertyRowMapper<Event>(Event.class));
//
//	log.debug("No.Of RecordFoundCount in list=::" + EventObjListFromDB.size());
//	return EventObjListFromDB;
//}
//
//public List<Event> getEventListByDynamicAttrs(
//		 Event Event) {
//	log.debug("Event::" + Event);
//List<Object> paramList=new ArrayList<Object>();
//	String whereClause = " WHERE 1=1 ";
//if (Event.getEventId() != null) {
// whereClause = whereClause + " AND event_id=? ";
// paramList.add(Event.getEventId());
//}
//if (Event.getEventName() != null) {
// whereClause = whereClause + " AND event_name=? ";
// paramList.add(Event.getEventName());
//}
//if (Event.getEventLon() != null) {
// whereClause = whereClause + " AND event_lon=? ";
// paramList.add(Event.getEventLon());
//}
//if (Event.getEventLat() != null) {
// whereClause = whereClause + " AND event_lat=? ";
// paramList.add(Event.getEventLat());
//}
//
//	Object[] parameters = paramList.toArray();
//
//	log.debug("DynamicSQL::" + getEventListByDynamicAttrs+whereClause);
//	List<Event> EventObjListFromDB = jdbcTemplate.query(
//			getEventListByDynamicAttrs + whereClause, parameters,
//			new BeanPropertyRowMapper<Event>(Event.class));
//
//	log.debug("No.Of RecordFoundCount in list=::" + EventObjListFromDB.size());
//	return EventObjListFromDB;
//}
//
//
//public void insertEventBatch(List<Event> EventList) throws SQLException  {
//for (int i = 0; i < EventList.size(); i += this.batchInsertSize) {
//	final List<Event> EventBatch = EventList.subList(i,
//			i + this.batchInsertSize > EventList.size() ? EventList.size() : i + batchInsertSize);
//	int[] noOfEventsInserted = jdbcTemplate.batchUpdate(this.createEventQuery,
//			new BatchPreparedStatementSetter() {
//		public void setValues(PreparedStatement pStmt, int j) throws SQLException {
//			Event Event = (Event) EventBatch.get(j);
//int indx=1;
//			pStmt.setInt(indx++, Event.getEventId());
//			pStmt.setString(indx++, Event.getEventName());
//			pStmt.setDouble(indx++, Event.getEventLon());
//			pStmt.setDouble(indx++, Event.getEventLat());
//			ObjectMapper mapper = new ObjectMapper();
//			// Java objects to JSON string
//			String jsonString = "";
//
//			log.debug("attributes json" + jsonString);
//			pStmt.setString(indx++, jsonString);
//		}
//
//		public int getBatchSize() {
//			return EventBatch.size();
//		}
//	});
//	log.debug("insertEventsBatch end");
//}
//}
//
//
////##PLACE_FOR_PUB_API_DAO_CODE##//
//}
