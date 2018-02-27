package ua.lviv.iot.FishShop;

public  class Cavlar extends Good {
	private final ColorType colorType = ColorType.BLACK;
	private final Mixed mixed = Mixed.NONE;
	private final  FishType fishType = FishType.NONE;
	
	public Cavlar(LocationType locationType,double weight,int price, String fishName) {
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
		return "������� ������: "+this.getLocationType() + " ����:" + this.getWeight() + " ֳ��: " + this.getPrice() + " " + this.getFishName()+" ��� ����"+this.getColorType();
	}

}
