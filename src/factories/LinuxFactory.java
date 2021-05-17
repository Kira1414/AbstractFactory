package factories;

import buttons.Button;
import checkbox.Checkbox;
import buttons.LinuxButton;
import checkbox.LinuxCheckbox;

public class LinuxFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LinuxButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new LinuxCheckbox();
	}

}
