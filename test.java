package lambda_codes;

public interface test {

	void printName();

	default void p() {
		System.out.println("inside default method of test interface");
	}

	static void p1() {
		System.out.println("inside default method of test interface");
	}
}
