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
        System.out.println("Dugum sayısı: "+liste.getdugumSayisi()); 
        liste.ortayaEkle("yedi");
        liste.ortayaEkle("sekiz");
        liste.listele();
        liste.arayaEkle("sekiz", "on");
        liste.arayaEkle("dört", "onbir");
        liste.arayaEkle("bir", "on");
        System.out.println("Dugum sayısı: "+liste.getdugumSayisi()); 
        liste.ortadanSil();
        liste.ortadanSil();
    liste.listele();
        
    }  
}