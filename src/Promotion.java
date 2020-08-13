public class Promotion extends PromotionRule{
  private String name;
  private String description;
  private String requirement;

  public Promotion(String name, String description, String requirement) {
    this.name = name;
    this.description = description;
    this.requirement = requirement;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getRequirement() {
    return requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }
}
