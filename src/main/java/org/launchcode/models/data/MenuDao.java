package org.launchcode.models.data;

import org.launchcode.models.Menu;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Entity;

@Entity
public interface MenuDao extends CrudRepository<Menu, Integer> {
}
