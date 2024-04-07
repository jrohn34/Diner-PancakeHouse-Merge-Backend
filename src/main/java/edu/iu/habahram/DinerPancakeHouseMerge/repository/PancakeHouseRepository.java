// PancakeHouseRepository.java
package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

@Repository
public class PancakeHouseRepository {
    public Menu getTheMenu() {
        return new PancakeHouseMenu();
    }
}
