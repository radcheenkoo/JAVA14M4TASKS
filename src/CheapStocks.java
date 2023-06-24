public class CheapStocks {
    public String getCheapStocks(String[] stocks) {
        String cheapStocks = "";

        for (String stock : stocks) {
            String[] parts = stock.split(" ");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);

            if (price < 200) {
                cheapStocks += name + " ";
            }
        }

        if (!cheapStocks.isEmpty()) {
            cheapStocks = cheapStocks.trim();
        }

        return cheapStocks;
    }
}
