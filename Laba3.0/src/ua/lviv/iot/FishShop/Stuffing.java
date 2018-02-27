package ua.lviv.iot.FishShop;

public  class Stuffing extends Good {
	private final Mixed mixed = Mixed.NO;
	private final  FishType fishType = FishType.NONE;
	private final ColorType colorType = ColorType.NONE;
	
	public Stuffing(LocationType locationType,double weight,int price, String fishName) {
		super(locationType,weight,price,fishName);
		
	}
	public ColorType getColorType() {
		return colorType;
	}

	public Mixed getMixed() {
		return mixed;
	}
	
	public FishType getFishType() {
		return fishType;
	}
	
	public String toString() {
		return "Локація вилову: "+this.getLocationType() + " Вага: " + this.getWeight() + " Ціна: " + this.getPrice() + " " + this.getFishName()+" Змішаний фарш"+this.getMixed();
	}
	

}
