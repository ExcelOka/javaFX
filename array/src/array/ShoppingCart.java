package array;

import java.io.File;
import java.io.IOException;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        double divResult = calc.divide(15, 3);
        System.out.println("Division Result: " + divResult);
        
        try {
        	File testFile = new File("testFile.txt");
        	testFile.createNewFile();
        	System.out.println("testFile exists:" + testFile.exists());
        	}
        	catch (IOException e) {
        	System.out.println(e);
        	}//end try catch

    }
}
