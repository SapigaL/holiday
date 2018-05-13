package fishshop;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public final class FishShop {
    private String name = "no name";
    private String adress;
    private List<Good> goodList = new LinkedList<>();

    public FishShop() {

    }



    public void addGood(final Good addGood) {
        goodList.add(addGood);
    }

    public List<Good> findByGroup(
            final FishType fishType,
            final Mixed mixed,
            final ColorType colorType) {
        List<Good> result = new LinkedList<>();
        goodList.stream().filter((goodList) -> (
                (goodList.getFishType() == fishType)
                        ||
                        (goodList.getMixed() == mixed)
                        ||
                        (goodList.getColorType() == colorType)
        )).forEachOrdered((goodList) -> {
            result.add(goodList);

        });

        return result;
    }

    public List<Good> findGoodByPrice(final int lowPrice, final int hightPrice,
                                      final List<Good> list) {
        List<Good> result = new LinkedList<>();
        for (Good goodList : list) {
            if ((goodList.getPrice() >= lowPrice)
                    && (goodList.getPrice() <= hightPrice)) {
                result.add(goodList);
            }
        }

        return result;
    }

    public List<Good> sortByWeight(final List<Good> result) {
        result.sort((o1, o2) -> {
            if (o1.getWeight() == o2.getWeight()) {
                return 0;
            } else if (o1.getWeight() > o2.getWeight()) {
                return -1;
            } else {
                return 1;
            }

        });
        return result;

    }

    public List<Good> getGoodList() {
        return goodList;
    }


}
