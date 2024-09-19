package hw1;

public class Printer {
	int trayCapacity = 0;
	
	
	
	//constructor assigns value to the capacity of the tray accessor
	public Printer(int trayCapacity) {
		
	}
	//starts a new job that copies documents given the page length mutator
	public void startPrintJob(int documentPages) {
		
	}
	//returns the amount of sheets available to be printed accessor
	public int getSheetsAvailable() {
		return trayCapacity;
	}
	// returns next page number to be printed accessor 
	public int getNextPage() {
		return 0;
	}
	// returns the count of all pages printed since the creation of it accessor
	public int getTotalPages() {
		return 0;
	}
	//simulates printer printing a page adds to total page count with number of printed total goes to next page printed and then updates pages available
	public void printPage() { // mutator
		
	}
	// removed paper tray from printer making zero sheets available mutator
	public void removeTray() {
		trayCapacity = 0;
	}
	// replace the tray returning the original state of the tray before removal mutator
	public void replaceTray() {
		
	}
	//simulates removing the tray, then adding a given number of sheets then replacing mutator
	public void addPaper(int sheets) {
		trayCapacity += sheets;
	}
	// simulates removing the tray removing sheets and replacing (can't be below 0) mutator
	public void removePaper(int sheets) {
		
	}
}
