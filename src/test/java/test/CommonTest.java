package test;

public class CommonTest
{
    public static void main(String[] args)
    {
        int i=4;
        
        switch (i)
        {
            case 1:
                
                System.out.println("1");;

            default:
                System.out.println("A");
            case 2:
                System.out.println("B");
            case 3:
                System.out.println("C");
        }
        
        System.out.println("a".valueOf("b"));
        
        int []a[]=new int[10][] ;
        
        int j=8,k=8;
        System.out.println(j=k++);
        System.out.println(k);
    }
}
