package Logic.Background;
import Logic.Elements.Characters.Player;
import Graphics.Background.PlayFrame;
public class Play 
  {protected int cantEnemyDead;
   protected Map map;
   protected Player player;
   protected PlayFrame frame;
   
   public Play()
     {player=new Player(map);
      map=new Map(this,player,frame.getPanel());
     }
   
   public Map getMap()
     {
	   return map;
     }
   
   public Player getPlayer()
     {
	   return player;
     }
   
   public int getCantEnemyDead()
     {
	   return cantEnemyDead;
     }
   
   public void setPlayer()
     {
	   player=new Player(map);
     }
   
   public void incrementEnemyDead()
     {
	   cantEnemyDead++;
     }
   
   public void createEnemy()
     {
     }
  }
