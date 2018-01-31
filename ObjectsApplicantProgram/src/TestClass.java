
public class TestClass {

	private String test;
	private int testInt;
	

	public TestClass(String test, int testInt) {

		this.test = test;
		this.testInt = testInt;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public int getTestInt() {
		return testInt;
	}

	public void setTestInt(int testInt) {
		this.testInt = testInt;
	}

	@Override
	public String toString() {
		return "TestClass [test=" + test + ", testInt=" + testInt + "]";
	} 

	
}
