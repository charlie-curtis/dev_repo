counter="1"
while [ $counter -lt 11 ] 
do
	echo "Line $counter">>file.txt
	counter=$[$counter+1]
done
