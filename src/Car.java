public class Car {

    public int gear = 0;
    public int RPM = 5000;

    public Car(int RPM){
        this.RPM = RPM;
        System.out.println("Car Created!");
    }

    public void printInfo(){
        System.out.println("Gear: " + gear);
        System.out.println("RPM: " + RPM);
    }

    public void start(){
        System.out.println("Car is starting");
    }

    public void gearUp(){
        if(gear < 7)
            gear++;
    }

    void gearDown(){
        if(gear > 1)
            gear--;
    }

}
