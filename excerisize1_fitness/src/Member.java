public class Member extends Person {
    private boolean isBasic;

    public String getMemberType(String type) {

        if (isBasic = true) {
            return getMemberType("Basic");
        } else {
            return getMemberType("Full");
        }
    }

    public int monthlyFee() {
        if (isBasic = true) {
            int basic = 199;
        } else {
            int full = 299;
        }
        return monthlyFee();
    }

    public Member() {
    }

    public Member(boolean isBasic) {
        this.isBasic = isBasic;
    }

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public boolean isBasic() {
        return isBasic;
    }

    public void setBasic(boolean basic) {
        isBasic = basic;
    }
}
