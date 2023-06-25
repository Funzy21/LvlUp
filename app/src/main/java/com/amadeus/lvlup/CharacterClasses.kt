package com.amadeus.lvlup


// Contains the classes for the game characters and other important entities

class CharacterClasses{

    data class UserData(
        val UserID : Int,
        var Username : String,
        var Email: String,
        var Password: String
    )



    // Gameplay related classes
    abstract class Entity {
        abstract fun getID()
        abstract fun getIDHolder()
    }

    open class Weapon : Entity() {
        var Damage : Int = 0

        override fun getID() {
            println("This object's ID is $")
        }

        override fun getIDHolder() {
            TODO("Not yet implemented")
        }

        open fun Attack(){
            println("Attack!")
        }

        open fun calcDamage(){
            // Return damage calculations here for
        }
        open fun testFun(){

        }

    }

    class Sword : Weapon(){
        override fun Attack(){
            println("Slash!")
        }
    }

    class Spear: Weapon(){

        override fun Attack(){
            println("Pierce!")
        }
    }

    class Character : Entity() {
        override fun getID(){
            print("This object's ID is $")
        }

        override fun getIDHolder() {

        }
    }

}