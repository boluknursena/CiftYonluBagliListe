package cıftyonlubagliliste;

public class Node {
public String bilgi;
public Node onceki,sonraki;
public Node(String bilgi)
{
    this.bilgi=bilgi;
}    
public void yazdir()
{
    System.out.println(this.bilgi);
}
}