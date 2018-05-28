package fishshop;

public final class Stuffing extends Good {
    private final Mixed mixed = Mixed.NO;
    private final FishType fishType = FishType.NONE;
    private final ColorType colorType = ColorType.NONE;

    public Stuffing(final Integer id,
                    final int weight, final int price,
                    final String fishName) {
        super(  weight, price, fishName ,id);
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

//    @Override
//    public String getHeaders() {
//        return super.getHeaders() + "Color type, " + "Mixed, " + "FishType, ";
//    }
//

    @Override
    public String toCVS() {
        return super.toCVS() + getColorType()+","+ getMixed()+"," + getFishType();
    }
}
