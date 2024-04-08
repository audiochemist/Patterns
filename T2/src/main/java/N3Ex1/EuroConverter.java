package N3Ex1;

public class EuroConverter implements Converter {


    private final float typeConverter = 0.93f;
    private final String name = "Euros";

    @Override
    public String getName() {
        return name;
    }


    @Override
    public float converter(float quantity) {
        return quantity * typeConverter;

    }


}
