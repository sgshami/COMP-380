package stringOps;

public interface StringOperation {
	public String doThing(String a, String b);
}

/* Turn this in on test
public interface StringOperation {
	public String doThing(String a, String b);
}

public class Combiner implements StringOperation{
	public String doThing(String a, String b) {
		return a + b;
	}
}

public class LeftSideR implements StringOperation{
	public String doThing(String a, String b) {
		return a;
	}
}

public class RightSideR implements StringOperation{
	public String doThing(String a, String b) {
		return b;
	}
}

public class StringMain {
	public static void main(String[] args) {
		StringOperation combiner = new Combiner();
		StringOperation leftSide = new LeftSideR();
		StringOperation rightSide = new RightSideR();
		
		String a = "foo";
		String b = "bar";
		
		System.out.println(combiner.doThing(a, b));
		System.out.println(leftSide.doThing(a, b));
		System.out.println(rightSide.doThing(a, b));
	}
}

*/