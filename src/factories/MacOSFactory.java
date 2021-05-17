package factories;

import buttons.Button;
import buttons.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
