public class Aa {
    private int id;
    static {
        System.out.println("0");
    }
    {
        System.out.println("1");
    }
    public Aa(){
        System.out.println("2");
    }
    {
        this.id=5;
        System.out.println("this id=5");
    }
}
