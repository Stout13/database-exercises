//package Project.events.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
////IMPORT_ALL_BEAN_CLASS
////IMPORT_ALL_BASE_CALSS
//import org.apache.log4j.*;
//import org.springframework.jdbc.core.RowMapper;
//import Project.events.bean.Event;
//
//public class EventRowMapper implements RowMapper<Event> {
//private static Logger log = Logger.getLogger(EventRowMapper.class.getName() );
//public Event mapRow(ResultSet resultSet, int rowNum) throws SQLException {
// Event Event = new Event();
//Event.setEventId(resultSet.getInt("event_id"));
//Event.setEventName(resultSet.getString("event_name"));
//Event.setEventLon(resultSet.getDouble("event_lon"));
//Event.setEventLat(resultSet.getDouble("event_lat"));
//return  Event;
//};
//}
