package levels;


import java.util.ArrayList;
import org.newdawn.slick.geom.Rectangle;


public abstract class LevelObject {
	
	public LevelObject(){
		
	}

	public ArrayList<Rectangle> getWalls(){
		return null;
	}
	
	public Rectangle getGoal(){
		return null;
	}
}
