public abstract class Member {
    double totalCost = 0;
    private String memberId;
    private char gender;
    private int age;
    private String memberType;
    public Member(String info){
        String[] memberInfo = info.split(" ");
        this.memberId = memberInfo[0];
        this.gender = memberInfo[1].charAt(0);
        this.age = Integer.parseInt(memberInfo[2]);
        this.memberType = memberInfo[3];
    }
    public abstract double consume(int amount);
    public double getTotalCost(){
        return 0;
    }
    public String getGenderAgeCost(){
        return memberId + " " + gender + " " + age + " " + String.format("%.1g%n",totalCost);
    }
    public String toString(){
        return null;
    }
    public String getMemberId(){return memberId;}

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getMemberType() {
        return memberType;
    }
}
