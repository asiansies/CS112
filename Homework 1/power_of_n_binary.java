/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 01
 * 
 */

class power_of_n_binary
{
    static int multiplication_count = 0;
    
    static int power_of_n_binary_recursive (int x, int n)
    {
        int result; // result should be declared outside if-else statement in order to be returned.
        
        if ( n == 0 )    // semicolon should not be placed here because it ends the statement.
        {
            return ( 1 );
        }
        else if ( 1 == n ) {
            return x;
        }
        else {
            result = power_of_n_binary_recursive ( x, n / 2 );
            
            result *= result; multiplication_count++;  // variable was capitlized incorrectly
            
            if ( n % 2 == 1 )
                
                result *= x;
            
            ++multiplication_count; // variable was capitalized incorrectly
        }
        
        return ( result );
    }
    
    // extra bracket removed because it ended the class.
    
    public static void main ( String[] args ) {  // bracket inserted to show start of main()
        int x = 5, n = 12, result;  //comma added to declare variables correctly.
                           
        
        multiplication_count = 0;
        
        result = power_of_n_binary_recursive ( x, n );
    }
}