package levelTwo.enumpackage;

public enum ProcessorType implements Describable{
    BIT_32("bit_32"),

    BIT_64("bit_64");

    private String name;

    ProcessorType(String name) {
        this.name = name;
    }
    @Override
    public String getDescription() {
        return name + " description";
    }
    public String getName() {
        return name;
    }
}
