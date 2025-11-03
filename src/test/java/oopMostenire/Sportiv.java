package oopMostenire;

public class Sportiv extends Persoana{


    public String sport;
    public String echipa;
    public int numarTricou;

    public Sportiv(String nume, String prenume, int varsta, String adresa, String sport, String echipa, int numarTricou){
        super(nume, prenume, varsta, adresa);
        this.sport = sport;
        this.echipa = echipa;
        this.numarTricou = numarTricou;
    }

    public void informatiiSportiv(){
        informatiiPersoana();
        System.out.println("Sportul practicat de sportiv este " + sport);
        System.out.println("Echipa sportivului este " + echipa);
        System.out.println("Numarul tricoului sportivului este " + numarTricou);
    }
}
