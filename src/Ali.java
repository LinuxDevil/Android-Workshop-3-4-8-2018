public class Ali extends Human implements Location{

    double userLocation = 0;

    @Override
    public double getUserLocation(){
        return userLocation;
    }
    @Override
    public void setUserLocation(double location){
        userLocation = location;
    }


    boolean glasses = false;

    public Ali(String hairColor, String eyesColor, int hieght, int weight){
        super(hairColor,eyesColor,hieght,weight);
        System.out.println("Ali is created!");
    }

    void run(){
        System.out.println("Ali is running");
    }

    @Override
    public void walk(){
//        super.walk();
        System.out.println("Ali is walking");
    }

}
