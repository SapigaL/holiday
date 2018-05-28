package fishshop;



public final class Fish extends Good {
    private final FishType fishType = FishType.FRIZE;
    private final Mixed mixed = Mixed.NONE;
    private final ColorType colorType = ColorType.NONE;

    public Fish(final Integer id,
                final int weight, final int price,
                final String fishName) {
        super(  weight, price, fishName ,id);
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

//    @Override
//    public String getHeaders() {
//        return super.getHeaders() + "Color type, " + "Mixed, " + "FishType, ";
//    }

    @Override
    public String toCVS() {
        return super.toCVS() + getColorType()+","+ getMixed()+"," + getFishType();
    }

}

