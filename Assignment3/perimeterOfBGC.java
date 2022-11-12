import java.util.Scanner;

public class perimeterOfBGC {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int a[][]=new int[101][101];
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<L;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int C=0;
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<L;j++)
            {
                if(a[i][j]==1)
                {
                    if((i-1>=0&&a[i-1][j]==0)||i-1<0)
                    {
                        C++;
                    }
                    if((j-1>=0&&a[i][j-1]==0)||j-1<0)
                    {
                        C++;
                    }
                    if((i+1<100&&a[i+1][j]==0)||i+1>=100)
                    {
                        C++;
                    }
                    if((j+1<100&&a[i][j+1]==0)||j+1>=100)
                    {
                        C++;
                    }
                }
            }
        }
        System.out.println(C);
    }

}
