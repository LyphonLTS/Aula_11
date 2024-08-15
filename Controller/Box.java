package Controller;

import java.util.ArrayList;

public class Box extends Component {
  private ArrayList<Component> children;

  public Box() {
    super();
    this.children = new ArrayList<>();
  }

  @Override
  public void add(Component item) {
    this.children.add(item);
  }

  @Override
  public void remove(Component item) {
    this.children.remove(item);
  }

  @Override
  public double getPrice() {
    double sum = 0;

    for (int i = 0; i < this.children.size(); i++) {
      sum += this.children.get(i).getPrice();
    }

    return sum;
  }

  // public String toString(int indentLevel) {
  // String indent = " ".repeat(indentLevel);
  // StringBuilder sb = new StringBuilder();
  // sb.append(indent).append("[\n");
  // for (int i = 0; i < children.size(); i++) {
  // sb.append(children.get(i).toString(indentLevel + 1));
  // if (i < children.size() - 1) {
  // sb.append(",\n");
  // } else {
  // sb.append("\n");
  // }
  // }
  // sb.append(indent).append("]");
  // return String.format("{\n%s \"children\": %s\n%s}", indent, sb.toString(),
  // indent);
  // }

  // @Override
  // public String toString() {
  // return toString(0);
  // }

  @Override
  public String toString() {
    String text = "";

    for (int i = 0; i < this.children.size(); i++) {
      text += "\n{ " + this.children.get(i) + " },";
    }

    return text;
  }
}
