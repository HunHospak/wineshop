package webshop.project.product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class WineServiceImpl implements WineService {

  private WineRepository wineRepository;

  @Autowired
  public WineServiceImpl(WineRepository wineRepository) {
    this.wineRepository = wineRepository;
  }

  @Override
  public void save(Wine wine) {
    wineRepository.save(wine);
  }

  @Override
  public List<Wine> findAll() {
    return wineRepository.findAll();
  }
}
