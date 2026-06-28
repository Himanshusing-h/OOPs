public class PassingMethodToClass {
    public static void main(String[] args) {
                Car c=new Car();
                c.name="himanshu singh";
                c.seats=4;
                c.torque=175;
                change(c);
            c.print();

            }
            private static void change(Car c)
            {
                c.seats=5;
            }
            public  static  class Car{
                int seats;
                String name;
                int torque;
                void print()
                {
                    System.out.println(name+" "+torque+" "+seats);
                }
            }

        }
