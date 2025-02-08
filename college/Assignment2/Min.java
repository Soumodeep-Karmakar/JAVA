package college.Assignment2;

public class Min {
    public void min(int[][] ar,int m,int n){
        
        for(int i=0;i<m;i++){
            int min=ar[i][0];
            for(int j=0;j<n;j++){
                if(min>ar[i][j])
                    min=ar[i][j];
            }
            ar[i][n]=min;
        }
        for(int i=0;i<n;i++){
            int min=ar[0][i];
            for(int j=0;j<m;j++){
                if(min>ar[j][i])
                    min=ar[j][i];
            }
            ar[m][i]=min;
        }
        System.out.println("The result matrix is : ");
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==m && j==n )
                break;
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
