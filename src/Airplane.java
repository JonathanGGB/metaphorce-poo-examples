public class Airplane extends Transport{
    public Airplane(String name) {
        super(name);
    }
    @Override
    public void go(){
        System.out.println("Airplane " + getName() + " is taking off.");
    }
    @Override
    public void stop() {
        System.out.println("Airplane " + getName() + " is landing.");
    }
}
