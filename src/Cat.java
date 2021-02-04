public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        full = false;
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return full;
    }

    public void eat(Plate plate){
        if(plate.getFood() >= appetite){
            int before = plate.getFood();
            plate.decreaseFood(appetite);
            int after = plate.getFood();
            if (before > after){
                full = true;
            } else {
                full = false;
            }
            if(full){
                System.out.println("Кот "+name+" накормлен");
            } else {
                System.out.println("Кот "+name+" остался голодным");
            }
        } else {
            System.out.println("Еды недостаточно. Кот "+name+" останется голодным");
        }


    };
}
