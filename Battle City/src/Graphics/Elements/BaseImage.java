package Graphics.Elements;

import javax.swing.ImageIcon;

import Graphics.Background.MapPanel;
import Logic.Elements.Element;

public class BaseImage extends ElementImage
  {
    public BaseImage(Element e)
      {
    	image=new ImageIcon(BaseImage.class.getResource("/Images/Base.png"));
    	element=e;
      }
	public void destroy() 
	  {
	  }  
  }
