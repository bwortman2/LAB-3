public class Lab3 {
    public static void main(String[] args)
    {
        System.out.println( ((5+4)-12) + "  :  " + subtract(add(5,4),12) );
        System.out.println( ((5+4)-12) + "  :  " + multiply(4,4) );
        System.out.println( ((5+4)-12) + "  :  " + divide(20,4) );
    }

    private static int add(int x, int y)
    {
        int result = 0;
        for( int i=0; i < x; i = i + 1)
            result = result + 1;

        for( int i=1; i <= y; i= i + 1)
            result = result + 1;

        return result;
    }

    private static int subtract(int x, int y)
    {
        int result = add(x,0);

        for( int i=0; i < y; i = i + 1)
            result = result - 1;

        return result;
    }
    private static int multiply(int x, int y)
    {
        int result = 0;
        for (int i=0; i < y; i = i + 1)
            result = result + x;

        return result;
    }
    private static int divide(int x, int y)
    {
        int result = 0;
        for (int i=x; i >= y; i = i - y)
            result = result + 1;

        return result;
    }
}
