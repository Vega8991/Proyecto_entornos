public class Tamagotchi {
    private int hunger = 4;
    private int energy = 4;
    private int mood = 4;

    public String play() {
        hunger = hunger + 1;
        mood = mood + 1;
        energy = energy - 1;
        return estado();
    }

    public String eat() {
        hunger = hunger - 2;
        if (hunger < 0) {
            hunger = 0;
        }
        energy = energy - 1;
        return estado();
    }

    public String sleep() {
        energy = energy + 2;
        return "(-_-) zZZ";
    }

    private String estado() {
        if (energy <= 0) {
            return "(-_-) zZZ";
        } else if (mood > 8) {
            return ":-)";
        } else if (energy < 3) {
            return "(-_-)";
        } else if (mood < 2) {
            return "ఠ_ఠ";
        } else {
            return ":-|";
        }
    }
    public static void main(String[] args) {
        Tamagotchi tamagotchi = new Tamagotchi();

        tamagotchi.play();
        tamagotchi.sleep();
        tamagotchi.eat();
        tamagotchi.estado();
    }
}

