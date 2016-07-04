package game;

import org.lwjgl.input.Keyboard;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Player extends GameObject {

	private int x, y, w, h;
	private Rectangle rect;
	
	public Player(int x, int y){
		
		this.x = x;
		this.y = y;
		
		w = GameParams.screenX/100;
		h = w;
		rect = new Rectangle(x,y,w,h);
	}
	

	public void render(GameContainer gameContainer, StateBasedGame sbGame, Graphics graph){
		graph.drawOval(x, y, w, h);
	}
	
	public void update(GameContainer gameContainer, StateBasedGame sbGame, int delta){
		rect.setX(x);
		rect.setY(y);
	}

	public Rectangle getFutureRect(int futurePoint){
		Rectangle temp;
		
		temp = rect;
		
		switch(futurePoint){
		
			case Keyboard.KEY_UP:
				temp.setY(rect.getY()-1);
				return temp;
			
			case Keyboard.KEY_DOWN:
				temp.setY(rect.getY()+1);
				return temp;	
		
			case Keyboard.KEY_RIGHT:
				temp.setX(rect.getX()+1);
				return temp;
				
			case Keyboard.KEY_LEFT:
				temp.setX(rect.getX()-1);
				return temp;
		}
		
		return rect;
	}
	
	public Rectangle getRect(){
		return rect;
	}
	
	public void move(int dir){
		switch(dir){
		
			case Keyboard.KEY_UP:
				if(y>0)
					y -= GameParams.moveSpeed;
				break;
				
			case Keyboard.KEY_DOWN:
				if(y<GameParams.screenY-h)
					y += GameParams.moveSpeed;
				break;
				
			case Keyboard.KEY_LEFT:
				if(x>0)
					x -= GameParams.moveSpeed;
				break;
				
			case Keyboard.KEY_RIGHT:
				if(x<GameParams.screenX-h)
					x += GameParams.moveSpeed;
				break;
	
		}
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
