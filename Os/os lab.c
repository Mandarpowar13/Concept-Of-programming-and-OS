
#include<stdio.h>
#include<sys/wait.h>
#include<stdlib.h>
#include<unistd.h>
void main(){

        pid_t id;
        id = fork();
        int len= 25;
        int bred=20;
        int area= len*bred ;
        if(id<0){
        printf("Child started calulating \n");
        sleep(5);
        area= len*bred;
        printf("Child calulated area!");
        exit(0);

        }
        else{

        printf("parrent started excecuting \n");
        printf("waiting for child to caculate the area! \n");
        wait(NULL);
        printf("area of rectangle is: %d",area);
        }

}