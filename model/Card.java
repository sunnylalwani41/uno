package swiggy.model;

public class Card {
	private String color;
	private String value;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public boolean isSpecialCard() {
		return value.equals("skip") || value.equals("reverse") || value.equals("draw two");
	}
	
	

	public Card(String color, String value) {
		super();
		this.color = color;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Card [color=" + color + ", value=" + value + "]";
	}
	
	
	
}
