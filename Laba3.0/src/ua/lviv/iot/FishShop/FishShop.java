package ua.lviv.iot.FishShop;

import java.util.LinkedList;
import java.util.List;

public final class FishShop {
	private String name = "no name";
	private String adress;
	private List<Good> goodList;

	public FishShop() {

	}

	public FishShop(String name, String adress) {
		this.name = name;
		this.adress = adress;
		this.goodList = new LinkedList<>();

	}

	public void addGood(Good addGood) {
		goodList.add(addGood);
	}

	public List<Good> findByGroup(FishType fishType, Mixed mixed, ColorType colorType) {
		List<Good> result = new LinkedList<>();
		goodList.stream().filter((goodList) -> ((goodList.getFishType() == fishType) || (goodList.getMixed() == mixed)
				|| (goodList.getColorType() == colorType))).forEachOrdered((goodList) -> {
					result.add(goodList);
				});
		return result;
	}

	public List<Good> findGoodByPrice(int lowPrice, int hightPrice, List<Good> list) {
		List<Good> result = new LinkedList<>();
		for (Good goodList : list) {
			if ((goodList.getPrice() >= lowPrice) && (goodList.getPrice() <= hightPrice)) {
				result.add(goodList);
			}
		}

		return result;
	}

	public List<Good> sortByWeight(List<Good> result) {
		result.sort((o1, o2) -> {
			if (o1.getWeight() == o2.getWeight()) {
				return 0;
			} else if (o1.getWeight() < o2.getWeight()) {
				return -1;
			} else
				return 1;

		});
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public List<Good> getGoodList() {
		return goodList;
	}

	public void setGoodList(List<Good> goodList) {
		this.goodList = goodList;
	}

}
