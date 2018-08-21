package cn.itcast.mq.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.mq.producer.ProducerQueue;
import cn.itcast.mq.producer.ProducerTopic;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-mq.xml")
public class ProducerTest {
	@Autowired
	private ProducerQueue producerQueue;
	@Autowired
	
	private ProducerTopic producerTopic;
	
	@Test
	public void test(){
		producerQueue.send("spring_queue", "你好传智博客...");
		producerTopic.send("spring_topic","你好黑马程序员...");
	}
}
