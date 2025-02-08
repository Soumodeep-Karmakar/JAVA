package college.Assignment18;

public class CountWord {
    int count=0;
    public int count(String s1){
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '||s1.charAt(i)=='.'){
                count+=1;
            }
        }
        return count;
    }
}
