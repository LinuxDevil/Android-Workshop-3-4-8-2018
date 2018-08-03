public class Human {

    private String hairColor = "Black";
    private String eyesColor = "Brown";
    private int height = 2;
    private int weight = 120;

    public Human(){
        System.out.println("Human Created!");
    }

    public Human(String hairColor, String eyesColor, int height, int weight){
       this.hairColor = hairColor;
       this.eyesColor = eyesColor;
       this.height = height;
       this.weight = weight;
       System.out.println("New Human!");
    }

    void printInfo(){
        System.out.println(this.weight);
        System.out.println(this.hairColor);
        System.out.println(this.eyesColor);
        System.out.println(this.height);
    }

    void eat(){
        System.out.println("Human is eating");
    }

    boolean sleep(){
        return false;
    }

    void walk(){
        System.out.println("Human is walking");
    }
}
