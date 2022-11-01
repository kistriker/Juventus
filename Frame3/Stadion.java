package Frame3;
public class Stadion {
    private static Stadion instance;
    public final int MAX_AUDIENCE=90000000;
    public String nume;
    //un array list cu beneficii restaurant,...
    private Stadion(String nume){
        this.nume=nume;
    }
    public Stadion(Stadion st){
        this.nume=st.nume;
    }
    public static Stadion getInstance(String nume){
        if(instance == null) {
            instance = new Stadion(nume);
        }
        return instance;
    }
    public String getNume(){return nume;}
    public static void test(){
        Stadion a = new Stadion("Giuseppe Meazza");

    }
}
