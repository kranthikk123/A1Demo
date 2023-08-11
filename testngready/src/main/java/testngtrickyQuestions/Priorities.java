package testngtrickyQuestions;

import org.testng.annotations.Test;

public class Priorities {

	@Test()
	public void a() {
		System.out.println("This is a with no priority");
	}

	@Test(priority = 1)
	public void b() {
		System.out.println("This is b with priority 1");
	}

	@Test(priority = -1)
	public void c() {
		System.out.println("This is c with prioriy -1");
	}

	@Test(priority = 0)
	public void d() {
		System.out.println("This is d with prioiry 0");
	}
}
