
public class Exam5 {
	public static void main(String[] args) {
		MySite bbs = new MySite() {
			@Override
			public void write() {
				System.out.println("새글 쓰기");
			}

			@Override
			public void delete() {
				System.out.println("글 삭제");
			}
		};
		bbs.write();
		bbs.delete();
		System.out.println("---------------------");
		
		MySite member = new MySite() {			
			@Override
			public void write() {
				System.out.println("회원 가입");
			}
			
			@Override
			public void delete() {
				System.out.println("회원 탈퇴");
			}			
		};
		member.write();
		member.delete();
	}
}
