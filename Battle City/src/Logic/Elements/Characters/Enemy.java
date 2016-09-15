package Logic.Elements.Characters;

public abstract class Enemy extends Character
  {protected int posMap;
  
   public int getPosMap()
     {
	   return posMap;
     }
   
   public void setPosMap(int p)
     {
	   posMap=p;
     }
  }