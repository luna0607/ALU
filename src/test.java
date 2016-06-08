import java.util.Arrays;

/**
 * Created by Ariana on 2016/6/7.
 */
public class test {
    static  test t=new test();
    public static void main(String[]args){
String claAdder=t.claAdder("1000","1010",'1');
        System.out.println(claAdder);
    }

    public String claAdder (String operand1, String operand2, char c) {
        // TODO YOUR CODE HERE.
        int[] c1=new int[5];
        int[]c2=new int[5];
        c1[4]=Integer.parseInt(String.valueOf(operand1.charAt(3)))*Integer.parseInt(String.valueOf(operand2.charAt(3)))
                +(Integer.parseInt(String.valueOf(operand1.charAt(3)))^Integer.parseInt(String.valueOf(operand2.charAt(3))))
                *Integer.parseInt(String.valueOf(c));
        System.out.println("c4 is "+c1[4]);
        for(int i=3;i>=1;i--){
            c1[i]=Integer.parseInt(String.valueOf(operand1.charAt(i-1)))*Integer.parseInt(String.valueOf(operand2.charAt(i-1)))
                    +(Integer.parseInt(String.valueOf(operand1.charAt(i-1)))^Integer.parseInt(String.valueOf(operand2.charAt(i-1))))
                    *c1[i+1];
            System.out.println("c"+i+" is "+c1[i]);
        }
        for(int i=4;i>=2;i--){
            c2[i]=(Integer.parseInt(String.valueOf(operand1.charAt(i-1)))^Integer.parseInt(String.valueOf(operand2.charAt(i-1))))
                    ^c1[i];
        }
        c2[0]=c1[0];
        StringBuilder sb;
        sb = new StringBuilder();
        for(int i=0;i<c2.length;i++){
            sb.append(String.valueOf(c2[i]));
        }

        return sb.toString();
    }
}
