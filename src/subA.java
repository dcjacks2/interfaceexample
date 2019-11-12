public class subA extends base implements properties {
    String Color;
    public subA(int c, String n, String col){
        super(c,n);
        Color = col;
    }
    public void dispA(){
        display();
        System.out.println("Color: "+Color);

    }
    public void displayProperty(){
        System.out.println("I have a Color Property" + Color);
    }
}
