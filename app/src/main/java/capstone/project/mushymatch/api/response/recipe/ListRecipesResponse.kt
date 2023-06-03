package capstone.project.mushymatch.api.response.recipe

import com.google.gson.annotations.SerializedName

data class ListRecipesResponse(

	@field:SerializedName("ListRecipesResponse")
	val listRecipesResponse: List<ListRecipesResponseItem>
)

data class ListRecipesResponseItem(

	@field:SerializedName("pict_recipe")
	val pictRecipe: String,

	@field:SerializedName("name_recipe")
	val nameRecipe: String,

	@field:SerializedName("id_recipe")
	val idRecipe: Int
)
