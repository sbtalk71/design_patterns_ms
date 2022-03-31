package abstractfactory.dp2;

public class MotifWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();

	}

	@Override
	public Window createWindow() {
		return new MotifWindow();

	}

}
