# Write a unix command to count the occurence of the word "Unix" in a given file.

<<COMMENT
    The file will be provided as command line arguement when the script containing your command will run.

    Note: The search for "Unix" should be case-insensitive.
COMMENT

cat $1 | grep -io "Unix" | wc -l

<<INPUT
    Unix is an multi-user,multi-tasking system.
    It is a command based operating system.
    We will learn unix architecture and the unix commands in this module.
INPUT

<<OUTPUT
    3
OUTPUT