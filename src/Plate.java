public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food += food;
    }

    public void info(){
        System.out.println("В тарелке осталось еды: "+ food);
    }


    public void decreaseFood(int n){
        if(n > food){
            System.out.println("В миске недостаточно еды");
        } else {
            food -= n;
        }
    }

}
