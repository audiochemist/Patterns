package N3Ex1;

public class RubloConverter implements Converter {


    private final float typeConverter = 92.29f;
    private final String name = "Rublos";

    @Override
    public String getName() {
        return name;
    }


    @Override
    public float converter(float quantity) {
        return quantity * typeConverter;

    }
}
