package ro.uvt;

import java.util.List;

public class Carte extends Section{
    // Atribute------------------------------------
    private List<Autor> autori;//agregare



    //----------------------------------------------
    //Constructori----------------------------------
    public Carte(List < Autor> autori, String titlu) {
        super(titlu);
        this.autori = autori;

    }

    //----------------------------------------------
    //Metode----------------------------------------

    public String getTitlu(){return getSectionTitle();}

    public void setTitlu(String titlu){
        this.setSectionTitle(titlu);
    }

    public List<Autor> getAutori() {
        return autori;
    }
@Override
    public  void print(){
        System.out.println(this.getTitlu());
        System.out.println(autori);
        getContent().forEach(Element::print);

    }

}
