package fishshop;

import javax.persistence.*;

@Entity
public     class Good {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private Integer id;
	private LocationType locationType;
	@Column(name = "weight")
	private  int weight;
	@Column(name = "price")
	private int  price;
	@Column(name = "fishName")
	private String fishName;
	public Good(
                final  int weight, final  int price,
                final  String fishName,final  Integer id) {
        super();
        this.weight = weight;
        this.price = price;
        this.fishName = fishName;
        this.id = id;
	}

	public void setLocationType(LocationType locationType) {
		this.locationType = locationType;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
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
//
//	public String getHeaders() {
//		return "LocationType" + "," + "Price" + "," + "Weight" + "," + "FishName" + ",";
//	}

	public String toCVS() {
		return getLocationType() + "," + getPrice() + "," + getWeight() + "," + getFishName() + "," ;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
