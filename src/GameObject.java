import java.awt.Graphics;

public class GameObject {
	GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height; 
	}

	int x;
	int y;
	int width;
	int height;

	void update() {
		x += 10;
		y -= 10; 
	}
	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
	}
}
