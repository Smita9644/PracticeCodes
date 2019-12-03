package lambda_codes;

public class TestLambda {

	public static void main(String[] args) {

		//here we provide implementation  of abstract method printName of test functional interface
		test t = () -> System.out.println("lambda expreession");
		//here we call the printName method on reference of test interface
		t.printName();
		t.p();
		test.p1();
		//here we provide implementation  of abstract method sum of Testsum functional interface
		Testsum s = (int n1, int n2) -> {
			return n1 + n2;
		};

		System.out.println(s.sum(10, 20));
	}

}
