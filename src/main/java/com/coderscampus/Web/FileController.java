package com.coderscampus.Web;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Domain.Recipe;
import com.coderscampus.Service.FileService;

@RestController
public class FileController {

	@Autowired
	private FileService fileService;
	
	@GetMapping("/gluten-free")
	public List<Recipe> glutenFree() throws IOException{
		List<Recipe> glutenFree = fileService.getRecipies("recipes.txt").stream().filter(x -> x.getGlutenFree()).collect(Collectors.toList());
		return glutenFree;
	}
	@GetMapping("/vegan")
	public List<Recipe> Vegan() throws IOException{
		List<Recipe> vegan = fileService.getRecipies("recipes.txt").stream().filter(x -> x.getVegan()).collect(Collectors.toList());
		return vegan;
	}
	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> veganAndGlutenFree() throws IOException{
		List<Recipe> vAndGFree = fileService.getRecipies("recipes.txt").stream().filter(x -> x.getGlutenFree()).filter(y->y.getVegan()).collect(Collectors.toList());
		return vAndGFree;
	}
	@GetMapping("/vegetarian")
	public List<Recipe> vegetarian() throws IOException{
		List<Recipe> vegetarian = fileService.getRecipies("recipes.txt").stream().filter(x -> x.getVegetarian()).collect(Collectors.toList());
		return vegetarian;
	}
	@GetMapping("/all-recipes")
	public List<Recipe> allRecipes() throws IOException{
		List<Recipe> recipiesList = fileService.getRecipies("recipes.txt");
		return recipiesList;
	}
}
