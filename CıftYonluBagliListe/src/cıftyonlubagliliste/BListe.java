package cıftyonlubagliliste;

public class BListe {
public Node head,tail;
static int dugumSayisi;
public int getdugumSayisi()
{
    return dugumSayisi;
}
public void basaEkle(String bilgi)
{
    Node yeni=new Node(bilgi);
    if(head==null)
    {
        yeni.sonraki=null;
        yeni.onceki=null;
        head=tail=yeni;
        dugumSayisi++;
    }
    else
    {
        yeni.onceki=null;
        yeni.sonraki=head;
        head.onceki=yeni;
        head=yeni;
        dugumSayisi++;
    }    
}
public void ortayaEkle(String bilgi)
{
    Node yeni=new Node(bilgi);
    Node etkin=head;
    int tut=dugumSayisi/2;
    while(tut>1)
    {
        etkin=etkin.sonraki;
        tut--;
    }
    if(head==null)
    {
        yeni.sonraki=null;
        yeni.onceki=null;
        head=tail=yeni;
        dugumSayisi++;
    }
    else
    {
        yeni.onceki=etkin;
        yeni.sonraki=etkin.sonraki;
        etkin.sonraki=yeni;
        dugumSayisi++;
    }    
}
public void sonaEkle(String bilgi)
{
    Node yeni=new Node(bilgi);
    if(head==null)
    {
        yeni.sonraki=null;
        yeni.onceki=null;
        head=tail=yeni;
        dugumSayisi++;
    }
    else
    {
        yeni.sonraki=null;
        tail.sonraki=yeni;
        yeni.onceki=tail;
        tail=yeni;
        dugumSayisi++;
    }
}
public void arayaEkle(String bundanSonra, String bilgi)
{
    Node yeni=new Node(bilgi);
    Node etkin=head;
    while(etkin.bilgi!=bundanSonra)
    {
        if(etkin.sonraki==null)
        {
            System.out.println("Olmayan elemandan sonra ekleme yapılmak istendi.");
            return;
        }
            
        etkin=etkin.sonraki;
    }
    if(head==null)
    {
        yeni.sonraki=null;
        yeni.onceki=null;
        head=tail=yeni;
        dugumSayisi++;
    }
    yeni.sonraki=etkin.sonraki;
    yeni.onceki=etkin;
    etkin.sonraki=yeni;
    dugumSayisi++;      
}
public void bastanSil()
{
    if(head==null)
    {
        System.out.println("Liste boş");
        return;
    }
    head=head.sonraki;
    head.onceki=null;
    dugumSayisi--;
}
public void ortadanSil()
{
    if(head==null)
    {
        System.out.println("Liste boş");
        return;
    }
    Node etkin=head;
    int tut=dugumSayisi/2;
    tut++;
    while(tut>1)
    {
        etkin=etkin.sonraki;
        tut--;
    }
    if(etkin==head)
    {
        head=head.sonraki;
        head.onceki=null;
        dugumSayisi--;
    }
    else if(etkin==tail)
    {
        tail=tail.onceki;
        tail.sonraki=null;
        dugumSayisi--;
    }
    else
    {
        etkin.onceki.sonraki=etkin.sonraki;
        etkin.sonraki.onceki=etkin.onceki;
        dugumSayisi--;
    }   
}
public void sondanSil()
{
    if(head==null)
    {
        System.out.println("Liste boş");
        return;
    }
    tail=tail.onceki;
    tail.sonraki=null;
    dugumSayisi--;
}
public void sil(String sil)
{
    Node etkin=head;
    while(etkin.bilgi!=sil)
    {
        if(etkin.sonraki==null)
        {
            System.out.println("Silinecek dugum yok.");
            return;
        }
        else 
            etkin=etkin.sonraki;
    }
    if(etkin==head)
    {
        head=head.sonraki;
        head.onceki=null;
        dugumSayisi--;
    }
    else if(etkin==tail)
    {
        tail=tail.onceki;
        tail.sonraki=null;
        dugumSayisi--;
    }
    else
    {
        etkin.onceki.sonraki=etkin.sonraki;
        etkin.sonraki.onceki=etkin.onceki;
        dugumSayisi--;
    }
}

public void ara(String ara)
{
    Node etkin=head;
    while(etkin.bilgi!=ara)
    {
        if(etkin.sonraki==null)
        {
            System.out.println("Aranılan dugum yok.");
            return;
        }
        else 
        {
            etkin=etkin.sonraki;  
        }
    }
     System.out.println("Aranılan dugum var");
}
public void dugumeGit(int i)
{
    Node etkin=head;
    while(i>1)
    {
        if(etkin.sonraki==null)
        {
            System.out.println("Aranılan dugum yok.");
            return;
        }
        else 
        {
            etkin=etkin.sonraki;
            i--;
        }
    }
    System.out.println("Dugum: "+etkin.bilgi);
}
 public void listele()
{
    System.out.println();
    System.out.println("Baştan sona liste: ");
    Node etkin = head;
    while(etkin!=null)
    {
        etkin.yazdir();
        etkin=etkin.sonraki;
    }
}
}