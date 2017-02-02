package PlantsTask2;


public class Plants {
	private Type type;
	private Color color;
	private int size;
	
	public Plants(String type, String color, int size) throws ColorException, TypeException{
	      Color c = colorStrToEnum(color);
	      Type t = typeStrToEnum(type);
	      this.size = size;
	      this.type = t;
	      this.color = c;
	   }
	
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "Plants [type=" + type + ", color=" + color + ", size=" + size
				+ "]";
	}

	private Color colorStrToEnum(String color) throws ColorException{
	      switch(color.toLowerCase()){
	         case "blue" : return Color.Blue; 
	         case "red" : return Color.Red; 
	         case "white" : return Color.White; 
	         default : throw new ColorException("Input only color blue, red or white");
	      }
	   }
	
	private Type typeStrToEnum(String color) throws TypeException{
	      switch(color.toLowerCase()){
	      //Trojanda, Mak, Romashka 
	         case "trojanda" : return Type.Trojanda; 
	         case "mak" : return Type.Mak; 
	         case "romashka" : return Type.Romashka; 
	         default : throw new TypeException("Input only type trojanda, mak, romashka!");
	      }
	   }

}
