public class SubB extends base implements properties{
    double weight;

    SubB(int c, String n, double w){
        super(c, n);
        weight = w;
    }
    public void dispB(){
        display();
        System.out.println("Weight: "+weight);
    }

    public void displayProperty(){
        System.out.println("I have a weight property"+weight);
    }

}
