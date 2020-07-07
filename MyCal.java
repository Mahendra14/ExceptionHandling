
public class MyCal {
    public long power(int a,int b) throws Exception
    {
     if(a==0 && b==0)
     throw new Exception("a and b should not be zero.");
     else if(a<0 ||b<0)
     throw new Exception("a or b should not be negative.");
     else
     return (long)Math.pow(a,b);
            
    }
}
