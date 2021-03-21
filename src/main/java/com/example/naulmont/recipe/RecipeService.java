package com.example.naulmont.recipe;

import com.example.naulmont.recipe.mapper.RecipeMapper;
import com.example.naulmont.recipe.mapper.RecipeWithoutDescriptionDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecipeService {

    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper;

    public List<RecipeWithoutDescriptionDto> getRecipes() {
        List<RecipeWithoutDescriptionDto> collect = recipeRepository.findAll()
                .stream().map(recipeMapper::toRecipeWithoutDescriptionDto).collect(Collectors.toList());
        log.info("Size of recipe list = " + collect.size());
        return collect;
    }

    public List<Recipe> getRecipesSortedByDescription() {
       return recipeRepository
               .findAll()
               .stream()
               .sorted( Comparator.comparing(Recipe::getDescription))
               .collect(Collectors.toList());
    }

    public List<Recipe> getRecipesSortedByPriority() {
        return recipeRepository
                .findAll()
                .stream()
                .sorted(Comparator.comparing(Recipe::getPriority))
                .collect(Collectors.toList());
    }

    public List<Recipe> getRecipesSortedByPatient() {
        return recipeRepository
                .findAll()
                .stream()
                .sorted(Comparator.comparing(Recipe::getPatientId))
                .collect(Collectors.toList());
    }

    public void createRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
    }

    public void deleteRecipe(Recipe recipe) {
        recipeRepository.delete(recipe);
    }

    public List<Recipe> getFilteredRecipes(String description, String priority, int patientId) {  //TODO не работает
        return recipeRepository.getFilteredRecipes(description, priority, patientId);
    }
}
