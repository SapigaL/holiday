//package fishshop;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class FishShopTest {
//
////
////    private FishShop shop = null;
////
////    @BeforeEach
////    void setUp() {
////        shop = new FishShop();
////        shop.addGood(new Fish(LocationType.SEA, 2, 140, "sda", ColorType.NONE, Mixed.NONE, FishType.SALINE));
////        shop.addGood(new Fish(LocationType.SEA, 3, 141, "rffwefwe", ColorType.NONE, Mixed.NONE, FishType.SALINE));
////        shop.addGood(new Cavlar(LocationType.SEA, 4, 142, "rfdfwe", ColorType.BLACK, Mixed.NONE, FishType.NONE));
////        shop.addGood(new Stuffing(LocationType.SEA, 6, 144, "rfwwere", ColorType.NONE, Mixed.NO, FishType.NONE));
////        shop.addGood(new Cavlar(LocationType.SEA, 7, 143, "rffwewe", ColorType.BLACK, Mixed.NONE, FishType.NONE));
////        shop.addGood(new Stuffing(LocationType.SEA, 9, 145, "aaaaaa", ColorType.NONE, Mixed.NO, FishType.NONE));
////
////
////    }
////
//
////    @Test
////    public void sortByWeight() {
////
////        List<Good> testList = shop.getGoodList();
////        testList = shop.sortByWeight(testList);
////
////        assertEquals(9, testList.get(0).getWeight());
////        assertEquals(7, testList.get(1).getWeight());
////        assertEquals(6, testList.get(2).getWeight());
////        assertEquals(4, testList.get(3).getWeight());
////        assertEquals(3, testList.get(4).getWeight());
////        assertEquals(2, testList.get(5).getWeight());
////    }
//
//
////    @Test
////    void findByGroup() {
////
////        List<Good> result = shop.findByGroup(FishType.LIVE, Mixed.NONE, ColorType.RED);
////
////        assertEquals(4, result.size());
////
////    }
////
////    @Test
////    void findGoodByPrice() {
////        List<Good> testList = shop.getGoodList();
////        testList = shop.findGoodByPrice(1, 200, testList);
////
////        assertEquals(140, testList.get(0).getPrice());
////        assertEquals(141, testList.get(1).getPrice());
////        assertEquals(142, testList.get(2).getPrice());
////        assertEquals(144, testList.get(3).getPrice());
////        assertEquals(143, testList.get(4).getPrice());
////        assertEquals(145, testList.get(5).getPrice());
////
////
////    }
//
//
//}