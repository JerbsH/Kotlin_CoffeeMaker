//name: Jere Hippeläinen
//student number: 2113583


class CoffeeMaker(var coffeeCapacity: Int = 50, var waterCapacity: Int = 150) {
	var coffeeAmount: Int = 0
		private set
	var waterAmount: Int = 0
		private set
	var isOn: Boolean = false
	
	override fun toString(): String{
		var status = "off"
		if(isOn == true) status = "on"
		return "Coffeemaker is ${status} with ${coffeeAmount} coffee and ${waterAmount} water."
	}

	private fun makeCoffee(coffee: Int, water: Int){
		if(isOn == true){
			val useCoff: Int = coffee
			val useWatr: Int = water
			if (coffeeAmount - useCoff < 0 || waterAmount - useWatr < 0){
				println("Not enough ingredients") 
				return
			} 
			coffeeAmount -= useCoff
			waterAmount -= useWatr
			println("Made coffee with ${useCoff} - ${useWatr}")
		} else return
	}
	
	fun makeDoubleEspresso(){ // uses 16 coffee 30 water
		makeCoffee(16,30)
	}

	fun makeRegular(){ // uses 10 coffee 120 water
		makeCoffee(10,120)
	}

	fun fillAll(){
		coffeeAmount = coffeeCapacity
		waterAmount = waterCapacity
	}
}

fun main(args: Array<String>) {
	val cm = CoffeeMaker()
    println(cm)
    cm.makeRegular()
    println(cm)
    cm.isOn = true
    println(cm)
    cm.makeRegular()
    println(cm)
    cm.fillAll()
    println(cm)
    cm.makeRegular()
    println(cm)
    cm.makeDoubleEspresso()
    println(cm)
    cm.makeDoubleEspresso()
    println(cm)
}