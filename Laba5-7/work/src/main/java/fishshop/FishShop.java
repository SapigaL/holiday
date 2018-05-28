package fishshop;

import java.io.Serializable;
import java.util.*;
import fishshop.Good;
import fishshop.persistence.dao.GoodDao;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public final class FishShop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Inject
    public GoodDao goodDao;
    private List<Good> goodList ;
    private static Map<Integer, Good> goodMap = new HashMap<>();

    public FishShop() {

    }

    public  final Map<Integer,Good> getGoodMap(){
        return goodMap;
    }
    public Good getGood(Integer id) {
        return goodDao.findById(id);
    }
    public void addHGood(Good good) {
        goodDao.persist(good);
    }

    public  void updateGood(Good good) {
        goodDao.update(good);
    }

    public  void deleteGood(Integer id) {
        goodDao.delete(id);
    }


//    public void addGoods(final Good goods, Integer id) {
//        this.goodMap.put(id, goods);
//}
//    public static Map<Integer, Good> getGoodList() {
//        return goodMap;
//    }
//
//    public static void setGoodList(Map<Integer, Good> goodList) {
//        FishShop.goodMap = goodList;
//    }
//






//    public void addGood(final Good addGood) {
//        goodList.add(addGood);
//    }
//
//    public List<Good> findByGroup(
//            final FishType fishType,
//            final Mixed mixed,
//            final ColorType colorType) {
//        List<Good> result = new LinkedList<>();
//        goodList.stream().filter((goodList) -> (
//                (goodList.getFishType() == fishType)
//                        ||
//                        (goodList.getMixed() == mixed)
//                        ||
//                        (goodList.getColorType() == colorType)
//        )).forEachOrdered((goodList) -> {
//            result.add(goodList);
//
//        });
//
//        return result;
//    }
//
//    public List<Good> findGoodByPrice(final int lowPrice, final int hightPrice,
//                                      final List<Good> list) {
//        List<Good> result = new LinkedList<>();
//        for (Good goodList : list) {
//            if ((goodList.getPrice() >= lowPrice)
//                    && (goodList.getPrice() <= hightPrice)) {
//                result.add(goodList);
//            }
//        }
//
//        return result;
//    }
//
//    public List<Good> sortByWeight(final List<Good> result) {
//        result.sort((o1, o2) -> {
//            if (o1.getWeight() == o2.getWeight()) {
//                return 0;
//            } else if (o1.getWeight() > o2.getWeight()) {
//                return -1;
//            } else {
//                return 1;
//            }
//
//        });
//        return result;
//
//    }
//
//    public List<Good> getGoodList() {
//        return goodList;
//    }
//
//
}
