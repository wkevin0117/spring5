package lab7.ex4;

import javax.jms.Message;
import javax.jms.TextMessage;

public class MyMessasgeDrivenPojo implements javax.jms.MessageListener {

	@Override
	public void onMessage(Message msg) {
		// TODO Auto-generated method stub
		try{
		System.out.println("Received : " + ((TextMessage)msg).getText());
		}catch(Exception ex){ex.printStackTrace();}
	}
	

}
