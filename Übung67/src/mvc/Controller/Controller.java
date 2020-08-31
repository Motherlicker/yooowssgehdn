package mvc.Controller;

import mvc.Model.Model;
import mvc.View.Gui;

public class Controller {

	private Gui fensta;
	private Model logik;
	
	
	
	public Controller(String s) {
		
		logik = new Model();
		fensta = new Gui(s);
		
		
	}
	
	
}
