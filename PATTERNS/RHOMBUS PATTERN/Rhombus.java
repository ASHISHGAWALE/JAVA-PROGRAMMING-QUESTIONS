public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
