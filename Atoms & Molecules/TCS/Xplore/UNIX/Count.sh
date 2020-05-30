# Write a unix command to count the count the number of words in the first 3 lines of a file.

<<COMMENT
    The file will be provided as command line arguement when the script containing your command will run.

    Note: The search for "Unix" should be case-insensitive.
COMMENT

cat $1 | head -n3 | wc -w

<<INPUT
    Unix ia a command based operating system.
    We will learn unix in this module.
    This is a test file.
    We are using this file to practice some commands.
    We have reached the end of the file.
INPUT

<<OUTPUT
    19
OUTPUT