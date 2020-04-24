public class Image extends ProductAttribute {
  String link;

  public Image(String name, String link) {
    super(name);
    this.link = link;
  }

  public void setLink(String newLink){
    this.link = newLink;
  }

  public String getLink(){
    return link;
  }

}
