public class Product implements IProduct {

    private final String[] productNames;
    private final int[] productsSold;

    public Product(String[] productNames, int[] productsSold) {
        this.productNames = productNames;
        this.productsSold = productsSold;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;

        for (int sold : productsSold) {
            total += sold;
        }

        return total;
    }

    @Override
    public double GetAverageProductSold() {
        if (productsSold.length == 0) {
            return 0;
        }

        return (double) GetTotalProductsSold() / productsSold.length;
    }

    @Override
    public String GetMostPopularProduct() {
        if (productNames.length == 0 || productsSold.length == 0) {
            return "No products available";
        }

        int mostPopularIndex = 0;

        for (int i = 1; i < productsSold.length; i++) {
            if (productsSold[i] > productsSold[mostPopularIndex]) {
                mostPopularIndex = i;
            }
        }

        return productNames[mostPopularIndex];
    }
}