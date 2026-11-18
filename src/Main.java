import java.util.Scanner;

//I will use a 3x3 2D array to store the number of sales for each month for each product.
//row = product, col = month

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of sales for month 1 for Cozy Nights Monarch mattress: ");
        int cozyMonthOne = input.nextInt();
        System.out.print("Enter number of sales for month 2 for Cozy Nights Monarch mattress: ");
        int cozyMonthTwo = input.nextInt();
        System.out.print("Enter number of sales for month 3 for Cozy Nights Monarch mattress: ");
        int cozyMonthThree = input.nextInt();

        System.out.print("Enter number of sales for month 1 for Restonic Barbados mattress: ");
        int barOne = input.nextInt();
        System.out.print("Enter number of sales for month 1 for Restonic Barbados mattress: ");
        int barTwo = input.nextInt();
        System.out.print("Enter number of sales for month 1 for Restonic Barbados mattress: ");
        int barThree = input.nextInt();

        System.out.print("Enter number of sales for month 1 for Sealy Phuket mattress: ");
        int sealyOne = input.nextInt();
        System.out.print("Enter number of sales for month 1 for Sealy Phuket mattress: ");
        int sealyTwo = input.nextInt();
        System.out.print("Enter number of sales for month 1 for Sealy Phuket mattress: ");
        int sealyThree = input.nextInt();

        int[][] productSales = new int[3][3];
        productSales[0][0] = cozyMonthOne;
        productSales[0][1] = cozyMonthTwo;
        productSales[0][2] = cozyMonthThree;

        productSales[1][0] = barOne;
        productSales[1][1] = barTwo;
        productSales[1][2] = barThree;

        productSales[2][0] = sealyOne;
        productSales[2][1] = sealyTwo;
        productSales[2][2] = sealyThree;

        int totalProductSales = productSales[0][0] + productSales[0][1] + productSales[0][2] + productSales[1][0] + productSales[1][1] + productSales[1][2] + productSales[2][0]+productSales[2][1] +  productSales[2][2];
        int averageProductSales = totalProductSales / (productSales.length)/3;

        String[] productNames = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };

        int highestSellingProduct = 0;
        int highestSales = 0;

        for (int row = 0; row < productSales.length; row++) {
            int productTotal = 0;

            for (int col = 0; col < productSales[row].length; col++) {
                productTotal += productSales[row][col];
            }

            if (productTotal > highestSales) {
                highestSales = productTotal;
                highestSellingProduct = row;
            }
        }

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println(" ");
        System.out.println("**************************************");
        System.out.println("TOTAL PRODUCT SALES REPORT: " + totalProductSales);
        System.out.println("AVERAGE PRODUCT SALES REPORT: " + averageProductSales);
        System.out.println("MOST POPULAR PRODUCT: " + productNames[highestSellingProduct] + " (" + highestSales + ")");
        

    }
}
