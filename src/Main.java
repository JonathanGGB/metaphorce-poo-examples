public class Main {
    public static void main(String[] args) {
        Transport myAirplane = new Airplane("XLS-23-Z");
        Transport myCar = new Car("Rayo McQueen");
        AirplaneMax max = new AirplaneMax("Airplane-Max");
        myAirplane.go();
        myAirplane.stop();

        myCar.go();
        myCar.stop();

        max.go();
        max.stop();
    }
}
