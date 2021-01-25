package Collection;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class CollectionBean {
	// private List<String> addressList; List = property에 등록된 리스트를 가져오기  
	//private Set<String> addressList; //  Set = property에 등록된 리스트에서 중복값은 하나만 나오게 하기
	private Map addressList;
	
	public void setAddressList(Map addressList) {
		this.addressList = addressList;
	}
	
	public Map getAddressList() {
	  return addressList; 
	}
	 
	
}
