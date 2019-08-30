public abstract class CaffeineBeverage {
    final void prepareRecipe() { //суперклассы не должны переопределять этот метод
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    boolean customerWantsCondiments(){
        return true;
    }

    final void boilWater() {
        System.out.println("Boiling watter");
    }

    abstract void brew();

    final void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiments();
}
