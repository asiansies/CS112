/* 
 * Aihoa Le
 * aihoale@bu.edu
 * Homework 01
 * 
 */

class MyClass {
    static int value; 
    
    public static void main(String[] args) {
        value = 4;
    }
}

/* 
 * main() cannot access value at first because it is declared as a non-static
 * variable outside of main(). By making the variable static, main() can now access it.
 * value can also be declared inside main() instead of as a static variable outside
 * of it.
 * 
 */