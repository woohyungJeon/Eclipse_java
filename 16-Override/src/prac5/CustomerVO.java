package prac5;

public class CustomerVO {
	private String ano;		// 고객번호
	private String name;	// 이름
	private String tel;		// 전화
	// 생성자
	public CustomerVO() {
		super();
	}

	public CustomerVO(String ano, String name, String tel) {
		super();
		this.ano = ano;
		this.name = name;
		this.tel = tel;
	}	

	@Override
	public String toString() {
		return ano + "\t" + name + "\t" + tel;
	}
	// getter / setter
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
