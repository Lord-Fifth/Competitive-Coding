# Write a unix command to find the name of the Student who has the highest score.

<<COMMENT
    Student details are stored in a file in the following order with space as the delimiter:
    RollNo Name Score    

    The file will be given as a command line arguement when the script containing your command will run.    
COMMENT

cat $1 | sort -k3,3 -rn -t" " | head -n1 | awk '{print $2}'

<<INPUT
    RollNo Name Score
    234 ABC 70
    567 QWE 12
    457 RTE 56
    234 XYZ 80
    456 ERT 45
INPUT

<<OUTPUT
    XYZ
OUTPUT