fun main(){

 var y= product(arrayOf(6,2,3))
    println(y)
    var x = mixedTypes(arrayOf(1,1.3,"Home","Annaniah",3.5))
    println(x)
    var z = vowelsCount(arrayOf('a','h','i','e'))
    println(z)
}
fun product(resul: Array<Int>):Int {
var result = 1
    resul.forEach { b->
        result*=b

    }
println()
    return result
}
fun mixedTypes(types:Array<Any>): Double {
    var s = 0.0
    types.forEach { b->
        if (b is Double||b is Float)
        s+=b.toString().toDouble()

    }
return s
}
fun vowelsCount(arrys:Array<Char>):Int{
    var j = 0
arrys.forEach { k->
    if (k=='a'||k =='e'||k=='i'||k=='0'||k=='u')
        j++
}
    return  j
}
