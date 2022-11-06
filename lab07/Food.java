public class Food {
    private int id;
    private String name;
    private  String type;
    private int size;
    private double price;

    public void getMenu(){

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }
}
