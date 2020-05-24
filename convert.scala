//1. The temperature is 35C; convert this tempe
//ºF =ºC * 1.8000 + 32.00

object convert{
def main(args:Array[String]){
cell_vel(35);
}
def cell_vel(a:Float){
var faren_val:Float=a* 1.8000f + 32.00f;
println("Farenheit value= "+faren_val);
}

}