import java.util.*;
class Product {
    String id;
    String name;
    long price1;
    long price2;

    public Product(String id, String name, long price1, long price2) {
        this.id = id;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }
}
class Invoice implements Comparable<Invoice> {
    String fullId;
    String productName;
    long discount;
    long totalToPay;

    public Invoice(int index, String rawId, int quantity, Map<String, Product> productMap) {
        this.fullId = String.format("%s-%03d", rawId, index);
        String prodId = rawId.substring(0, 2);
        int type = rawId.charAt(2) - '0';
        Product p = productMap.get(prodId);
        this.productName = p.name;
        long price = (type == 1) ? p.price1 : p.price2;
        long rawTotal = price * quantity;
        if (quantity >= 150) {
            this.discount = rawTotal * 50 / 100;
        } else if (quantity >= 100) {
            this.discount = rawTotal * 30 / 100;
        } else if (quantity >= 50) {
            this.discount = rawTotal * 15 / 100;
        } else {
            this.discount = 0;
        }
        this.totalToPay = rawTotal - this.discount;
    }
    @Override
    public int compareTo(Invoice other) {
        return Long.compare(other.totalToPay, this.totalToPay);
    }
    @Override
    public String toString() {
        return String.format("%s %s %d %d", fullId, productName, discount, totalToPay);
    }
}

public class sapxephanghoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numProducts = Integer.parseInt(sc.nextLine().trim());
        Map<String, Product> productMap = new HashMap<>();
        for (int i = 0; i < numProducts; i++) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            long price1 = Long.parseLong(sc.nextLine().trim());
            long price2 = Long.parseLong(sc.nextLine().trim());
            productMap.put(id, new Product(id, name, price1, price2));
        }

        int numInvoices = Integer.parseInt(sc.nextLine().trim());
        List<Invoice> invoices = new ArrayList<>();
        for (int i = 1; i <= numInvoices; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            String rawId = parts[0];
            int quantity = Integer.parseInt(parts[1]);
            invoices.add(new Invoice(i, rawId, quantity, productMap));
        }
        Collections.sort(invoices);

        for (Invoice inv : invoices) {
            System.out.println(inv);
        }

    }
}