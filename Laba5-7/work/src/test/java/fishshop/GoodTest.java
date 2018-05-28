//package fishshop;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//
//
//class GoodTest {
//    private FishShop shop = null;
//    @BeforeEach
//    void setUp() {
//
//        shop = new FishShop();
//        shop.addGood(new Fish(LocationType.SEA, 2, 140, "Karas",ColorType.BLACK,Mixed.NO,FishType.SALINE));
//        shop.addGood(new Fish(LocationType.SEA, 2, 140, "aaaaa",ColorType.BLACK,Mixed.NO,FishType.SALINE));
//
//        shop.addGood(new Cavlar(LocationType.SEA, 4, 140, "IKRA",ColorType.BLACK,Mixed.NO,FishType.SALINE));
//        shop.addGood(new Stuffing(LocationType.SEA, 6, 140, "Karas+Okyn",ColorType.BLACK,Mixed.NO,FishType.SALINE));
//
//    }
//
//    @Test
//    void getFishType() throws Exception{
//
//
//    }
//
//    @Test
//    void getMixed() throws Exception{
//    }
//
//    @Test
//    void getColorType()throws Exception {
//    }
//
//    @Test
//    void getLocationType() throws Exception{
//    }
//
//    @Test
//    void getWeight() throws Exception{
//    }
//
//    @Test
//    void getPrice() throws Exception{
//    }
//
//    @Test
//    void getFishName()throws Exception {
//    }
//
////    @Test
////    public void testWriter() {
////        Writer writer = new Writer();
////        try {
////            writer.writeToFile(shop.getGoodList());
////        } catch (Exception e) {
////            assertFalse(false, "Unexpected exception was thrown");
////        }
////    }
//}