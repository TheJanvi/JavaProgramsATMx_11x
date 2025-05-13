package Ex_30_ENUM;

public enum Colors {
    Red("#FF0000") ,
    GREEN ("#61FF33") ,
    YELLOW("#4477FF");

    private String Hexcode;
    Colors(String Hexcode){
        this.Hexcode = Hexcode;
    }

    String getHexcode(){
        return this.Hexcode;
    }


}
