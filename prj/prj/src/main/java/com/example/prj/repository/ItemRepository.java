package com.example.prj.repository;

import com.example.prj.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends CrudRepository<Item,Long> {
    List<Item> findAll();

    Optional<Item> findById(Long id);

    void deleteById(Long id);
}
