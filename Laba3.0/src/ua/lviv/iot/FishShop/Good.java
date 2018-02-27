package ua.lviv.iot.FishShop;

public abstract class Good {
	private LocationType locationType;
	private double weight;
	private int price;
	private String fishName;

	public abstract FishType getFishType();

	public abstract Mixed getMixed();

	public abstract ColorType getColorType();

	public Good() {

	}

	public Good(LocationType locationType, double weight, int price, String fishName) {
		this.locationType = locationType;
		this.weight = weight;
		this.price = price;
		this.fishName = fishName;

	}

	public LocationType getLocationType() {
		return locationType;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

}