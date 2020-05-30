# Write the Unix command to print the longest line from a file.

<<COMMENT
    The file name will be provided as command line arguement when the script containing your command will run.
    You can use shell variables (eg. $0, $1, $2) whichever is applicable for your requirement to provide the command line arguement.
COMMENT

cat $1 | awk 'length > max_length { max_length = length; longest_line = $0 } END { print longest_line }' 

<<INPUT
    We are using this file to test some commands.
    This is a new file.
    File has details of Unix commands.
    File is created as a Temporary file.
INPUT

<<OUTPUT
    We are using this file to test some commands.
OUTPUT