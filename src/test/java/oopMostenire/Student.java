package oopMostenire;

public class Student extends Persoana{


    public String facultate;
    public String domeniu;
    public int anStudiu;
    public boolean areRestante;

    public Student(String nume, String prenume, int varsta, String adresa, String facultate, String domeniu, int anStudiu, boolean areRestante){
        super(nume, prenume, varsta, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.areRestante = areRestante;
    }

    public void infoStudent(){
        informatiiPersoana();
        System.out.println("Facultatea studentului este " + facultate);
        System.out.println("Domeniul de studiu al studentului este " + domeniu);
        System.out.println("Anul de studiu al studentului este " + anStudiu);
        System.out.println("Studentul are restante?: " + areRestante);
    }
}
