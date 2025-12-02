import test.TestData;

public class App {

    public static void main(String[] args) {

        Brand[] brands = TestData.createBrands();
        Sorter sorter = new Sorter();
        Search search = new Search();

        System.out.println("=== Original ===");
        printBrands(brands);

       
        sorter.sortSelectionDesc(brands);

        System.out.println("\n=== Ordenado (Selection Sort Descendente) ===");
        printBrands(brands);

        
        Brand found1 = search.binarySearchByValidYears(brands, 8, false);
        Brand found2 = search.binarySearchByValidYears(brands, 10, false);

        System.out.println("\n=== Búsqueda 1 (8 años válidos, desc) ===");
        printResult(found1);

        System.out.println("\n=== Búsqueda 2 (10 años válidos, desc) ===");
        printResult(found2);
    }

    private static void printBrands(Brand[] brands) {
        for (Brand b : brands) {
            System.out.println(b.getName() + " - Años válidos: " + b.getTotalValidYears());
        }
    }

    private static void printResult(Brand b) {
        if (b == null) {
            System.out.println("No encontrada");
        } else {
            System.out.println("Encontrada: " + b.getName() +
                    " (Años válidos: " + b.getTotalValidYears() + ")");
        }
    }
}

