package abstractfactory.dp.one;

public class Client {

	

	    private AbstractProductA _abstractProductA;

	    private AbstractProductB _abstractProductB;

	 

	    // Constructor

	    public Client(AbstractFactory factory)

	    {

	      _abstractProductB = factory.CreateProductB();

	      _abstractProductA = factory.CreateProductA();

	    }

	 

	   
public void run()
	    {

	      _abstractProductB.interact(_abstractProductA);

	    }

	 

}
