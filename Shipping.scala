
object Shipping{
def main(args:Array[String]){


var total:Double=bookprice(60)-discount(bookprice(60))+shippingCost(60);
println("The total wholesale cost for 60 books: "+total);



}
def bookprice(x:Int):Double={
x*24.95;
}
def discount(amount:Double):Double={
amount*0.4;
}
def shippingCost(x:Int):Double={
3*x+(x-50)*0.75;
}

}