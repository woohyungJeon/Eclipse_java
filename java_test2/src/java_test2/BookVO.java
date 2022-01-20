package java_test2;

import java.io.Serializable;

public class BookVO implements Serializable{
	private String bCode; //å�ڵ�
	private String bName; //å�̸�
	private String bWriter; //å����
	private String bCompany; //���ǻ�
	private String bPrice; //����
	
	public BookVO() {
		super();
	}
	
	public BookVO(String bCode, String bName, String bWriter, String bCompany, String bPrice) {
		super();
		this.bCode = bCode;
		this.bName = bName;
		this.bWriter = bWriter;
		this.bCompany = bCompany;
		this.bPrice = bPrice;
	}
	
	
	@Override
	public String toString() {
		if(bCode==null || bName==null || bWriter==null || bCompany==null || bPrice==null)return null;
		String str = String.format("%s\t%s\t%s\t%s\t%s", bCode, bName, bWriter, bCompany, bPrice);
		
		return str;
	}

	public String getbCode() {
		return bCode;
	}
	public void setbCode(String bCode) {
		this.bCode = bCode;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbWriter() {
		return bWriter;
	}
	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}
	public String getbCompany() {
		return bCompany;
	}
	public void setbCompany(String bCompany) {
		this.bCompany = bCompany;
	}
	public String getbPrice() {
		return bPrice;
	}
	public void setbPrice(String bPrice) {
		this.bPrice = bPrice;
	}
	
	

}
