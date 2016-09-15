package Graphics.Elements.Characters;

import javax.swing.ImageIcon;

import Graphics.Elements.BaseImage;
import Logic.Elements.Element;

public class PlayerImage extends CharacterImage
  {
	public PlayerImage(Element e)
      {
  	   image=new ImageIcon(BaseImage.class.getResource("/Images/Characters/Player/Player.png"));
  	   element=e;
      }

	public void destroy() 
	  {
	  }

	public void move(int d) 
	  {
	  }

	public void attack() 
	  {
  	  }
  }
