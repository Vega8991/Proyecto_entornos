# Depuración de FizzBuzz y Tamagotchi

Este proyecto tiene dos archivos en Java: un archivo donde contiene un programa que imprime FizzBuzz por pantalla, y otro con la creación de un tamagotchi simple.

---

## Capturas de Pantalla

### FizzBuzz: Depuración

![Captura de pantalla 2024-12-10 184349](https://github.com/user-attachments/assets/d7283c07-d89a-486e-8dc5-6a6326fc49d9)
![Captura de pantalla 2024-12-10 184402](https://github.com/user-attachments/assets/334b6e5f-5e01-44c4-adbd-584af9694861)

---

### Tamagotchi: Depuración

![Captura de pantalla 2024-12-11 194913](https://github.com/user-attachments/assets/3fc49952-122f-4afb-9a8b-eb52fda549f2)
![Captura de pantalla 2024-12-11 194847](https://github.com/user-attachments/assets/5851220d-6ef0-4f9c-9c79-3ba8915be6d8)

---

Código de FizzBuzz y Tamagotchi:

```java
public class FizzBuzz {
    public static void main(String[] args) {
        int numero = 1;
        while (numero <= 100) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (numero % 3 == 0) {
                System.out.println("Fizz");
            } else if (numero % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
```
```java
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
```
