fun main(){
 name("codeHive")
    var f=modulus(65,6)
    println(f)
    var t=parameters("Nyambura",22,2000)
    println(t)

}
fun name(name:String){
    println(name[4].toString()+name[5]+name[6]+name[7])
}
fun modulus(Number1:Int,number2:Int):Int{
    var rem=Number1%number2
    return rem
}
fun parameters(name: String,age:Int,year:Int):String{
    var d="Hi my name is $name and i am $age years old and i was born in $year"
    return d
}
