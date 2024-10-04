public class gridWays {
    public static int GridWays(int n,int m, int j,int i){
        //for base case
        if((i==n-1) && (j==m-1)){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }
        //For Right Ways
        int w1 = GridWays(n, m, j, i+1);
        //for down ways
        int w2 = GridWays(n, m, j+1, i);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(GridWays(n, m,0,0));
    }
    
}
