public class AirplaneMax implements AirplaneInterface{

    private String name;

    public AirplaneMax(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public void go() {
        System.out.println("Airplane-Max " + getName() + " is taking off.");
    }

    @Override
    public void stop() {
        System.out.println("Airplane-Max " + getName() + " is applying stops.");
    }
}
