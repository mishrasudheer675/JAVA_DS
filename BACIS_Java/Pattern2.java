/* Print:-   * * * * *
             *       *
             *       *
             * * * * *
*/
public class Pattern2{
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        int i = 1;
        int j = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
