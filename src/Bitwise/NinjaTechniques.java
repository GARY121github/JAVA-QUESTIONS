package Bitwise;

public class NinjaTechniques {

        static void printBinary(int num){
            System.out.print("BINARY OF THE NUMBER " + num + " => ");
            for(int i = 10 ; i >= 0 ; --i){
                System.out.print((num >> i) & 1);
            }
            System.out.println();
        }

//    To check weather a number is even or odd
    static boolean isEven(int num){
        return (num & 1) == 0;
    }



    static char toLower(char ch){

//    Method-1 --->  To convert UpperCase Letter to lower case letter we need set the 5th bit of the Character.
//            return (char)(ch | 1<<5);


//    Method-2 --->  ASCII VALUE of space(' ') is 32 and its binary is 100000 ,
//        so we can OR(bitwise) ' ' with the UpperCase character to convert it to lowerCase character.
        return (char)(ch | ' ');
    }



    static char toUpper(char ch){
//    Method-1 --->   To covert LowerCase Letter to upper case letter we need to un-set the 5th bit of the Character.
//            return (char)(ch & ~(1 << 5));

//    Method-2 ---> ASCII VALUE of underscore('_') is 95 and its binary iscdc 1011111 ,
//         so we can AND(bitwise) '_' with the LowerCase character to convert it to upperCase character.

        return (char) (ch & '_');
    }

    static void XOR(){

//            OPERATIONS OF XOR :->
//            x ^ x = 0
//            x ^ 0 = x
//        x ^ y ^ z = x ^ z ^ y = z ^ y ^ x

//            SWAPPING OF TWO NUMBER
            int a = 5;
            int b = 10;

            a = a ^ b;
            b = b ^ a;  // a -> (a^b), so here b = b ^ a ^ b which is equal to b = a as x ^ x = 0.

            a = a ^ b;  // here a -> (a^b) and b -> a, so here a = a ^ b ^ a which is equal to a = b as x ^ x = 0.

        System.out.println("After swapping ---> a = "+ a +" and b = " + b );

    }

    public static void main(String[] args) {

            XOR();
    }

}
