package oopMostenire;

public class Persoana {

    private String nume;
    private String prenume;
    private int varsta;
    private String adresa;



    public Persoana(String nume, String prenume, int varsta, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void informatiiPersoana() {
        System.out.println("Numele persoanei este " + nume);
        System.out.println("Prenume persoanei este  " + prenume);
        System.out.println("Varsta persoanei este  " + varsta);
        System.out.println("Adresa persoanei este  " + adresa);
    }

    // Metode getter - folositepentru a accesa atributele private
    public String getPrenume() {
        return prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

    // Metode setter - folosite pentru a modifica atributele private
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
/* Cele 4 principii de baza ale programarii orientate pe obiecte (OOP) sunt:

1. Incapsularea (Encapsulation): Acest principiu se refera la ascunderea detaliilor interne ale unui obiect si expunerea doar a
unei interfete publice. Astfel, datele si metodele unui obiect sunt protejate de accesul direct din exterior, ceea ce ajuta la
mentinerea integritatii datelor si la reducerea complexitatii. Incapsularea se realizeaza prin utilizarea modificatorilor de acces
(cum ar fi private, protected si public) pentru a controla vizibilitatea atributelor si metodelor unei clase.

2. Mostenirea (Inheritance): Acest principiu permite crearea de noi clase (subclase - clase copii) care mostenesc proprietatile si comportamentele
 unei clase existente (superclasa- clasei parinte). Prin mostenire, clasa copil preia toate atributele si metodele clasei parinte, putand adauga sau modifica functionalitati
 suplimentare. In momentul in care clasa copil mosteneste clasa parinte, constructorul clasei cpoil trebuie sa apeleze constructorul clasei parinte folosind cuvantul cheie "super()".
 Mostenirea se declara folosind cuvantul cheie "extends".
 !! In Java, o clasa poate mosteni doar o singura clasa (mostenire unica), dar poate implementa mai multe interfete (mostenire multipla prin interfete).

3. Polimorfismul (Polymorphism): Polimorfismul permite obiectelor de diferite clase sa fie tratate ca obiecte ale unei clase comune.
    Acest principiu permite metodei sa se comporte diferit in functie de tipul obiectului care o apeleaza, facilitand astfel flexibilitatea
    si extensibilitatea codului.

4. Abstracția (Abstraction): Abstracția se refera la procesul de a simplifica complexitatea prin ascunderea detaliilor neesențiale si
    expunerea doar a caracteristicilor relevante ale unui obiect. Acest principiu ajuta la crearea de modele conceptuale care sunt mai usor
    de inteles si de utilizat.

 */