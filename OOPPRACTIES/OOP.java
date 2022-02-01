package com.Rishabh.OOPPRACTIES;

    class Pen {
    String Name;
    String type;

//        public Pen(String name, String type) {
//            this.Name = name;
//            this.type = type;
//        }

        public void write(){
        System.out.println("Fuck you");
    }
    interface Animal {

            public void walk();
    }
     interface Herbivore{

     }

    class Horse implements Animal,Herbivore{
         public void walk(){
             System.out.println("walks on 4 legs");
         }
    }

    public void printpen(){
        System.out.println(this.Name);
    }

}
    class student{
        String Name;
        String Subject;

        public student(String name, String subject) {
            Name = name;
            Subject = subject;
        }
        public void printpen(){
            System.out.println(this.Name);
            System.out.println(this.Subject);
        }
        student(student s2){
            this.Name = s2.Name;
            this.Subject = s2.Subject;
        }
        student(){

        }
    }
    class shape{
        public void area(){
            System.out.println("display area");
        }
    }
    class triangle extends shape{
        public void area(int l, int h){
            System.out.println(1/2*l*h);
        }
    }
    class equitriangle extends shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }

public class OOP {
    public static void main(String[] args) {
//        Pen pen = new Pen();
//        pen.write();
//        pen.Name = "Fuckaa";
//        Pen pen1 = new Pen();
//        pen1.Name = "NotFuckaa";
//        pen.printpen();
//        pen1.printpen();
        student student = new student("Rishabh","Computer science");
        student s2 = new student(student);
        student.printpen();
        s2.printpen();
    }
}
