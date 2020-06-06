package Starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - andrew tian

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo=new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
		ammo.add(al);
	}

	//post - draw each Ammo
	public void drawEmAll( Graphics window )
	{
		for (int i=0; i < ammo.size(); i++) {
			ammo.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		//if not out of ammo...
		if (ammo.size() > 0) {
			for (int i = 0; i < ammo.size(); i++) {
				ammo.get(i).move("UP");
			}
		}
		
	}

	public void cleanEmUp()
	{
		for (int i=0; i<ammo.size(); i++) {
			if (ammo.get(i).getX() <= ammo.get(i).getSpeed()) {
				ammo.remove(i);
				i--;
			}
		}
	}
	
	public void clear()
	{
		ammo = new ArrayList<Ammo>();
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "";
	}
}