package college.Assignment1;

public class Sort {
    
    
    public void sort(int[] ar,int n){
        for(int i=0;i<n/2;i++){
            for(int j=i+1;j<n/2;j++){
                    if(ar[i]>ar[j]){
                        int temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                    }
            }
        }
        for(int i=n/2;i<n;i++){
            for(int j=i+1;j<n;j++){
                    if(ar[i]<ar[j]){
                        int temp=ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                    }
            }
        }

        System.out.println("The elements are : ");
        for(int i=0;i<n;i++){
            System.out.println(ar[i]);
        }
    }
}
