package stringOps;

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
