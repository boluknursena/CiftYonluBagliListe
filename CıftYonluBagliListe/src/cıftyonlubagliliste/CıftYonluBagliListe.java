package cıftyonlubagliliste;

public class CıftYonluBagliListe {

    public static void main(String[] args) {
        BListe liste=new BListe();
        liste.basaEkle("bir");
        liste.basaEkle("iki");
        liste.basaEkle("üç");
        liste.sonaEkle("dört");
        liste.sonaEkle("beş");
        liste.sonaEkle("altı");
        liste.listele();
        liste.sondanSil();
        liste.bastanSil();        
        liste.sil("bir");     
        liste.listele();
        liste.ara("beş");
        liste.dugumeGit(2);       
    }  
}