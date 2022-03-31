package abstractfactory.dp.one;

public class ProductB1 extends AbstractProductB {

	@Override
	public void interact(AbstractProductA a) {
		System.out.println(this.getClass().getSimpleName() +

		        " interacts with " + a.getClass().getSimpleName());

	}

}
