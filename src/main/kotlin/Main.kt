fun main(args: Array<String>) {

    // 2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.

  var par: Int = 0
  var impar: impar = 0

  for( i in 1..10){
      print("Insira o $iº número: ")
      var num = readLine()!!.toDouble()

      if(num % 2.0 == 0){
          par++

      }else if(num % 1 == 1.0){
          impar++
      }
  }
    print("Há um total de $par número pares e $impar números ímpares. ")
}
