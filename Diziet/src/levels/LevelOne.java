package levels;

import java.util.ArrayList;
import org.newdawn.slick.geom.Rectangle;
import game.GameParams;

public class LevelOne extends LevelObject{

	private ArrayList<Rectangle> walls;
	
	private Rectangle rect;

	public final String LEVEL_TIP = "Where saint paul lives on Earth";
	
	public LevelOne(){
		walls = new ArrayList<Rectangle>();
				
		rect	= new Rectangle (GameParams.mapScreenX(0),GameParams.mapScreenY(70),GameParams.screenX,(GameParams.screenX/10)*3);
		
		walls.add(rect);
		
	}
	
	@Override
	public ArrayList<Rectangle> getWalls(){
		return walls;
	}
}
