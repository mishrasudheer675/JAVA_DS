/*  Print:-      1
                2 2
               3 3 3
              4 4 4 4
             5 5 5 5 5
*/
public class Pattern10{
    public static void main(String[] args){
        int n = 5;
        int i = 1;
        int j = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}