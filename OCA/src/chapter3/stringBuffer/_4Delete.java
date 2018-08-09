package chapter3.stringBuffer;

public class _4Delete {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("animals");
		sb.insert(7, "-"); 				// sb = animals-
		sb.insert(0, "-"); 				// sb = -animals-
		sb.insert(4, "-"); 				// sb = -ani-mals-
		System.out.println(sb); // -ani-mals-
	}
}
