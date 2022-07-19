//package Project.events.bean;
//
//import java.sql.Timestamp;
//
//import org.apache.log4j.*;
//
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//
//@JsonInclude(JsonInclude.Include.NON_NULL)
//public class CommonBean {
//
//
//	private static Logger log = Logger.getLogger(CommonBean.class.getName());
//
//	@Override
//	public String toString() {
//
//		String str = "";
//		if (log.isDebugEnabled()) {
//			try {
//				ObjectMapper mapper = new ObjectMapper();
//				str = mapper.writeValueAsString(this);
//			} catch (Exception e) {
//				log.error(e + "", e);
//			}
//		} else {
//			str = super.toString();
//		}
//		return str;
//	}
//}
