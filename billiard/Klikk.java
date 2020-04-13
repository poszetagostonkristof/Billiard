package billiard;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Klikk implements MouseListener{

	private int x,y;
	private boolean klikkelve = false;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isKlikkelve() {
		return klikkelve;
	}

	public void setKlikkelve(boolean klikkelve) {
		this.klikkelve = klikkelve;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		this.x = e.getX();
		this.y = e.getY();
		this.klikkelve = true;
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
