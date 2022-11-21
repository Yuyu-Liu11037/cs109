public enum PhoneModel {
    HUAWEI ("Android"),
    IPHONE ("iOS"),
    PIXEL ("Android"),
    SAMSUNG ("Android"),
    LG ("Android");

    private String os;
    public String getOs(){
        return this.os;
    }
    private PhoneModel(String os){
        this.os = os;
    }
}
