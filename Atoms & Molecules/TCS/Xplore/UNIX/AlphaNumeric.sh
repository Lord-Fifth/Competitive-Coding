# Write a bash script to find the count of lines having alphanumeric words from a file.

<<COMMENT
    Your script to print the count in the below format:
    Count: <output>

    The file name will be provided as command line arguement when the script containing your command will run.
    You can use shell variables (eg. $0, $1, $2) whichever is applicable for your requirement to provide the command line arguement.

    Note: The alphaumeric word should have at least one alphabet and one digit if the line is to be counted.
COMMENT

count=0
while IFS= read -r line
do
if [[ $line =~ [[:digit:]] ]] ;
then
if [[ $line =~ [a-zA-Z] ]];
then
count=$((count+1))
fi
fi
done <<< $( cat $1 )
echo "Count: $count"

<<INPUT
    Hello this is unix
    My name is XYZ
    Hello15 again
    Bye Hello
    just bye19
    123 456
    hello hi
INPUT

<<OUTPUT
    Count: 2
OUTPUT