package Default;

interface Phone{
	void call();
	default void message()
	{
		System.out.println("message");
	}
}

class AndroidPhone implements Phone
{
	public void call()
	{
		System.out.println("calling");
	}
}

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p=new AndroidPhone();
		p.call();
		p.message();

	}

}
