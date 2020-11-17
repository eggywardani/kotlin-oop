package app

import annotations.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import exception.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties

fun main() {

    val request = CreateProductRequest("1", "indomie",30000)

    validateRequest(request)
}

fun validateRequest(request: Any){
    val kelas = request::class
    val properties = kelas.memberProperties

    // iterate satu2, lalu cek kalo ada annotation @NotBlank

    for (property in properties){
        if (property.findAnnotation<NotBlank>() != null){
                val value:String = property.call(request) as String
                when(value){
                    is String -> throw ValidationException("${property.name} is Blanl")

                }

        }
    }

}

