package Controller;

public class Item extends Component {
  private String name;
  private double price;

  public Item(String name, double price) {
    super();
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // public String toString(int indentLevel) {
  // String indent = " ".repeat(indentLevel);
  // return String.format(
  // "%s{\n%s \"Nome\": \"%s\",\n%s \"Preço\": %.2f\n%s}",
  // indent, indent, name, indent, price, indent);
  // }

  // @Override
  // public String toString() {
  // return toString(0);
  // }

  @Override
  public String toString() {
    return "Nome: " + this.name + "\nPreço: " + this.price;
  }
}
