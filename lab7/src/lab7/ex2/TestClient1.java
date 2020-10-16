package lab7.ex2;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.naming.Context;
import javax.naming.InitialContext;

import org.springframework.jms.core.JmsTemplate;

public class TestClient1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Context ctx = new InitialContext();
		ConnectionFactory cfactory = (ConnectionFactory) ctx.lookup("jms/topicConnectionFactory");
		
		Destination myTopic = (Destination) ctx.lookup("jms/MyTopic");
		Destination myTopic2 = (Destination) ctx.lookup("jms/MyTopic2");
		
		JmsTemplate jmst = new JmsTemplate(cfactory);
		
		jmst.convertAndSend(myTopic, "Hi!");
		jmst.convertAndSend(myTopic2, "Hi2!");
	}

}
