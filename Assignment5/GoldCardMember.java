public class GoldCardMember extends Member {
    public GoldCardMember(String info) {
        super(info);
    }

    @Override
    public double consume(int amount) {
        if (amount < 2000) {
            totalCost += amount;
            return amount;
        } else if (amount < 5000) {
            totalCost += 2000+  0.95 * (amount-2000);
            return 2000+  0.95 * (amount-2000);
        } else if (amount < 10000) {
            totalCost += 2000 + 3000 * 0.95 + 0.9 * (amount - 5000);
            return 2000 + 3000 * 0.95 + 0.9 * (amount - 5000);
        } else if (amount < 20000) {
            totalCost += 2000 + 3000 * 0.95 + 0.9 * 5000 + 0.85 * (amount - 10000);
            return 2000 + 3000 * 0.95 + 0.9 * 5000 + 0.85 * (amount - 10000);
        } else {
            totalCost += 2000 + 3000 * 0.95 + 0.9 * 5000 + 0.85 * 10000 + 0.8 * (amount - 20000);
            return 2000 + 3000 * 0.95 + 0.9 * 5000 + 0.85 * 10000 + 0.8 * (amount - 20000);
        }
    }
    public double getTotalCost(){
        return totalCost;
    }
    public String toString(){
        return getMemberId() + " " + getGender() + " " + getAge();
    }
}
