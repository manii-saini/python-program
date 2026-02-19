import java.util.*;

 class ZigzagPrimeArray
 {
 
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> primeNumbers = new ArrayList<>();
        for (int num = 1; num <= 100; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }
       
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        
   
        int cols = 10;
        int[][] zigzagArray = new int[rows][cols];
        

        int index = 0;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) { 
                for (int j = 0; j < cols; j++) {
                    if (index < primeNumbers.size() && primeNumbers.get(index) <= (i + 1) * 10) {
                        zigzagArray[i][j] = primeNumbers.get(index++);
                    } else {
                        zigzagArray[i][j] = 0; // Fill empty spaces with 0
                    }
                }
            } else { 
                for (int j = cols - 1; j >= 0; j--) {
                    if (index < primeNumbers.size() && primeNumbers.get(index) <= (i + 1) * 10) {
                        zigzagArray[i][j] = primeNumbers.get(index++);
                    } else {
                        zigzagArray[i][j] = 0; 
                    }
                }
            }
        }
        
        for (int[] row : zigzagArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}
