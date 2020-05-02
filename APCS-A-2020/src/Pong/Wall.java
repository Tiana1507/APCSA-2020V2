package Pong;

public class Wall extends Block
{
	//this one is here to replace the old stuff
	private int width, height;
	
	public Wall() {
		setPos(0, 0);
		width = 800;
		height = 600;
	}
	
	public Wall(int wid, int heit) {
		setPos(0, 0);
		width = wid;
		height = heit;
	}
	
	public void setWidthHeight(int wid, int heit) {
		width = wid;
		height = heit;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
