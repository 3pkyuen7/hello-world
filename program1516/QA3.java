public class QA3 {
 public static void main(String[] args) {// added []
 int sum = 0, i;	//added  Sum = 0// changed Sum --> sum
 i=1;
 while (i<=4){ // changed i<4   -->  i <= 4// deleted ;
 sum += i;
 i++;
 }				// put i ++ in side the blanket }
 System.out.println("1+2+3+4 = " + sum);
 }
}