fun main(){
    placename()
    println(details("Joyhermosa",22))
    source("")
    nameCheck("Joy")



}
fun placename(){
    var place = "akirachix"
    println(place[0])
    println(place[2])
    println(place[3])
}
fun details(name:String,age :Int):String{
    var details = "Hi, my name is $name and I am $age years old"
    return details
}

fun source(name: String):Int{
    var word = "river"
    return word.length
}
fun nameCheck(name: String){
    if (name=="Williams"){
        println("Thats me!")}
    else{
        println("I don`t know who that is")}
    }

