package Graphics.Elements.Characters;

import Graphics.Elements.ElementImage;

public abstract class CharacterImage extends ElementImage
  {
	public abstract void move(int d);
	public abstract void attack();
  }
  