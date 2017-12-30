public class Ex15 {
    public static void main(String[] args){
        String s="+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        //System.out.print(Ex15.stacktest(s));
        new Ex15().stacktest(s);
    }
    public static void stacktest(String s){
        char[] c=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        //System.out.print(c);
        for(int i=0;i<c.length;i++){
            if(c[i]=='+')
                stack.push(c[i+1]);
            else if(c[i]=='-'){
                System.out.print(stack.pop()+"");
            }
        }
        //return stack;
    }
}
