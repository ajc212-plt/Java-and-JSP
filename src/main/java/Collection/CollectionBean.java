package Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class CollectionBean {
	// private List<String> addressList; List = property�� ��ϵ� ����Ʈ�� ��������  
	//private Set<String> addressList; //  Set = property�� ��ϵ� ����Ʈ���� �ߺ����� �ϳ��� ������ �ϱ�
	private Map addressList;
	
	public void setAddressList(Map addressList) {
		this.addressList = addressList;
	}
	
	public Map getAddressList() {
	  return addressList; 
	}
	 
	
}
