public class Oops1 {
    public static void main(String[] args) {

           //Constructor
//         Pen p1 = new Pen();
//         p1.setcolor("blue");    
//         p1.getColor();
//         p1.settip(5);
//         System.out.println(p1.getTip());

            // Method overloading
            // calculate cal =new calculate();
            // System.out.println(cal.sum(1,2));
            // System.out.println(cal.sum((float)1.5,(float)1.6));
            // System.out.println(cal.sum(1,2,3));

            //Method overwriting
            // student s1 = new student();
            // s1.name();  
            // ram r1 = new ram();
            // r1.name();

            //Abstraction
            // five f1= new five();
            // f1.name();
            // f1.height();
            // six s1 = new six();
            // s1.name();
            // s1.height();
            // seven s2 = new seven(); 
            // s2.name();
            // s2.height();

            //Static keyword
            student s1 = new student();
            student s2= new student();
            s2.setname("Ram");
            s1.setname("John");
            s1.age=20;
            s2.age=25;
            System.out.println(s1.getname());
            System.out.println(s2.getname());
            System.out.println(s1.age);
            System.out.println(s2.age);


    }
}

// class Pen {
//        private String color;
//         private int tip;

//          String getColor() {
//             return this.color;
//         }
//         int getTip() {  
//             return this.tip;
//         }
//         void setcolor(String c){
//             color = c;
//         }
//         void settip(int t){
//             tip = t;
    //      }
    // } 
    
    // Method Overloading
    // class calculate{
    //     int sum(int a ,int b){
    //         return a +b;
    //     }

    //     int sum(int a ,int b,int c){
    //         return a+b+c;
    //     }

    //     float sum(float a, float b){
    //         return a+b;
    //     }
    // }    
    
    // Method overwriting

//     class student{
//         void name(){
//             System.out.println(" Students");
//         }
        
//     }
// class ram extends student{
//     void name(){
//         System.out.println("Ramj");
//     }
// }

    //Abstraction

    // abstract class student{
        
    //     String skin;
    //     student(){
    //         skin="brown";
    //     }
    //     void name(){
    //         System.out.println("Student");
    //     }
    //     abstract void height();

        
    // }

    // class five extends student{
    //     void height(){
    //         System.out.println("5");
    //     }
    //     void changeskin(){
    //         skin="white1";
    //     }
    // }

    // class six extends student{
    //     void height(){
    //         System.out.println("6");
    //     }
    //     void changeskin(){
    //         skin="white1";
    //     }
    // }

    // class seven extends student{
    //     void height(){
    //         System.out.println("7");
    //     }
    //     void changeskin(){
    //         skin="white1";
    //     }
    // }

    //Static keyword

    class student{
        String name;
        static int age;
        
        void setname(String name){
            this.name=name;

        }
        String getname(){
            return (this.name);
        }
    }

    
    
    
    
    

