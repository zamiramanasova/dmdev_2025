package levelTwo.composition;

public abstract class Computer implements Printable {
    private Ssd ssd;
    private Ram ram;

    {
        System.out.println("init block computer");
    }

    static {
        System.out.println("static block computer");
    }

    public Computer(){
        System.out.println("Constructor computer");
    }
    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();

    @Override
    public void print() {
        System.out.println(ssd.getValue() + " " + ram.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
