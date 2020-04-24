public class size extends ProductAttribute {
  private short size;

  public size(String name, short size) {
    super(name);
    this.size = size;
  }

  public short getSize() {
    return size;
  }

  public void setSize(short size) {
    this.size = size;
  }
}
