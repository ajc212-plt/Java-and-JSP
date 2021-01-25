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
		
		//인터페이스를 통한 다형성 사용
		/*
		TV tv = new SamsungTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		*/
		
		//BeanFactory를 이용해서 필요한 객체를 직접 생성하지 않아도 된다.
		/*BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();*/
		
		
		// 1. Spring 컨테이너를 구동한다. 
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로부터 필요한 객체를 요청(Look up)한다. 
		TV tv = (TV)factory.getBean("");
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		
		// 3. Spring 컨테이너를 종료한다. 
		factory.close();
		
		
		/*
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		//scope="singleton"으로 지정해놓으면 동일한 객체는 한번만 실행한다.
		//		"prototype"은 동일한 객체여도 한번씩 실행한다.
		TV tv1 = (TV)factory.getBean("tv");
		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
				
		factory.close();
		*/
		
	}
}
