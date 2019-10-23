
/* Created by Daniel Leach */

import java.awt.event.*; 

public class MouseProcessing implements MouseListener {
	
	// private member variables
	private int x;
	private int y;
	private int width;
	private int height;
	private int clickRegion;
	private int clicks;

	
	// constructor
	public MouseProcessing(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		this.clickRegion = 0;
		this.clicks = 0;
	}
	
	// mouse click event handler
	public void mouseClicked(MouseEvent e) {  
	   int x = e.getX();
	   int y = e.getY();
				
	   if(x <= (this.x +this.width - 1) && x >= this.x && y >= this.y && y <= (this.y+this.height -1)) {
		   this.clickRegion++;
	   }
	   this.clicks++;
	      
    }  
    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {}
    

    public int getClicksInRegion() {
    	return this.clickRegion;
    }
    public double getTotalClicks() {
    	return this.clicks;
	
	}
    
    
}


