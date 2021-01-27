package UserService;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	public static void main(String[] args) {
		// 1. String �����̳ʸ� �����Ѵ�.
		AbstractApplicationContext container = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. String �����̳ʷκ��� UserServiceImpl ��ü�� Lookup �Ѵ�.
		UserService userService =
				(UserService) container.getBean("userService");
		
		// 3. �α��� ��� �׽�Ʈ
		UserVO vo = new UserVO();
		vo.setId("ajc212");
		vo.setPassword("198219");
		
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		} else {
			System.out.println("�α��� ����");
		}
		
		// 4. Spring �����̳ʸ� �����Ѵ�.
		container.close();
		
	}
}
