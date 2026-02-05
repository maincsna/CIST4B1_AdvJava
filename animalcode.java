public class animalcode{
    public static void main(String[] args) {
        Panda p1 = new Panda("shaolin", "tenacious d", "jack", 16);
        Shark s1 = new Shark("Mako", 100, "Mako", 10);
        Shark s2 = new Shark("Great White", 200, "Jeff", 22);
        Animal [] zoo = {p1, s1, s2};

        double x = 100.5;
        int xDec = (int) x;

        for (Animal animal: zoo){
            if (animal instanceof Panda){
                Panda p = (Panda) animal;
                System.out.println("Welcome to the panda exibit, please enjoy!");
                p.noise();
                p.eat();
            }
            else if (animal instanceof Shark){
                Shark s = (Shark) animal;
                System.out.println("Welcome to the shark tank, please enjoy!");
                s.noise();
                System.out.print("The shark teeth grow from "+s.numTeeth+" + ");
                s.growTeeth();
                System.out.println(s.numTeeth);
            }
        }
    }
}

class Animal{
    public String name;
    public int age;

    public Animal(){
        this.name = "";
        this.age = 0;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void noise(){
        System.out.println("Generic Animal");
    }
}

class Panda extends Animal{
    public String kungfuStyle;
    public String band;

    public Panda(String kungfuStyle, String band, String name, int age){
        super(name,age);
        this.kungfuStyle = kungfuStyle;
        this.band = band;
    }

   @Override
   public void noise(){
    System.out.println("Roar");
   }

   public void eat(){
    System.out.println("Panda munches on bamboo");
   }
}

class Shark extends Animal{
    public String breed;
    public int numTeeth;

    public Shark(String breed, int numTeeth, String name, int age){
        super(name, age);
        this.breed = breed;
        this.numTeeth = numTeeth;
    }

    @Override
    public void noise(){
        System.out.println("Blub blub ...");
    }

    public void growTeeth(){
        this.numTeeth +=10;
    }
}