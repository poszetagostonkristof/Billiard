package billiard;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class View extends JPanel {

	private Model m;
	private Klikk klikk;
	public View(Model m) {
		klikk = new Klikk();
		this.addMouseListener(klikk);
		this.m = m;
	}
	
	public Klikk getKlikk() {
		return klikk;
	}

	public void setKlikk(Klikk klikk) {
		this.klikk = klikk;
	}

	@Override
	
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		this.setBackground(Color.GREEN);
		g.setColor(Color.RED);
		g.fillOval(-20, -20, 80, 80);
		g.setColor(Color.BLACK);
		g.fillOval(-20, 535, 80, 80);
		g.setColor(Color.BLACK);
		g.fillOval(960, -20, 80, 80);
		g.setColor(Color.BLACK);
		g.fillOval(960, 535, 80, 80);
		g.setColor(Color.BLACK);
		g.fillOval(480, -25, 80, 80);
		g.setColor(Color.BLACK);
		g.fillOval(480, 535, 80, 80);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(m.getX(), m.getY(), 30, 30);
		
	}
}
