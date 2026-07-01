import java.util.*;
class Fraction{
    //created double because while adding if they are int we will not get desired output
    double num;
    double den;
    double add;
    double multi;
    double div;
    Fraction(int num,int den)
    {
        this.num=num;
        this.den=den;
    }
    void print()
    {
        System.out.println(num/den);
    }
    void add(Fraction a)
    {
        //adding two fraction
      num=num*a.den+a.num*den;
      den=den*a.den;
      add=num/den;
        System.out.println(add);
    }
    void multiply(Fraction a)
    {
        num*=a.num;
        den*=a.den;
        multi=num/den;
        System.out.println(multi);
    }
    void divide(Fraction a){
        num*=a.den;
        den*=a.num;
        div=num/den;
        System.out.println(div);
    }
}





public class Fraction_class {
    public static void main(String[] args) {
        Fraction f1=new Fraction(3,7);
        Fraction f2=new Fraction(7,3);
        f1.add(f2);
        f1.divide(f2);
        f1.multiply(f2);
    }
}
