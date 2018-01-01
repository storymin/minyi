package common;

public class BChild extends AFather
{
    public BChild()
    {
        super();
    }

    public BChild(BChild bChild)
    {
        bChild.print();
    }

    public void print()
    {
        System.out.println("∑‹∂∑»À…˙");
    }

    public static void main(String[] args)
    {
        BChild bChild=new BChild();
        BChild bChild2=new BChild(bChild);
    }
}
