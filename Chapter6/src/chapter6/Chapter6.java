
package chapter6;

public class Chapter6 {
    
    public static void main(String[] args) {
        
        Rectangle smallRectangle = new Rectangle(10, 5);
        //smallRectangle.setLength(10);
        //smallRectangle.setWidth(5);
        printRectangle(smallRectangle);
        
               
        Rectangle largeRectangle = new Rectangle();
        System.out.println(largeRectangle);
        largeRectangle.setLength(20);
        largeRectangle.setWidth(50);
        printRectangle(largeRectangle);
        
        
        Rectangle weirdMathRectangle = largeRectangle.addTogether(smallRectangle);
        printRectangle(weirdMathRectangle);
        
        sum(1, 2);
        sum("1", "2");
        
        BankAccount savings = new BankAccount("Savings", 100);
        savings.deposit(100);
        System.out.println(savings.getName() + " balance: " + savings.getBalance());

    }
    
    public static void sum(int a, int b)
    {
        System.out.println(a+b);
    }
    
    public static void sum(String a, String b)
    {
        System.out.println(a + b);
    }
    
    public static void printRectangle(Rectangle rectangle)
    {
        System.out.println(rectangle);
        //rectangle.setLength(100);
        System.out.println("Length of our rectangle: " + rectangle.getLength());
        System.out.println("Width of our rectangle: " + rectangle.getWidth());
        System.out.println("Area of our rectangle: " + rectangle.getArea());
        
    }
    
}
