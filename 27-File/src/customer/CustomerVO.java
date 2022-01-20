package customer;

import java.io.Serializable;

public class CustomerVO implements Serializable{
	private String cn;		// 고객번호
	private String name;	// 이름
	private String phone;	// 전화
	
	public CustomerVO() {
		super();
	}

	public CustomerVO(String cn, String name, String phone) {
		super();
		this.cn = cn;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		if(cn==null || name ==null || phone==null) return null;
		
		String str =String.format("%s\t%s\t%s", cn, name, phone);		
		return str;
	}
	
	public String getCn() {
		return cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
