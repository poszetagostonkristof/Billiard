package billiard;

import java.util.Random;

public class Model {

	private int x,y,x1,y1;
	private Random r;
	
	public Model() {
		r = new Random();
		x1 = r.nextInt() % 400;
		y1 = r.nextInt() % 200;
		if (x1 < 0)
			x1 = -x1;
		if (y1 < 0)
			y1 = -y1;
		y1+=200;
		x1+=300;
		this.x = x1;
		this.y = y1;
	}

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
	
	
}
