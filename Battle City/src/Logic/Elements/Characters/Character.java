package Logic.Elements.Characters;
import Logic.Elements.Element;

public abstract class Character extends Element 
  {protected boolean life;
   protected int point;

   public boolean getLife()
     {
	   return life;
     }
   
   public int getPoint()
     {
	   return point;
     }
   
   public abstract void move(int d);
   
   public abstract void attack();
  }
