public class ComplexNumber {
    public static void main(String[] args) {
        //creating first object

      method m1=new method(5,5);
     // method m2=new method()
        /*
        the above declaration was good until i have not created constructor but after creating constructor this will give error
         */
        //creating second object
        method m2=new method(4,5);
//      m1.x=5;
//      m1.y=51;
        //calling function
        m1.print();
        m2.print();
        method.add();
        method.multiply();


    }


    public static class method{
        //using static as single memory will be allocated and we can keep on adding or multiplying and changing the value for every object and at last printing it
      static   int sumx=0;
      static int sumy=0;
        static   int mulx=1;
        static int muly=1;
        //global variable
      int x;
        int y;
        //this method is initializing global variable and also rewriting sum and mul value
     method(int x,int y)
        {
            //global wale x mai local wale x ka value initialize krdo
            this.x=x;
            this.y=y;
            sumx+=x;
            sumy+=y;
            mulx*=x;
            muly*=y;

        }
        //this methods is simply printing elements
        void print()
        {
            System.out.println(x+"+"+"i"+y);
        }
       static void add(){
             System.out.println(sumx+"+"+"i"+sumy);
        }
        static void multiply()
        {
            System.out.println(mulx+"+"+"i"+muly);
        }


    }
}
