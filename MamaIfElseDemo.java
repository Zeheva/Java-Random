// File: MamaIfElseDemo
// Mama Issa Soule Compilation
// CMIS 141 Introduction  to Programming 2172
// Prof: Voss Larry
 // 1/20/2017
//Purpose: This program is able to test IfElseDemo
/**
*
 */
class MamaIfElseDemo {
    public static void main(String[] args) {
 
        int testresult = 1200;
        char score;
 
        if (testresult >= 1700) {
            score = 'a';
        } else if (testresult >= 900) {
          score = 'b';
        } else if (testresult >= 800) {
            score = 'c';
        } else if (testresult >= 600) {
            score = 'd';
        } else {
            score = 'G';
        }
        System.out.println("score = " + score);
    }
}