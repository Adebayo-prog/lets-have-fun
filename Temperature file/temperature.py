count = 0

while count < 5:

	celsius = float(input("Enter temperature in celsius: "))
	
	if celsius < -273:
	   print("Invalid temperature, it's impossible")
	   
	else:
	
	   fahrenheit = (celsius * 9/5) + 32
	   
	   print ("celsius: ", celsius, "C")
	   print ("fahrenheit: ", fahrenheit, "F")
	   
	   count +=1
	print("Temperaature converted.")
