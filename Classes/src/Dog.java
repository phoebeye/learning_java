public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    public Dog(int size, String name, int weight, int eyes, int tail, String coat, int teeth, int legs) {
        // call the constructor from the extending class which is Animal here
        super(1,1, size, name, weight);
        this.coat = coat;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.eyes = eyes;
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog walk");
    }

    private void chew() {
        System.out.println("chew chew chew");
    }


}
