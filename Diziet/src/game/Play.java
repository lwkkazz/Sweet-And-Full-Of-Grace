package game;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.*;

import levels.*;



public class Play extends BasicGameState{

	
	private Player player;
	
	private LevelObject level;
	
	int[] levelIndex;
	
	public Play(int state){
	}

	@Override
	public void init(GameContainer gameContainer, StateBasedGame sbGame) throws SlickException {
		player	= new Player((int)GameParams.mapScreenX(50), (int)GameParams.mapScreenY(0));
		level = (LevelObject) new LevelOne();
	}
	

	@Override
	public void render(GameContainer gameContainer, StateBasedGame sbGame, Graphics graph) throws SlickException {
		player.render(gameContainer, sbGame, graph);
		
		for(Rectangle walls:level.getWalls()){
			graph.draw(walls);
			//graph.fill(walls);
		}
	}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame sbGame, int delta) throws SlickException {
		player.update(gameContainer, sbGame, delta, level.getWalls().get(0));
		getInput();
	}
	
	private void getInput(){
			
		if(Keyboard.isKeyDown(Keyboard.KEY_LEFT)){
			if(!checkWalls(Keyboard.KEY_LEFT))
				player.move(Keyboard.KEY_LEFT);
		}		
		
		if(Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){
			if(!checkWalls(Keyboard.KEY_RIGHT))
				player.move(Keyboard.KEY_RIGHT);
		}
	}
	
	private boolean checkWalls(int direction){
		for(Rectangle walls:level.getWalls()){
			if(walls.intersects(player.getFutureRect(direction))){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int getID() {
		return 1;
	}
}