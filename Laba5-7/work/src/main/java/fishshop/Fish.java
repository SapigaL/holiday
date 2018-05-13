package fishshop;



public final class Fish extends Good {
    private final FishType fishType = FishType.FRIZE;
    private final Mixed mixed = Mixed.NONE;
    private final ColorType colorType = ColorType.NONE;

    public Fish(final LocationType locationType,
                  final double weight, final int price,
                  final String fishName,final ColorType colorType, final Mixed mixed, final FishType fishType) {
        super(locationType, weight, price, fishName, fishType,mixed, colorType);
    }

    public  ColorType getColorType() {
        return colorType;
    }

    public  Mixed getMixed() {
        return mixed;
    }

    public  FishType getFishType() {
        return fishType;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "Color type, " + "Mixed, " + "FishType, ";
    }

    @Override
    public String toCVS() {
        return super.toCVS() + getColorType()+","+ getMixed()+"," + getFishType();
    }

}

