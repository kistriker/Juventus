package Frame3;
public class AC_Milan {
    private String nume;
    private final int AN_INFIINTARE=1899;
    private String nickname;
    private String patron;
    public AC_Milan(String nume,String nickname){
        this.nume=nume;
        this.nickname=nickname;
    }
    public AC_Milan(){
        nume="Unknown";
        nickname="losers";
    }
    public String getName(){
        return nume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname=nickname;
    }

}
