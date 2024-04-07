public class Exercise5_1 {
    public static void main(String[] args) 
    {
        System.out.printf("%-5s","The first 50 prime numbers are");
        int i=2;
        int count =0;
        while(i<=230)
        {
            if(i%2!=0 && i%3!=0 & i%5!=0 && i%7!=0 && i%11!=0 && i%13!=0 || i==2 || i==3 || i==7 || i==5 || i==11 || i==13)
            {
                if(count%10==0)
                {
                    System.out.println();
                }
                System.out.printf("%-5d",i);
                count++;
            }
            i++;
        }
    
}
}