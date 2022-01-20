package prac1;

public class IsoTriangle extends DrawData {
	@Override
	void draw() {
		for (int i = 0; i < height; i++) {		// Ãþ
			for (int j = 0; j < i + 1; j++) {	// º°ÀÇ °¹¼ö
				System.out.print(outchar);
			}
			System.out.println();				// 1ÁÙ³Ñ±è
		}
		System.out.println();
	}
}
