package Pong;

//wall is here to set the boundaries
public class Wall extends Block
{
	private int Width;
	private int Height;
	
	public Wall() {
		setPos(0, 0);
		Width=800;
		Height=600;
	}
	
	public Wall(int newWidth, int newHeight) {
		setPos(0, 0);
		Width=newWidth;
		Height=newHeight;
	}
	
	public void setnewWidthnewHeightght(int newWidth, int newHeight) {
		Width = newWidth;
		Height = newHeight;
	}
	
	public int getnewWidth() {
		return Width;
	}
	
	public int getnewHeightght() {
		return Height;
	}
}
