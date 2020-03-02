package webshop.project.product;

import java.util.List;

public interface WineService {

  void save(Wine wine);

  List<Wine> findAll();

}
