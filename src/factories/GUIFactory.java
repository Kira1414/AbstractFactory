package factories;

import buttons.Button;
import checkbox.Checkbox;

public interface GUIFactory {
	public Button createButton();
	public Checkbox createCheckbox();
}
