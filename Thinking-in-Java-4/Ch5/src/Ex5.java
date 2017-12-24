public class Ex5 {
    public static void main(String[] args){
        Dog dog=new Dog();
        dog.bark(1);
        dog.bark(1.0);
        dog.bark("1");
    }
}

class Dog{
    public void bark(int i){
        System.out.println(i+"barking");
    }
    public void bark(double d){
        System.out.println(d+"howling");
    }
    public void bark(String s){
        System.out.println(s+"bark");
    }
}