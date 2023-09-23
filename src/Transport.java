abstract class Transport {

    //Atributos
    private String name;
    private String model;
    private int passengers;
    private String serie;

    public Transport(String name) {
        this.name = name;
    }

    public Transport(String name, String model, int passengers, String serie){
        this.name = name;
        this.model = model;
        this.passengers = passengers;
        this.serie = serie;
    }

    //Encapsulamiento con get y set
    public String getName(){
        return this.name;
    }
    public String getModel(){
        return this.model;
    }
    public int getPassengers(){
        return this.passengers;
    }
    public String getSerie(){
        return this.serie;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setPassengers(int passengers){
        this.passengers = passengers;
    }
    public void setSerie(String serie){
        this.serie = serie;
    }

    //Métodos
    public void go(){
        System.out.println(this.name + " is moving forward.");
    }
    public void stop(){
        System.out.println(this.name + " is braking.");
    }
}
