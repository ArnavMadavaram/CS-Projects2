/************
* Arnav Madavaram 
* Lab 1
* Due Date 
* To do basic math using simple calculator program in Java.
**/

public class SimpleCalculator {
    
    // TODO return the addition of x and y, 
    // it shouldn't 0!
    public int addIntegers(int x, int y) {
        return (x+y);
    }

    // TODO return the subtraction of x and y, 
    // also, shouldn't be 0!
    public int subtractIntegers(int x, int y) {
        return (x-y);
    }
    public static void main(String[] args){
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println(calc.addIntegers(10, 20));
        System.out.println(calc.subtractIntegers(50, 25));
    }
}
