


public class This_keyword {
        public static class Car{
            //global variable
            int price; // 0
            String name; // null
            Car(){ // default constructor

            }
            Car(int price, String name){
                //this.price means globally jo price hai usme initialize krdo local vale price ko
                this.price = price;
                //this.name means globally jo name hai usme initialize krdo local vale name ko
                this.name = name;
            }
            Car(String s, int x){
                this.price = x;
                name = s;
            }

            void print(){
                int price = 12;
                System.out.println(this.price+" "+name);
            }
        }

        public static void main(String[] args) {
            Car c1 = new Car(1250000,"Kia Sonet");
            c1.print();
            Car c2 = new Car("Lord Alto",400000);
            c2.print();
            Car c3 = new Car();
            c3.name = "Honda Amaze";
        }
    }

