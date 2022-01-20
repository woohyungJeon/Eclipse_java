
public class AAA {
	// 예외 전가
	// => 예외 처리를 실제로 사용하는 곳에서 처리하라고 예외를 전가시키는 것
	void ex() throws Exception {
		String year2 = "뭘까요";
		int age2 = 2022 - Integer.parseInt(year2) + 1;
		System.out.println(age2 + "살 입니다.");
	}
}
