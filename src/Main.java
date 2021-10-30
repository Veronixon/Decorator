public class Main {
    public static void main(String args[]) {
        Pizza cheesePizza = new CheesePizza(new DoughPizza());
        Pizza pepperoniCheesePizza = new PepperoniPizza(cheesePizza);
        Pizza pepperoniVeggieCheesePizza = new VegetablesPizza(pepperoniCheesePizza);
        System.out.println(pepperoniCheesePizza.makePizza());
        System.out.println(pepperoniVeggieCheesePizza.makePizza());
    }
}

interface Pizza {
    String makePizza();
}

class DoughPizza implements Pizza {
    @Override
    public String makePizza() {
        return " with ";
    }
}

class CheesePizza implements Pizza {
    Pizza pizza;

    public CheesePizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "cheese ";
    }
}

class PepperoniPizza implements Pizza {
    Pizza pizza;

    public PepperoniPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "pepperoni ";
    }
}

class VegetablesPizza implements Pizza {
    Pizza pizza;

    public VegetablesPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String makePizza() {
        return pizza.makePizza() + "veggie ";
    }
}
