package Frame3;
interface RomaInterface{
//public void shout();
public String shout();
//public void meniu();
public String meniu();
}
interface ASRomaInterface{
//public void hourworked();
public String hourworked();
}
public class AS_Roma implements ASRomaInterface,RomaInterface{
    private String nume;
    private final int AN_INFIINTARE=1927;
    private String nickname;
    private String patron;
    public AS_Roma(String nume,String nickname){
        this.nume=nume;
        this.nickname=nickname;
    }
    public AS_Roma(String patron){
        this.patron=patron;
    }
    public String shout(){
        String msg="Play better because Juve play better than you!\n";
        //System.out.println("Play better because Juve play better than you!");
        return msg;
    }
    //public void meniu(){
    public String meniu(){
        String msg;
        msg="Meniu dieta:\nBreakfast: brânză și șuncă,iaurt cu conținut scăzut de grăsimi\nLunch No 1: pui si salata\nLunch No 2: ton, măsline, ou și roșii\nSnacks:fructe proaspete, pâine prăjită cu avocado\nDinner No 1: pește-spadă proaspăt și salată\nDinner No 2: friptură și calamari\n";
        return msg;
        /*System.out.println("Meniu dieta:");

        System.out.print("Breakfast:");
        System.out.println("brânză și șuncă,iaurt cu conținut scăzut de grăsimi");
        System.out.print("Lunch No 1:");
        System.out.println("pui si salata");
        System.out.print("Lunch No 2:");
        System.out.println("ton, măsline, ou și roșii");
        System.out.print("Snacks:");
        System.out.println("fructe proaspete, pâine prăjită cu avocado");
        System.out.print("Dinner No 1:");
        System.out.println("pește-spadă proaspăt și salată");
        System.out.print("Dinner No 2:");
        System.out.println("friptură și calamari");
        */
    }
    public String hourworked(){
        String msg;
        msg="Ore de antrenament :\nLuni-Vineri: 8 ore\nSambata: 4 ore\nDuminica: Odihna si relaxare\nExceptie in caz de meci ziua respectiva: 4 ore dimineata!\n";
        return msg;
        /*System.out.println("Ore de antrenament :");
        System.out.print("Luni-Vineri:");
        System.out.println("8 ore");
        System.out.print("Sambata:");
        System.out.println("4 ore");
        System.out.print("Duminica:");
        System.out.println("Odihna si relaxare");
        System.out.print("Exceptie in caz de meci ziua respectiva:");
        System.out.println("4 ore dimineata!");
        */
    }

    public static String test() {
        RomaInterface roma1 = new AS_Roma("romani","I Giallorossi");
        ASRomaInterface roma2 = new AS_Roma("romani","I Giallorossi");
        String msg=roma1.shout();
        msg += roma1.meniu();
        msg += roma2.hourworked();
        return msg;
    }
}
