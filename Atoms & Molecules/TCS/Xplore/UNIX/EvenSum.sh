# Write a shell script to find the sum of all even numbers from a list of given numbers.
# The script should first of all take the count of numbers to be added as user input followed by the numbers one by one.

<<COMMENT
    The output should print the following:
    Total = <Sum>    

    Console input:
    The first line contains the count of numbers to be added.
    The second line contains the 1st number to be added.
    The third line contains the 2nd number to be added and so on.
COMMENT

read c
sum=0
i=1
while [ $i -le $c ]
do
read num
if [ $((num%2)) -eq 0 ]
then 
sum=$((sum+num))
fi
i=$((i+1))
done
echo "Total = "$sum

<<INPUT
    3
    10
    20
    30
INPUT

<<OUTPUT
    Total = 60
OUTPUT