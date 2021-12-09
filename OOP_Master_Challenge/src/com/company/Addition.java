package com.company;

class Tomato extends Addition {
    public Tomato() {
        super("Tomato", 0.25);
    }
}

class Onion extends Addition {
    public Onion() {
        super("Onion", 0.2);
    }
}

class Pickles extends Addition {
    public Pickles() {
        super("Pickles", 0.1);
    }
}

class Bacon extends Addition {
    public Bacon() {
        super("Bacon", 0.4);
    }
}

class Lettuce extends Addition {
    public Lettuce() {
        super("Lettuce", 0.15);
    }
}

class Olives extends Addition {
    public Olives() {
        super("Olives", 0.30);
    }
}

class Cheese extends Addition {
    public Cheese() {
        super("Cheese", 0.35);
    }
}

class Cucumber extends Addition {
    public Cucumber() {
        super("Cucumber", 0.15);
    }
}

class Egg extends Addition {
    public Egg() {
        super("Egg", 0.2);
    }
}

class Chips extends Addition {
    public Chips() {
        super("Chips", 0.5);
    }
}

class Cola extends Addition {
    public Cola() {
        super("Cola", 0.8);
    }
}



public class Addition {
    private String name;
    private double price;
    private boolean added;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAdded() {
        return added;
    }

    public void add() {
        this.added = true;
    }

    public void remove() {
        this.added = false;
    }

}
