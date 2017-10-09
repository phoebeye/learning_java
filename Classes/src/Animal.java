public class Animal {

    private int brain;
    private int body;
    private int size;
    private String name;
    private int weight;

    public Animal(int brain, int body, int size, String name, int weight) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("eat eat eat!");
    }

    public void move(int speed) {
        System.out.println("Animal move at speed" + speed);
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
