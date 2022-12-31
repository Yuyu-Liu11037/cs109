public class SilverCardMember extends Member{
    private double points = 0;
    public SilverCardMember(String info) {
        super(info);
    }

    @Override
    public double consume(int amount) {
        if (totalCost < 10000){
            totalCost += amount - points;
            double spent = amount - points;
            points = (int)(amount / 30);
            return spent;
        } else {
            totalCost += amount - points;
            double spent = amount - points;
            points = 1.5 * (int)(amount / 30);
            return spent;
        }
    }

    public double getTotalCost(){
        return totalCost;
    }
    public String toString(){
        return getMemberId() + " " + getGender() + " " + getAge() + " points=" + points;
    }
}
