fun main() {
    createpersonList()
    var grey= listOf("tom","hope","rey","joy")
    println(grey)
    var x = Cars("KYF020F",30)
    var y = Cars("KBM230G",42)
    var z = Cars("KCF343P",70)
    var p =Cars("KFD343V",75)
    var allVehicles= listOf(x,y,z,p)
    println(carList(allVehicles))
    numbers()




}
//1.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
fun name(name:List<String>):List<String>{
    name.forEachIndexed{index,s->
        if(index%2==0){
            println(s)
        }

    }
    return name
}

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height (2 points)

fun numbers(){
    var num= mutableListOf(1.4,60.7,3.5,10.7,32.6)
    println(num.average())
    println(num.sum())
}





//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age (2 points)
data class person(var name:String,var age:Int,var height:Double,var weight:Double)
    fun createpersonList(){
        val person1=person("winnie",21,5.2,6.0)
        val person2=person("miriam",34,5.6,19.2)
        val person3=person("morin",56,6.9,44.1)
        val person4=person("linn",43,16.2,1.4)

        val personList= listOf(person1,person2,person3,person4)
        println(personList)





       }








//4. Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)
fun addpple(topple:List<person>):List<Any>{
    return listOf()
}


//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc (2 points)
data class Cars(var registration:String,var mileage:Int)
fun carList(Car:List<Cars>):Int{
    var avg=0
    Car.forEach{new->new.mileage
        avg+=new.mileage



    }
    val totalAvg=Car.count()
    return totalAvg
}


