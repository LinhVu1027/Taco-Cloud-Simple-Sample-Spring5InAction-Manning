package com.cloud.tacos.data;

import com.cloud.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

//public interface IngredientRepository {
//
//    Iterable<Ingredient> findAll();
//
//    Ingredient findOne(String id);
//
//    Ingredient save(Ingredient ingredient);
//
//}

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
