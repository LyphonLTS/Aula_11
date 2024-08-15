import java.util.ArrayList;

import Controller.Box;
import Controller.Customer;
import Controller.Item;
import Controller.RandomGenerator;

class Main {
  public static void main(String[] args) {
    Customer client = new Customer("Lucas");
    ArrayList<Item> items = genItemList();

    if (client.getLevel().toLowerCase().equals("bronze")) {
      client.setBox(createComponent(items, 3));
      client.setBoxPrice();
    } else if (client.getLevel().toLowerCase().equals("prata")) {
      client.setBox(createComponent(items, 5));
      client.setBoxPrice();
    } else if (client.getLevel().toLowerCase().equals("ouro")) {
      client.setBox(createComponent(items, 7));
      client.setBoxPrice();
    } else {
      client.setBox(createComponent(items, 10));
      client.setBoxPrice();
    }

    System.out.println(client);
  }

  public static ArrayList<Item> genItemList() {
    ArrayList<Item> items = new ArrayList<>();

    items.add(new Item("Quadrinho", 15));
    items.add(new Item("Chaveiro", 5));
    items.add(new Item("Busto", 10));
    items.add(new Item("Adesivo", 1));
    items.add(new Item("Poster", 25));
    items.add(new Item("Camiseta", 25));
    items.add(new Item("Caneta", 3));
    items.add(new Item("Miniatura", 20));

    return items;
  }

  public static Box createComponent(ArrayList<Item> items, int qtdItems) {
    Box box = new Box();

    for (int i = 0; i < qtdItems; i++) {
      box.add(items.get(new RandomGenerator().getRandomValue(0, 7)));
    }

    return box;
  }
}