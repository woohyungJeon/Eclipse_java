
public class Exam5 {
	public static void main(String[] args) {
		MySite bbs = new MySite() {
			@Override
			public void write() {
				System.out.println("���� ����");
			}

			@Override
			public void delete() {
				System.out.println("�� ����");
			}
		};
		bbs.write();
		bbs.delete();
		System.out.println("---------------------");
		
		MySite member = new MySite() {			
			@Override
			public void write() {
				System.out.println("ȸ�� ����");
			}
			
			@Override
			public void delete() {
				System.out.println("ȸ�� Ż��");
			}			
		};
		member.write();
		member.delete();
	}
}
