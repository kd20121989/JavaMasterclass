package com.company;

class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("Rye bread", meat, price);
        setName("Healthy Burger");
    }

    @Override
    public boolean checkAdditions() {
        if (6<countAdditions()) {
            System.out.println("No more than 6 additions allowed");
            return false;
        }
        return true;
    }
}

class DeluxeBurger extends Hamburger {
    private Addition chips = new Chips();
    private Addition cola = new Cola();

    public DeluxeBurger(String bread, String meat, double price) {
        super(bread, meat, price);
        setName("Deluxe Burger");
        chips.add();
        cola.add();
    }

    @Override
    public double getCheck() {
        double total = super.getPrice()+chips.getPrice()+cola.getPrice();
        System.out.println(super.getName()+" with "+super.getMeat()+" on "+ "bread: " +super.getPrice()+"$");
        System.out.println(chips.getName()+" : "+chips.getPrice()+"$");
        System.out.println(cola.getName()+" : "+cola.getPrice()+"$");
        System.out.println("_________________");
        System.out.println("Total sum is: "+total+"$");
        return total;
    }
}

public class Hamburger {
    Addition bacon = new Bacon();
    Addition cheese = new Cheese();
    Addition cucumber = new Cucumber();
    Addition egg = new Egg();
    Addition lettuce = new Lettuce();
    Addition olives = new Olives();
    Addition onion = new Onion();
    Addition pickles = new Pickles();
    Addition tomato = new Tomato();

    private String name, bread, meat;
    private double price;
    private int additions;

    public Hamburger(String bread, String meat, double price) {
        if (price < 0) {
            System.out.println("Price can't be lower than 0");
        } else {
            this.name = "Hamburger";
            this.bread = bread;
            this.meat = meat;
            this.price = price;
        }
    }

    public double getCheck() {
        if (!checkAdditions()) {
            return -1;
        }
        double total = price;
        System.out.println(name+" with "+meat+" on "+ "bread: " +price+"$");
        if (bacon.isAdded()) {
            System.out.println(bacon.getName()+" : "+bacon.getPrice()+"$");
            total+=bacon.getPrice();
        }
        if (cheese.isAdded()) {
            System.out.println(cheese.getName()+" : "+cheese.getPrice()+"$");
            total+=cheese.getPrice();
        }
        if (cucumber.isAdded()) {
            System.out.println(cucumber.getName()+" : "+cucumber.getPrice()+"$");
            total+=cucumber.getPrice();
        }
        if (egg.isAdded()) {
            System.out.println(egg.getName()+" : "+egg.getPrice()+"$");
            total+=egg.getPrice();
        }
        if (lettuce.isAdded()) {
            System.out.println(lettuce.getName()+" : "+lettuce.getPrice()+"$");
            total+=lettuce.getPrice();
        }
        if (olives.isAdded()) {
            System.out.println(olives.getName()+" : "+olives.getPrice()+"$");
            total+=olives.getPrice();
        }
        if (onion.isAdded()) {
            System.out.println(onion.getName()+" : "+onion.getPrice()+"$");
            total+=onion.getPrice();
        }
        if (pickles.isAdded()) {
            System.out.println(pickles.getName()+" : "+pickles.getPrice()+"$");
            total+=pickles.getPrice();
        }
        if (tomato.isAdded()) {
            System.out.println(tomato.getName()+" : "+tomato.getPrice()+"$");
            total+=tomato.getPrice();
        }
        System.out.println("_________________");
        System.out.println("Total sum is: "+total+"$");
        return total;
    }

    public boolean checkAdditions() {
        if (4<countAdditions()) {
            System.out.println("No more than 4 additions allowed");
            return false;
        }
        return true;
    }

    public int countAdditions() {
        int additions=0;
        if (bacon.isAdded())
            additions++;
        if (cheese.isAdded())
            additions++;
        if (cucumber.isAdded())
            additions++;
        if (egg.isAdded())
            additions++;
        if (lettuce.isAdded())
            additions++;
        if (olives.isAdded())
            additions++;
        if (onion.isAdded())
            additions++;
        if (pickles.isAdded())
            additions++;
        if (tomato.isAdded())
            additions++;
        this.additions=additions;
        return this.additions;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
