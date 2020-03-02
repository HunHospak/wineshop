package webshop.project.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wine {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  protected Integer id;
  protected String type;
  protected int price;
  protected String name;
  protected String description;
  protected String alcoholPercent;

  public Wine() {
  }

  public Wine(String type, int price, String name, String description,
      String alcoholPercent) {
    this.type = type;
    this.price = price;
    this.name = name;
    this.description = description;
    this.alcoholPercent = alcoholPercent;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
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

  public String getAlcoholPercent() {
    return alcoholPercent;
  }

  public void setAlcoholPercent(String alcoholPercent) {
    this.alcoholPercent = alcoholPercent;
  }
}
