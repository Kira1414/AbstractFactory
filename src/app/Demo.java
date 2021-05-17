package app;

import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;
import factories.LinuxFactory;

public class Demo {
	
	private static Application configureApplication()
	{
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name");
		
		if(osName.contains("mac"))
		{
			factory = new MacOSFactory();
			app = new Application(factory);
		}
		if(osName.contains("Linux"))
		{
			factory = new LinuxFactory();
			app = new Application(factory);
		}
		else
		{
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		return app;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application app = configureApplication();
		app.paint();
	}

}