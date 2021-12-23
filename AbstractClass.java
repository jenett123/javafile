package javaCode;

abstract public class AbstractClass {
	void stop()
	{
		System.out.println("Non-abstract function");
	}
	abstract void start();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAbstract obj = new NewAbstract();
		obj.stop();
		obj.start();
	}

}
class NewAbstract extends AbstractClass
{
	void start()
	{
		System.out.println("Abstract with body");
	}
}