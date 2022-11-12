import java.util.Scanner;

public class CalculatingArea {
    private static int a[][]=new int[202][202];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L=sc.nextInt();

        for(int i=0;i<L;i++)
        {
            int Kind=sc.nextInt();
            int num1=sc.nextInt()+100;
            int num2=sc.nextInt()+100;
            if(Kind==1)
            {
                if(a[num1][num2]==2)
                {
                    continue;
                }
                if(a[num1][num2]==0)
                {
                    a[num1][num2]=2;
                }
                else if(a[num1][num2]==6||a[num1][num2]==4||a[num1][num2+1]==5)
                {
                    a[num1][num2]=6;
                }
                else
                {
                    a[num1][num2]=5;
                }
                if(a[num1+1][num2]==0)
                {
                    a[num1+1][num2]=1;
                }
                else if(a[num1+1][num2]==6||a[num1+1][num2]==3||a[num1+1][num2]==5)
                {
                    a[num1+1][num2]=6;
                }
                else
                {
                    a[num1+1][num2]=5;
                }
                //
                if(a[num1][num2+1]==0)
                {
                    a[num1][num2+1]=3;
                }
                else if(a[num1][num2+1]==6||a[num1][num2+1]==2||a[num1][num2+1]==5)
                {
                    a[num1][num2+1]=6;
                }
                else
                {
                    a[num1][num2+1]=5;
                }

                if(a[num1+1][num2+1]==0)
                {
                    a[num1+1][num2+1]=4;
                }
                else if(a[num1+1][num2+1]==6||a[num1+1][num2+1]==1||a[num1+1][num2+1]==5)
                {
                    a[num1+1][num2+1]=6;
                }
                else
                {
                    a[num1][num2]=5;
                }
            }
            if(Kind==2)
            {
                a[num1][num2]=6;
                a[num1+1][num2]=6;
                a[num1][num2+1]=6;
                a[num1+1][num2+1]=6;
            }
        }
        double totalNum=0;
        for(int i=0;i<202;i++)
        {
            for(int j=0;j<202;j++)
            {
                if(a[i][j]>=1&&a[i][j]<=4)
                {
                    totalNum+=Math.PI/4;
                }
                else if(a[i][j]==5)
                {
                    totalNum+=Math.sqrt(3)/4+Math.PI/6;
                }
                else if(a[i][j]==6)
                {
                    totalNum+=1;
                }
            }
        }
        System.out.printf("%.5f", totalNum);
    }
}

