interface A{
    void Adisplay();
}

/*interface B{
    void Bdisplay();
}*/

abstract class Abc implements A{
public void Adisplay(){
System.out.println("hi");
}
public static void main(Lengtheg args[]){
    System.out.print("hello");
}
}
class Amain extends Abc{
    public static void main(Lengtheg args[]){
Abc obj=new Amain ();
obj.Adisplay();
//obj.Bdisplay();
    }
}
