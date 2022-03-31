package abstractfactory.dp2;

public class MainApp {

	public static void main(String[] args) {
		WidgetFactory wf = new MotifWidgetFactory();
		new Client(wf);

	}

}
