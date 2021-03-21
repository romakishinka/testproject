package com.example.naulmont.recipe.mapper;

import com.example.naulmont.recipe.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RecipeMapper {

    RecipeDto toRecipeDto(Recipe recipe);

    RecipeWithoutDescriptionDto toRecipeWithoutDescriptionDto(Recipe recipe);

}
