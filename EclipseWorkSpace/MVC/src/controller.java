

public class controller { // Takes and gives data to view and send and get data to model. Interact with view and data.
						// It is a bridge between view and model
	private view View;
	private model Model;

	public controller(view v, model m) {
		View = v;
		Model = m;
		View.printString("Enter a number : ");
		int i = View.getInt();
		Model.setData(i);
		int currentData = Model.getData();
		View.printString("Entered data is : "+ currentData + "\n");
	}

	
	
	
} // end of class
