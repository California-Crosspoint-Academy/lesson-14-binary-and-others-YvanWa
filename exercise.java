// Lesson14Exercises.java

public class exercise {
    public static void main(String[] args) {

        // 1.   15439
        // 2.   35
        // 3.   415
        // 4.   Not legal: 9 is not a valid octal digit
        // 5.   Legal
        // 6.   39494
        // 7.   91
        // 8.   3335
        // 9.  //23611
        int a = 0x5C3B;       
        System.out.println(a);
        // 10.  //1781
        int k = 03365;
        System.out.println(k);

        // 11. 111011110
        // 12. 162E
        // 13. 13056
        // 14. AB5A
        // 15. 4423
        // 16. 10
        // 17. 8
        // 18. Base 16
        // 19. 0x10
        // 20. Base 2
        // 21. 11010110
        // 22. 10100010
        // 23. "10" in binary = 2 in decimal (two types of people)
        // 24.  //10
        String s = "1010";  
        int b = 2;
        int i = Integer.parseInt(s, b);
        System.out.println(i);
        //35. //1k16
        int value = 0x9322;
        String sBase28 = Integer.toString(value, 28);
        System.out.println(sBase28);

        // 26. 128E0
        // 27. 42014163
        // 28. 3165
        // 29. 15A6
         // 30.  //  9
        int i2 = 0b1001; 
        System.out.println(i2); 
    }
}
