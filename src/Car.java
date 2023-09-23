public class Car extends Transport{

    public Car(String name) {
        super(name);
    }
    @Override
    public void go(){
        System.out.println("Car " + getName() + " is driving on the road.");
    }
    @Override
    public void stop() {
        System.out.println("Car " + getName() + " is applying stops.");
    }
}
