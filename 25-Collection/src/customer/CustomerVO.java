package customer;

public class CustomerVO {
	private String number; //����ȣ
	private String name;  //�̸�
	private String phone; //����ȣ
	
	@Override
	public String toString() {
		if(number == null || name == null || phone == null) return null;
		
		String title = String.format("����ȣ : %s\n��   �� : %s\n��ȭ��ȣ : %s\n",
				number,name,phone);
		return title;
	}
	
	public String sort_toString() {
		if(number == null || name == null || phone ==null)return null;
		
		String sortitle = String.format("%s\t%s\t%s", number, name, phone);
		return sortitle;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
