public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea teaWithLemon = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("\nMaking tea...");
        teaWithLemon.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

    }
}
