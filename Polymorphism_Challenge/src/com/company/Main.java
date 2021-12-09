package com.company;

class Car {
    private String name;
    private boolean engine,started;
    private int cylinders,wheels,doors;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 4;
        this.started = false;
    }

    public String startEngine() {
        if (isEngine()) {
            started = true;
            return("Engine is started");
        } else {
            return("No engine to start");
        }
    }

    public String accelerate() {
        if (isStarted()) {
            return("Need for speed");
        } else {
            return("Start the Engine first");
        }
    }

    public String brake() {
        if (started) {
            return("Stopping the Car");
        } else {
            return("Dude we are not moving already!");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }
}

class Porshe extends Car {
    public Porshe() {
        super("Porshe", 8);
    }

    @Override
    public String startEngine() {
        if (isEngine()) {
            setStarted(true);
            return("WRRRRRRRR");
        } else return super.startEngine();
    }

    @Override
    public String accelerate() {
        if (isStarted()){
            return("Here some nitro!!!");
        } else return super.accelerate();
    }

    @Override
    public String brake() {
        if (isStarted()) {
            return("BWWWUUEEE");
        } else return super.brake();
    }
}

class MonsterTruck extends Car {
    public MonsterTruck() {
        super("MonsterTruck", 16);
    }

    @Override
    public String startEngine() {
        if (isEngine()) {
            setStarted(true);
            return("ROAR!!!!");
        } else return super.startEngine();
    }

    @Override
    public String accelerate() {
        if (isStarted()){
            return("WAAAAGH!!!");
        } else return super.accelerate();
    }

    @Override
    public String brake() {
        if (isStarted()) {
            return("There is no way to stop this MONSTER!");
        } else return super.brake();
    }
}

class TheYugo extends Car {
    public TheYugo() {
        super("The Yugo", 4);
    }

    @Override
    public String startEngine() {
        if (isEngine()) {
            int randomNumber = (int) (Math.random()*2)+1;
            boolean areYouLuckyToday = false;
            switch (randomNumber) {
                case 1:
                    areYouLuckyToday = true;;
                    setStarted(true);
                    break;
                case 2:
                    break;
            }
            if (areYouLuckyToday) {
                return ("Lucky! "+super.startEngine());
            } else {
                return("Not your day huh? Please try again!");
            }
        } else return super.startEngine();
    }

    @Override
    public String accelerate() {
        if (isStarted()){
            return("My Grandmother is walking faster than this damned bucket!");
        } else return super.accelerate();
    }

    @Override
    public String brake() {
        if (isStarted()) {
            return("Is there some difference?");
        } else return super.brake();
    }
}

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<10; i++) {
            Car car = randomCar();
            System.out.println("Today is a "+i+" day of a race and your car will be: "+car.getName()+
                    "\n"+"Engines to start! "+"\n"+car.startEngine()+"\n"+"3 2 1 Pedal to the floor! "
                    +"\n"+car.accelerate()+"\n"+"You can stop now, day is finished"+"\n"+car.brake()+
                    "\n__________________________________");
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random()*3)+1;
        System.out.println("Random number generated was: "+randomNumber);
        switch (randomNumber) {
            case 1:
                return new Porshe();
            case 2:
                return new MonsterTruck();
            case 3:
                return new TheYugo();
        }
        return null;
    }
}
