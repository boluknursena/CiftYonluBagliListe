package cıftyonlubagliliste;

public class BListe {
public Node head,tail;
public void basaEkle(String bilgi)
{
    Node yeni=new Node(bilgi);
    if(head==null)
    {
        yeni.sonraki=null;
        yeni.onceki=null;
        head=tail=yeni;
    }
    else
    {
        yeni.onceki=null;
        yeni.sonraki=head;
        head.onceki=yeni;
        head=yeni;
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
    }
    else
    {
        yeni.sonraki=null;
        tail.sonraki=yeni;
        yeni.onceki=tail;
        tail=yeni;
    }
    
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
    }
    else if(etkin==tail)
    {
        tail=tail.onceki;
        tail.sonraki=null;
    }
    else
    {
        etkin.onceki.sonraki=etkin.sonraki;
        etkin.sonraki.onceki=etkin.onceki;
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