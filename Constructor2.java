
    import java.util.Arrays;
    public class Constructor2 {
        public static class StudentData{
            String name;
            int rno;
            int[] marks;
            int [] mark;
            //we can pass array to a cnstructor
            StudentData(int[] s){
                //s is a temorary array which can access arr and modify it only inside this studentdata ,like local variable
                s[0]=47;
                System.out.println(s[0]);
                //but mark and marks are global scope so it can be accessed outside this studentdata method;
               mark = Arrays.copyOf(s,s.length);// changing this will not change arr ,hence deep copy
              marks=s;//shallow copy arr will also change

            }
            StudentData(int s){
                //this is used to initialize the array with its size
                marks = new int[s];
            }
        }
        public static void main(String[] args) {
            int[] arr = {4,7,1,4,8};
             //creating object of studentdata class
            //objects are real entity
            StudentData s1 = new StudentData(arr);
            //shallow copying
            s1.marks[0] = 40;
            System.out.println(arr[0]);
            //deep copy
            s1.mark[0]=55;
            System.out.println(arr[0]);
            //creating second object
            //but this time with size of array

            StudentData s2 = new StudentData(2);

        }
    }
