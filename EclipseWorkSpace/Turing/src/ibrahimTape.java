
public class Tape {
	
static Cell curCell;// Keep track of current object
static Cell head;



Tape(){
	
	Cell starter = new Cell();
	curCell = head = starter;
	
}




public Cell getCurrentCell(){
	
	return curCell;
}

public  char getContent() {
	
	return curCell.content;
}

public  void setContent(char c) {
	
	curCell.content = c;
}

public  void moveLeft() {
	if(curCell.prev == null) {
		Cell cell = new Cell();
		cell.cellNext(curCell);
		curCell.prev = cell;
		curCell = cell;
		head = cell;
	}
	
	else {
		curCell=curCell.prev;
		
	}
	
	
}

public  void moveRight() {
	if(curCell.next == null) {
		Cell cell = new Cell();
		cell.cellPrev(curCell);
		curCell.next = cell;
		curCell = cell;
		
	}
	
	else {
		curCell=curCell.next;
		
	}
		
} 


public String getTapeContents(){
	String content = "";

	while(head != null) {
		if(head.content != ' ')
			content+=head.content;
		head = head.next;
	}// WHILE END
		
	return content;
	}








}//CLASS END
