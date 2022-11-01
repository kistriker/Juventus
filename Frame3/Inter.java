package Frame3;
class Inter1{
    public void color(){
        System.out.println("Blue");
    }
}
class Inter2 extends Inter1{
    public void color(){
        System.out.println("Blue and Black");
    }
}
public class Inter {
    /*public static void Oras(){
        System.out.println("Interistii sunt albastri!");
    }*/
    public static String Oras(){
        String msg="Interistii sunt albastri!";
        return msg;
    }
    /*public static void Oras(String i){
        System.out.println(i + "Interistii sunt albastri!");
    }*/
    public static String Oras(String i){
        String msg="Interistii sunt albastri!";
        msg +="Meniu dieta:\nBreakfast: sandwich cu parizer cu ardei\nLunch No 1: ciorba de pui\nLunch No 2: omleta cu cartofi si carne\nSnacks:fructe proaspete\nDinner No 1: salata de rosii cu ceapa si ton in ulei de masline\nDinner No 2: baton proteic\n";
        return msg;
    }
    public static void test() {
        Inter1 inter1 = new Inter1();
        Inter1 inter2 = new Inter2();
        Inter blues = new Inter();
        blues.Oras();
        blues.Oras("Overloading method:");
    }
}
