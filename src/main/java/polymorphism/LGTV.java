package polymorphism;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LGTV implements TV {
	
	@Autowired
	private Speaker speaker;
	
	public LGTV() {
		System.out.println("===> LGTV ��ü ����");
	}
	public void powerOn() {
		System.out.println("LGTV--- ���� �Ҵ�.");
	}
	public void powerOff() {
		System.out.println("LGTV--- ���� ����.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
