package billiard;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class Controller implements Runnable, MouseListener {

	private View v;
	private Model m;
	private Klikk klikk;
	Random r;
	private boolean klik = false;
	private int sX, sY;
	private int fallalUtk = 0;
	private boolean nyert = false;
	private int x1,y1;
	public Controller(View v, Model m) {
		r = new Random();
		this.v = v;
		this.m = m;
		klikk = new Klikk();
	}

	@Override

	public void run() {
		for (int jj = 0; jj < 3; jj++) {
			if (jj > 0) {
				x1 = Math.abs(r.nextInt() % 400)+300;
				y1 = Math.abs(r.nextInt() % 200)+200;
				m.setX(x1);
				m.setY(y1);
				fallalUtk = 0;
				nyert = false;
			}
			while (v.getKlikk().isKlikkelve() == false) {
				v.repaint(); // var a klikkre
			}
			
			v.getKlikk().setKlikkelve(false);
			sX = (int) Math.round(((v.getKlikk().getX() - m.getX()) * 0.1));
			sY = (int) Math.round((v.getKlikk().getY() - m.getY())*0.1);
			while (fallalUtk < 3 && nyert == false) {
				m.setX(m.getX() + sX);
				m.setY(m.getY() + sY);

				if ((m.getX() < 50 || m.getX() < -50) && (m.getY() < 50 || m.getY() < -50))
					nyert = true;
				v.repaint();
				if (m.getX() < 0 && m.getY() < 0) {
					fallalUtk++;
					if (sX < 0)
						sX = -sX;
					if (sY < 0)
						sY = -sY;
				} else if (m.getX() < 0 || m.getX() > 1000) {
					sX = -sX;
					fallalUtk++;
				} else if (m.getY() < 0 || m.getY() > 600) {
					sY = -sY;
					fallalUtk++;
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (nyert == true)
				System.out.println("NYERT" + m.getX() + " " + m.getY());
			else
				System.out.println("VESZTETT");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		klik = true;
		
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

