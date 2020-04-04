package beans;
//to make test class singleton---override clone method and getInstance method
public class Test {
    private static Test t;
	public Test() {
		System.out.println("Test constructor");
	}
	
	public static Test getInstance() {
		if(t==null)
			{
			t=new Test();
			return t;
			}
		else
			return t;
		
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

