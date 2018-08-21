package cn.itcast.mq.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Service;

@Service
public class ConsumerQueue implements MessageListener{

	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
			try {
				System.out.println("消费者Queue获取信息.."+textMessage.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
	
	}

}
