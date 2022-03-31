package abstractfactory.dp2;

public class Client {

	public Client(WidgetFactory wf) {
		wf.createScrollBar();
		wf.createWindow();
	}
}
