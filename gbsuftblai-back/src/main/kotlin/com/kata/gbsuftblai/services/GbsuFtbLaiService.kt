package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component

@Component
class GbsuFtbLaiService {
    //function qui permet de convertir un number to list of digits
    fun numberToArray(number :Int) :ArrayList<Int>{
    var numberToTest=number;
    val list = arrayListOf<Int>()
    while (numberToTest != 0) {
        list.add(numberToTest % 10);
         numberToTest=numberToTest /10;
        
    }
    list.reverse();
    return list;
}

    fun convertNumber(inputNumber: Int): String {
    var result =  String();
	if (inputNumber %3 ==0 )
	 {
		result+="Gbsu";
	 }
	 if (inputNumber %5 ==0 )
	 {
		 result+="Ftb";
	 }
	for (d in numberToArray(inputNumber)) {	
			if (d ==3) {
				result+="Gbsu";
			}
			
			if (d ==5){
				result+="Ftb";
			}
			if (d == 7) {
				result+="Lai";
			}

	}
	if (result.isEmpty())
	{
		result=inputNumber.toString();
	}
	return result;

	}


}
