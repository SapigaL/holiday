package ua.lviv.iot.FishShop;

import ua.lviv.iot.FishShop.FishType;

public  class Fish extends Good  {
	private final  FishType fishType = FishType.FRIZE;
	private final Mixed mixed = Mixed.NONE;
	private final ColorType colorType = ColorType.NONE;
   
	public Fish(LocationType locationType,double weight,int price, String fishName) {
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
		return "Локація вилову: "+this.getLocationType() + " Вага: " + this.getWeight() + " Ціна: " + this.getPrice() + " " + this.getFishName()+" Стан риби:"+this.getFishType();
	}
}

