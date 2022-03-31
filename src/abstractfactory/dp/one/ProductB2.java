package abstractfactory.dp.one;

public class ProductB2 extends AbstractProductB {

	@Override
	public void interact(AbstractProductA a) {
		System.out.println(this.getClass().getSimpleName() +

		        " interacts with " + a.getClass().getSimpleName());

	}

}
