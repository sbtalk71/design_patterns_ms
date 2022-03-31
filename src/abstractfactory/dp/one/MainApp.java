package abstractfactory.dp.one;

class MainApp

{

	// / <summary>

	// / Entry point into console application.

	// / </summary>

	public static void main(String[] args)

	{

		// Abstract factory #1

		AbstractFactory factory1 = new ConcreteFactory1();

		Client client1 = new Client(factory1);

		client1.run();

		// Abstract factory #2

		AbstractFactory factory2 = new ConcreteFactory2();

		Client client2 = new Client(factory2);

		client2.run();

		// Wait for user input

		// Console.ReadKey();

	}
}