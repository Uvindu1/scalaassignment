
object volumes{
 def main(args:Array[String]){
volume(5);

}

def volume(radius:Double){
//var pi:Float=3.14f;
var volume_sphere:Double=4/3*math.Pi* radius*radius*radius;
println("volume of sphere= "+volume_sphere);
}
}