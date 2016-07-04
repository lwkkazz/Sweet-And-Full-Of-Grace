package levels;

import java.util.ArrayList;
import org.newdawn.slick.geom.Rectangle;
import game.GameParams;

public class LevelOne extends LevelObject{

	private ArrayList<Rectangle> walls;
	
	private Rectangle rect, rect2, rect3, goal;

	public final String LEVEL_TIP = "Where saint paul lives on Earth";
	
	public LevelOne(){
		walls = new ArrayList<Rectangle>();
		
		goal 	= new Rectangle (GameParams.mapScreenX(25),GameParams.mapScreenY(77),GameParams.goalSize, GameParams.goalSize);
		
		rect	= new Rectangle (GameParams.mapScreenX(70),GameParams.mapScreenY(60),GameParams.screenX/10,GameParams.screenX/10);
		rect2	= new Rectangle (GameParams.mapScreenX(75),GameParams.mapScreenY(65),GameParams.screenX/10,GameParams.screenX/10);
		rect3	= new Rectangle (GameParams.mapScreenX(80),GameParams.mapScreenY(70),GameParams.screenX/10,GameParams.screenX/10);

		walls.add(rect);
		walls.add(rect2);
		walls.add(rect3);
	}
	
	@Override
	public ArrayList<Rectangle> getWalls(){
		return walls;
	}
	
	@Override
	public Rectangle getGoal(){
		return goal;
	}
}
