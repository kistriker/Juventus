package Fotbalist;

public class Fotbalist
{
    public static final double PRET_MAXIM_FOTBALIST=250.0;
    private static int nrInstante = 0;
    public double sumaTransfer=0.0;
    public double sumazid=200.0;
    private Fotbalist fotbalist;
    private String nume;
    private String prenume;
    private String numar;
    private String salariu;
    public Fotbalist(String prenume,String nume,String numar,String salariu)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.numar = numar;
        this.salariu = salariu;
    }
    public Fotbalist(Fotbalist f)
    {
        this.nume = f.nume;
        this.prenume = f.prenume;
        this.numar = f.numar;
        this.salariu = f.salariu;
    }
    private void sumaTransfer(double sumaTransfer) {
        this.sumaTransfer=sumaTransfer;
    }
    public double getSumaTransfer() {
        return sumaTransfer;
    }

    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setSalariu(String salariu) {
        this.salariu = salariu;
    }
    public boolean transferSauNuJucator(double sumazid){
        if(sumazid<sumaTransfer)
            return false;
        else
            return true;
    }
    public String toString(){
        String msg="Starea fotbalistului:";
        msg += " Nume:" + nume;
        msg += " Prenume:" + prenume;
        msg += " Numar:" + numar;
        msg += " Salariu:" + salariu;

        return msg;
    }

    public int getNrInstante(){
        return nrInstante;
    }
}
