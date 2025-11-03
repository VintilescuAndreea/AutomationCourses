package oopMostenire;

public class Angajat extends Persoana{

    public String firma;
    public double salariu;
    public String contract;
    public int zileLibere;

    public Angajat( String nume, String prenume, int varsta, String adresa , String firma, double salariu, String contract, int zileLibere){
        super(nume, prenume, varsta, adresa);
        this.firma = firma;
        this.salariu = salariu;
        this.contract = contract;
        this.zileLibere = zileLibere;
    }

    public void informatiiAngajat(){
        informatiiPersoana();
        System.out.println("Firma angajatului este " + firma);
        System.out.println("Salariul angajatului este " + salariu);
        System.out.println("Contractul angajatului este " + contract);
        System.out.println("Zilele libere ale angajatului sunt " + zileLibere);
    }

    }

