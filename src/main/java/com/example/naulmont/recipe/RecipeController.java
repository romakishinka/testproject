package com.example.naulmont.recipe;

import com.example.naulmont.recipe.mapper.RecipeWithoutDescriptionDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recipe")
@AllArgsConstructor
public class RecipeController {


    private final RecipeService recipeService;

    @GetMapping("/all")
    public ResponseEntity<List<RecipeWithoutDescriptionDto>> getRecipes() {
        return ResponseEntity.ok(recipeService.getRecipes());
    }

    @GetMapping("/all/description")
    public ResponseEntity<List<Recipe>> getRecipesSortedByDescription() {
        return ResponseEntity.ok(recipeService.getRecipesSortedByDescription());
    }

    @GetMapping("/all/priority")
    public ResponseEntity<List<Recipe>> getRecipesSortedByPriority() {
        return ResponseEntity.ok(recipeService.getRecipesSortedByPriority());
    }

    @GetMapping("/all/patient")
    public ResponseEntity<List<Recipe>> getRecipesSortedByPatient() {
        return ResponseEntity.ok(recipeService.getRecipesSortedByPatient());
    }

    @PostMapping("/create")
    public void createRecipe(@RequestBody Recipe recipe) {
        recipeService.createRecipe(recipe);
    }

    @DeleteMapping("/delete")
    public void deleteRecipe(@RequestBody Recipe recipe) {
        recipeService.deleteRecipe(recipe);
    }

    @GetMapping("/all/filter")
    public ResponseEntity<List<Recipe>> getFilteredRecipes(@RequestParam(name = "description", required = false) String description,
                                                           @RequestParam(name = "priority", required = false) String priority,
                                                           @RequestParam(name = "patient_id", required = false, defaultValue = "0") Integer patientId) {
        return ResponseEntity.ok(recipeService.getFilteredRecipes(description, priority, patientId));
    }
}
