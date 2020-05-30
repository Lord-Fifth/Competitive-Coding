# Write a shell script to find the count of employees whose salary is less than the average salary of all employees.

<<COMMENT
    Employee details are stored in a file in the following format:
    EmpId;EmpName;Salary

    The file will the employee details will be given as a command line arguement when your script will run.    
COMMENT

awk -F';' 'NR>1{e[$1]=$3;s+=$3}
      END{avg=s/(NR-1);for(x in e)if(e[x]<avg)c++;print c}' $1

# ALTERNATE
# read c
# lim=10
# max=0
# salary=0
# n=0
# for i in $(seq $lim)
# do 
# read line
# num=$(echo "$line"|cut -d ";" -f3)
# if [ $num > 0 ];
# then 
# salary=$((salary+num))
# arr[n]=$num
# n=$((n+1))
# fi
# done;
# avg=$((salary/n))
# count=0
# for val in ${arr[@]}
# do 
# if [ $val -lt $avg ];
# then 
# count=$((count+1))
# fi
# done;
# echo "$count"

<<INPUT
    EmpId;EmpName;Salary
    100;A;30000
    102;B;45000
    103;C;15000
    104;D;40000
INPUT

<<OUTPUT
    2
OUTPUT