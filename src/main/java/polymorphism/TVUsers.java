package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUsers {
	public static void main(String[] args) {
		/*
		SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();*/
		
		/*
		LGTV tv = new LGTV();
		tv.turnOn();
		tv.turnOff();
		tv.soundUp();
		tv.soundDown();*/
		
		//�������̽��� ���� ������ ���
		/*
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		*/
		
		//BeanFactory�� �̿��ؼ� �ʿ��� ��ü�� ���� �������� �ʾƵ� �ȴ�.
		/*BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();*/
		
		
		// 1. Spring �����̳ʸ� �����Ѵ�. 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û(Look up)�Ѵ�. 
		TV tv = (TV)factory.getBean("");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		// 3. Spring �����̳ʸ� �����Ѵ�. 
		factory.close();
		
		
		/*
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		//scope="singleton"���� �����س����� ������ ��ü�� �ѹ��� �����Ѵ�.
		//		"prototype"�� ������ ��ü���� �ѹ��� �����Ѵ�.
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
				
		factory.close();
		*/
		
	}
}
