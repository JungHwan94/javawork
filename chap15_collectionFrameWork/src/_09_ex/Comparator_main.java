package _09_ex;

import java.util.Comparator;
import java.util.TreeSet;

class Fruit {
    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": " + price + "원";
    }

    static class Descending implements Comparator<Fruit> {
        @Override
        public int compare(Fruit f1, Fruit f2) {
            return Integer.compare(f2.price, f1.price);
        }
    }
}

public class Comparator_main {
    public static void main(String[] args) {
        TreeSet<Fruit> fruitSet = new TreeSet<>(new Fruit.Descending());

        fruitSet.add(new Fruit("사과", 2000));
        fruitSet.add(new Fruit("딸기", 5000));
        fruitSet.add(new Fruit("수박", 20000));

        for (Fruit fruit : fruitSet) {
            System.out.println(fruit);
        }
    }
}
