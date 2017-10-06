import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Hero extends GameObject {
	
	public Hero(int x, int y, int sizeX, int sizeY, Color color, BufferedImage pic) {
		super();
		this.x = x;
		this.y = y;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.color = color;
		this.rect = new Rectangle(x,y,sizeX,sizeY);
		this.pic = null;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}
	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public void setRect(Rectangle rect) {
		this.rect = rect;
	}
	public void setPic(BufferedImage pic) {
		this.pic = pic;
	}
	public void paint(Graphics g){//Paint the buffered image instead for next iteration
		g.setColor(color);
		g.fillRect(x, y, sizeX, sizeY);
	}

	public void attack1(){//TODO real attack1
		this.color=Color.BLUE;
		
	}
	public void attack2(){//TODO real attack 2
		this.color=Color.YELLOW;
	}
	
	public void idle(){
		this.color=Color.BLACK;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}
