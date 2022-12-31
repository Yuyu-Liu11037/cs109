import java.util.List;

public class ConcreteShoppingMall extends Member implements ShoppingMall{
    private List<Member> members; //A list that stores members of the shopping mall, the list should be empty (NOT be null) if there is no member

    public ConcreteShoppingMall(String info) {
        super(info);
    }

    public void addMember(String info){
        members.add(new ConcreteShoppingMall(info));
    }
    public void addMember(List<String> infos){
        for (String i : infos) {
            members.add(new ConcreteShoppingMall(i));
        }
    }
    public Member getMember(String memberId){
        for (Member i : members){
            if (i.getMemberId() == memberId){
                return i;
            }
        }
        return null;
    }
    public double placeOrder(String memberId, int cost, ProductCategory category){
        if (getMember(memberId).getMemberType().equals("GoldCardMember")){
            GoldCardMember goldMember = new GoldCardMember("M01 M 28 G");
            return goldMember.consume(cost);
        } else {
            SilverCardMember silverCardMember = new SilverCardMember("M01 M 28 S");
            return silverCardMember.consume(cost);
        }
    }
    @Override
    public double consume(int amount) {
        return 0;
    }
}
