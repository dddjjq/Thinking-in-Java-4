public class Ex4 {
    public Ex4(){
        System.out.println("This is Ex4");
    }
    public Ex4(int i){
        System.out.println("This is Ex4"+" "+i);
    }
    public static void main(String[] args){
        Ex4 ex4_1=new Ex4();
        Ex4 ex4_2=new Ex4(12);
    }
}