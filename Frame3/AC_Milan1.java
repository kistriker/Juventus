package Frame3;
public class AC_Milan1 extends AC_Milan{
    private int age;
    public AC_Milan1(){
        super();
        this.age=age;
    }

    public static void test(){
        AC_Milan1 milano=new AC_Milan1();
        System.out.println(milano.getName() + " is better than " + milano.getNickname() + " don't you think ?");
    }
    public static String test1(){
        AC_Milan1 milano=new AC_Milan1();
        String msg="";
        String msg1=milano.getName();
        msg +=msg1;
        msg += " is better than ";
        String msg2=milano.getNickname();
        msg +=msg2;
        msg += " don't you think ?";
        //String msg=milano.getName() + " is better than " + milano.getNickname() + " don't you think ?";4
        return msg;
    }


}
