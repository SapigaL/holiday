package fishshop;

import org.junit.jupiter.api.Test;
import static fishshop.ColorType.BLACK;
import static fishshop.FishType.FRIZE;
import static fishshop.FishType.NONE;
import static org.junit.jupiter.api.Assertions.*;
class FishTest {

    @Test
    void getColorType() {
        assertEquals(new Fish(LocationType.SEA, 23, 140, "rfwe", ColorType.NONE,Mixed.NO, FishType.NONE)
                .getColorType().toString(),NONE.toString());
    }

    @Test
    void getMixed() {
        assertEquals(new Fish(LocationType.SEA, 23, 140, "rfwe",ColorType.NONE,Mixed.NO, FishType.NONE)
                .getFishType().toString(),FRIZE.toString());

    }

    @Test
    void getFishType() {
        assertEquals(new Fish(LocationType.SEA, 23, 140, "rfwe",ColorType.NONE,Mixed.NO, FishType.NONE)
                .getMixed().toString(),NONE.toString());
    }


}