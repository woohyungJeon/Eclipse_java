// @FunctionalInterface를 사용하면 이 인터페이스는 1개의 
//   메소드만 선언할 수 있다.
@FunctionalInterface
public interface Calculate {
	int operation(int a, int b);
}
