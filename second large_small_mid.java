import java.io.*;
import java.util.*;

class second_large{

    public static void main(String[] args)
    {
        int[] number = {100,400,200,900,700,800,500,1000};
        Scanner in = new Scanner(System.in);
        int temp=0;
        for( int i = 0; i <= number.length; i++)
        {
            for( int j= i+1 ;j < number.length; j++ )
            {
                if(number[i]>number[j])
                {
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println("sorted number:");
        for( int i=0; i<number.length;i++)
        {
            System.out.println(number[i]);
        }
        System.out.println("Second smallest number is :"+number[0+1]);
        System.out.println("Second largest number is :"+number[number.length-2]);
        System.out.println("Mid number is :"+number[number.length/2]);

    }
}
