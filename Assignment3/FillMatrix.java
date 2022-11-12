import java.util.Scanner;

public class FillMatrix {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int L=sc.nextInt();
        int a[][]=new int[51][51];
        int b[][]=new int[51][51];
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<L;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int cs_H=0;
        int cs_L=0;
        int T=H;
        int num=T;
        int MoveKind=1;//1:Down,2:Right,3:Up,4:Left
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<L;j++)
            {
                num--;
                if(num==-T||num==0)
                {
                    MoveKind++;
                    if(MoveKind==5)
                    {
                        MoveKind=1;
                    }
                    if(num==-T||((T==H)&&num==0))
                    {
                        T--;
                        num=T;
                    }
                }
                b[cs_H][cs_L]=a[i][j];
                if(MoveKind==1)
                {
                    cs_H++;
                }
                if(MoveKind==2)
                {
                    cs_L++;
                }
                if(MoveKind==3)
                {
                    cs_H--;
                }
                if(MoveKind==4)
                {
                    cs_L--;
                }
            }
        }
        for(int i=0;i<H;i++)
        {
            for(int j=0;j<L;j++)
            {
                System.out.printf("%d",b[i][j]);
                if(j!=L-1)
                {
                    System.out.printf(" ");
                }
                else
                {
                    System.out.printf("\n");
                }
            }
        }
    }

}

