
public class Exam1 {
	public static void main(String[] args) {
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("--------");
		
		double d2 = 123;
		float f2 = (float)d2;
		long l2 = (long)f2;
		int i2 = (int)l2;
		short s2 =(short)i2;
		
		System.out.println("d2 = " + d2);
		System.out.println("f2 = " + f2);
		System.out.println("l2 = " + l2);
		System.out.println("i2 = " + i2);
		System.out.println("s2 = " + s2);
		System.out.println("--------");
		
		System.out.println((char)97);
		System.out.println((char)150);
	}
}
