abstract class Abs{
    abstract void display();

}  

 class Be extends Abs{
    void display(){
        System.out.println("hi");
    }
    public static void main(String args[]){
       Abs a1= new Be();
       a1.display();
    }
}
