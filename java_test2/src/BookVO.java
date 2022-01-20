import java.io.Serializable;

public class BookVO implements Serializable {
	private String bookCode; // 도서코드
	private String bookName; // 도서명
	private String writer; 	// 저자
	private String publish; // 출판사
	private int price; 		// 가격

	@Override
	public String toString() {
		String result = String.format("%s\t %s\t %s\t %s\t %d", bookCode, bookName, writer, publish, price);
		return result;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
