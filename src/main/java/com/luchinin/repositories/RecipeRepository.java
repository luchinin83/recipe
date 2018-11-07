package com.luchinin.repositories;

import com.luchinin.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Gluk on 07.11.2018.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
