package fishshop;

public     class Good {

	private LocationType locationType;
	private  double weight;
	private int  price;
	private String fishName;
	private FishType fishType;
	private Mixed mixed;
	private ColorType colorType;



	public Good(final LocationType locationType,
				final double weight, final int price,
				final String fishName,final FishType fishType,final Mixed mixed, final ColorType colorType) {
		this.locationType = locationType;
		this.fishType = fishType;
		this.mixed = mixed;
		this.colorType =colorType;
		this.weight = weight;
		this.price = price;
		this.fishName = fishName;

	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

    public FishType getFishType() {
        return fishType;
    }

    public Mixed getMixed() {
        return mixed;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public LocationType getLocationType() {
		return locationType;
	}


	public double getWeight() {
		return weight;
	}


	public int getPrice() {
		return price;
	}

	public String getFishName() {
		return fishName;
	}

	public String getHeaders() {
		return "LocationType" + "," + "Price" + "," + "Weight" + "," + "FishName" + ",";
	}

	public String toCVS() {
		return getLocationType() + "," + getPrice() + "," + getWeight() + "," + getFishName() + "," ;
	}
}
