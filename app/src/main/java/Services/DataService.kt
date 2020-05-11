package Services

import Model.Category
import Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"))




    val hats= listOf (
        Product("Devslopes graphic beanie", "18$", "hat1"),
        Product("Devslopes Hat black","20$","hat2"),
        Product("Devslopes Hat white","19$","hat3"),
        Product("Devslopes Hat snapback","22$","hat3"),
        Product("Devslopes graphic beanie", "18$", "hat1"),
        Product("Devslopes Hat black","20$","hat2"),
        Product("Devslopes Hat white","19$","hat3"),
        Product("Devslopes Hat snapback","22$","hat3"))



    val hoodies= listOf(
        Product("Devslopes hoodie grey","$28","hoodie1"),
        Product("Devslopes hoodie red","$32","hoodie2"),
        Product("Devslopes gray hoodie","$28","hoodie1"),
        Product("Devslopes black grey","$32","hoodie1"),
                Product("Devslopes hoodie grey","$28","hoodie1"),
    Product("Devslopes hoodie red","$32","hoodie2"),
    Product("Devslopes gray hoodie","$28","hoodie1"),
    Product("Devslopes black grey","$32","hoodie1"),
        Product("Devslopes hoodie grey","$28","hoodie1"),
        Product("Devslopes hoodie red","$32","hoodie2"),
        Product("Devslopes gray hoodie","$28","hoodie1"),
        Product("Devslopes black grey","$32","hoodie1"))


    val shirts= listOf(
        Product("Devslopes Shirt black","$18","shirt1"),
        Product("Devslopes badhe light gray","$20","shirt2"),
        Product("Devslopes Logo shirt red","$38","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Devslopes Studios","$18","shirt5"),
        Product("Devslopes Shirt black","$18","shirt1"),
        Product("Devslopes badhe light gray","$20","shirt2"),
        Product("Devslopes Logo shirt red","$38","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Devslopes Studios","$18","shirt5"),
        Product("Devslopes Shirt black","$18","shirt1"),
        Product("Devslopes badhe light gray","$20","shirt2"),
        Product("Devslopes Logo shirt red","$38","shirt3"),
        Product("Devslopes Hustle","$22","shirt4"),
        Product("Devslopes Studios","$18","shirt5"))


    val digitalGood= listOf<Product>()

    fun getProducts(category: String) :List<Product> {
        when (category) {
            "SHIRTS" -> return shirts
            "HATS" -> return hats
            "HOODIES" -> return hoodies
            else -> return digitalGood
        }
    }



}