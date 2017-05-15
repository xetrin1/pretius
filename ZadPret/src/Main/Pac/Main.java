package Main.Pac;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String fileName = scan.next();
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line = null;
		double sum = 0;
        while ((line = br.readLine()) != null) {
        	try{
        		String resultLine = line.substring(line.indexOf("@amount") + 8 , line.indexOf("PLN"));
        		resultLine = resultLine.replace(",", ".");
                sum = sum + Double.parseDouble(resultLine);
        	}catch(StringIndexOutOfBoundsException E) {
        		
        	}
        	
        }
        BigDecimal resultSum = new BigDecimal(sum);
        resultSum = resultSum.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.print("Suma: " + resultSum + " PLN");
	}

}
