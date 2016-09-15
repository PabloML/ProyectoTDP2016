package Logic.Elements;
import Graphics.Elements.ElementImage;
import Logic.Background.Map;
import Logic.Elements.Characters.Enemy;
import Logic.Elements.Characters.Player;

public abstract class Element 
  {protected int posX;
   protected int posY;
   protected Map map;
   protected ElementImage image; 
   
   public int[] getPos()
     {
	   int[] pos=new int[2];
	   pos[0]=posX;
	   pos[1]=posY;
	   return pos;
     }
   
   public void setPos(int x,int y)
     {
	   posX=x;
	   posY=y;
     }
   
   public ElementImage getImage()
     {
	   return image;
     }
   
   public abstract void kill();
   
   public abstract boolean collide(Player p);
   
   public abstract boolean collide(Enemy e);
  }
