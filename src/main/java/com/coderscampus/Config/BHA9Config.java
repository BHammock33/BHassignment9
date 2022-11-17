package com.coderscampus.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coderscampus.Domain.Recipe;

@Configuration
public class BHA9Config {

	@Bean
	public Recipe recipe() {
//		Recipe recipe = new Recipe();
//		recipe.getCookingMinutes();
//		recipe.getDairyFree();
//		recipe.getGlutenFree();
//		recipe.getInstructions();
//		recipe.getPreperationMinutes();
//		recipe.getPricePerServing();
//		recipe.getReadyInMinutes();
//		recipe.getServings();
//		recipe.getSpoonacularScore();
//		recipe.getTitle();
//		recipe.getVegan();
//		recipe.getVegetarian();
		return new Recipe();
	}
}
