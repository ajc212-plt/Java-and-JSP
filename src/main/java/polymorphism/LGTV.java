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
		System.out.println("===> LGTV °´Ã¼ »ý¼º");
	}
	public void powerOn() {
		System.out.println("LGTV--- Àü¿ø ÄÒ´Ù.");
	}
	public void powerOff() {
		System.out.println("LGTV--- Àü¿ø ²ö´Ù.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
