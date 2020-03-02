package webshop.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MyUser {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private String email;
  private String password;
  private long balance;
}
