package Frame3;
public class FC_Torino {
    private String nume;
    private final int AN_INFIINTARE=1906;
    private static String level="3";
    private String nickname;
    private String patron;
    public FC_Torino(String nume,String nickname){
        this.nume=nume;
        this.nickname=nickname;
    }
    public FC_Torino(String patron){
        this.patron=patron;
    }
    public static String getLevel(){
        return level;
    }
    public static String test(){
        String msg;
        msg="Torino are gradul de pericol "+getLevel();
        msg+="\nOre de antrenament :\nLuni-Vineri: 6 ore\nSambata: 2 ore\nDuminica: 2 0re\n";
        msg+="Nu au restrictii la dieta\n";
        return msg;
    }
}
