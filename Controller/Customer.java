package Controller;

public class Customer {
  private Box box;
  private double boxPrice;
  private String name;
  private String level;

  public Customer(String name) {
    this.box = null;
    this.boxPrice = 0;
    this.name = name;
    this.level = genLevel();
  }

  public Box getBox() {
    return this.box;
  }

  public void setBox(Box box) {
    this.box = box;
  }

  public void setBoxPrice() {
    this.boxPrice = box.getPrice();
  }

  public String getLevel() {
    return this.level;
  }

  public void setLevel(String level) {
    this.level = genLevel();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  private static String genLevel() {
    int randomValue = new RandomGenerator().getRandomValue(0, 9);

    if (0 <= randomValue && randomValue <= 3) {
      return "Bronze";
    } else if (4 <= randomValue && randomValue <= 6) {
      return "Prata";
    } else if (7 <= randomValue && randomValue <= 8) {
      return "Ouro";
    } else {
      return "Platina";
    }
  }

  // public String toString(int indentLevel) {
  // String indent = " ".repeat(indentLevel);
  // return String.format(
  // "%s{\n%s \"box\": %s,\n%s \"boxPrice\": %.2f,\n%s \"name\": \"%s\",\n%s
  // \"level\": \"%s\"\n%s}",
  // indent, indent, box.toString(indentLevel + 1), indent, boxPrice, indent,
  // name, indent, level, indent);
  // }

  // @Override
  // public String toString() {
  // return toString(0);
  // }

  @Override
  public String toString() {
    return "Nome: " + this.name + "\nNível: " + this.level + "\nBox: " + this.box + "\nPreço total: " + this.boxPrice;
  }
}
