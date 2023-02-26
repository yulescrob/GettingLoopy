public class Main {
    public static void main(String[] args) {

        //Loop 1
        for (int cnt=0; cnt<=30; cnt++)
        {
            System.out.println(cnt);
        }

        //loop 2
        for (int cnt=30; cnt>=1; cnt--)
        {
            System.out.println(cnt);
        }

        //loop 3
        for (int cnt=0; cnt<=18; cnt= cnt+3)
        {
            System.out.println(cnt);
        }

        //loop 4
        for (int cnt=10; cnt>=0; cnt=cnt-2)
        {
            System.out.println(cnt);
        }

        //loop 5
        final int ROW=5;

        for (int row = 1; row<=ROW; row++)
        {
            for (int col=1;col<=row;col++)//across columns
            {
                System.out.print("*");
            }
            System.out.println("");
            // each time the inner loop is run then it print on the next line
        }

        //Loop 6
        final int ROW=0;

        for (int row=5; row>ROW;row--)
        //5>0 with 5 decreasing each time, is true 5 times
        {
           for (int col=0; col<row; col++)
           //adds stars to the columns
           {
               System.out.print("*");
           }
            System.out.println("");
        }

        //Loop 7
        final int ROW =5;
        final int COL=5;

        for (int row=1;row<=ROW; row++)
        {
            for (int col=1; col<=COL; col++) //inner loop across row
            {
                System.out.print("*");
            }
            System.out.println("");
            // prints in next line after each inner loop
        }



    }
}