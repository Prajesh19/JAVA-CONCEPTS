public class incdec {
    public static void main(String[] args) {
        String[] s = {"--x" ,"x++","x++"};
        int x=0;
        for(String op:s){
            if(op.charAt(1)=='+'){
                x= x+1;
            }
            else{
                x=x-1;
            }
        }
        System.out.println(x);
    }
}
