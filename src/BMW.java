public class BMW extends Car {

    public BMW(int RPM){
        super(RPM);
        System.out.println("BMW is created!");
    }

    @Override
    public void gearUp(){
        if(gear <= 8)
            gear = gear + 2;
//        gear += 2;
    }

}
