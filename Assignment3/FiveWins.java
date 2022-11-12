import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class FiveWins {
    static int L;
    static int[][] chess = new int[100][100];
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ArrayList<Point> List=new ArrayList<Point>();
        L=sc.nextInt();
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<L;j++)
            {
                chess[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<L;i++)
        {
            for(int j=0;j<L;j++)
            {
                if(chess[i][j]==0)
                {
                    chess[i][j]=1;
                    if(judge(i,j))
                    {
                        List.add(new Point(i+1,j+1));
                    }
                    chess[i][j]=0;
                }
            }
        }
        for(int i=0;i<List.size();i++)
        {
            System.out.println(List.get(i).x+" "+List.get(i).y);
        }
    }
    public static boolean judge(int cs_Y, int cs_X) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();
        StringBuffer str3 = new StringBuffer();
        StringBuffer str4 = new StringBuffer();
        for (int y = cs_Y, x = 0; x < L; x++)
        {
            str1.append(chess[y][x]);
        }
        for (int y = 0, x = cs_X; y < L; y++)
        {
            str2.append(chess[y][x]);
        }
        if (cs_Y >= cs_X)
        {
            for (int y = cs_Y - cs_X, x = 0; y < L; y++, x++)
            {
                str4.append(chess[y][x]);
            }
        }
        else
        {
            for (int y = 0, x = cs_X - cs_Y; x < L; y++, x++)
            {
                str4.append(chess[y][x]);
            }
        }
        if ((cs_X + cs_Y) < L)
        {
            for (int x = cs_X + cs_Y, y = 0; y <= cs_X + cs_Y; y++, x--)
            {
                str3.append(chess[y][x]);
            }
        }
        else
        {
            for (int x = L - 1, y = cs_X + cs_Y - (L - 1); y < L; y++, x--)
            {
                str3.append(chess[y][x]);
            }
        }
        if (str1.toString().matches("\\d*1{5}\\d*")|| str2.toString().matches("\\d*1{5}\\d*")|| str3.toString().matches("\\d*1{5}\\d*")|| str4.toString().matches("\\d*1{5}\\d*"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

