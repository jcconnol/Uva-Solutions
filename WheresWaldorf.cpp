/* 
 * File:   main.cpp
 * Author: John Connolly
 *
 * Created on January 31, 2018, 5:59 PM
 */

#include <cstdlib>
#include <iostream>
#include <ios>
#include <cstdio>
#include <stdio.h>
#include <string>

using namespace std;

int main(int argc, char *argv[]) {
    //find starting letter
    //search all around it and if second letter is equal
    //go in that direction until end of string. if not equal stop and keep looking

    int runs;
    scanf("%d", &runs);
    
    char blank[51];
    scanf("%[^\n]", &blank);

    for(int i = 0; i < runs; i++){
        
        int x, y;
        scanf("%d%d", &y, &x);
        char board[y][x];
                
        //read in board and put into array
        for(int j = 0; j < y; j++){
            scanf("%s", board[j]);
        }
        
        for(int j = 0; j < y; j++)
            for(int k = 0; k < x; k++)
                board[j][k] = toupper(board[j][k]);
        
        int find_num;
        scanf("%d", &find_num);
                
        for(int j = 0; j < find_num; j++){
            char name[51];
            scanf("%s", name);
            int v;
            for(int v = 0; name[v] != '\0'; v++)
                name[v] = toupper(name[v]);
                        
            int x_and_y[2];
            bool correct = false;
            for(int p = 0; p < y && !correct; p++){
                for(int m = 0; m < x && !correct; m++){
                    if(board[p][m] == name[0]){
                        
                        //up and left
                        for(int n = 0; p-n >= 0 && m-n >= 0 && !correct && name[n] == board[p-n][m-n];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //up
                        for(int n = 0; p-n >= 0 && !correct && name[n] == board[p-n][m];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //up and right
                        for(int n = 0; p-n >= 0 && m+n < x && !correct && name[n] == board[p-n][m+n];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //left
                        for(int n = 0; m-n >= 0 && !correct && name[n] == board[p][m-n];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //right
                        for(int n = 0; m+n < x && !correct && name[n] == board[p][m+n];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //down and left
                        for(int n = 0; m-n >= 0 && p+n < y && !correct && name[n] == board[p+n][m-n];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //down
                        for(int n = 0; p+n < y && !correct && name[n] == board[p+n][m];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                        //down and right
                        for(int n = 0; m+n < x && p+n < y && !correct && name[n] == board[p+n][m+n];){
                            n++;
                            if(name[n] == '\0'){
                                correct = true;
                                cout << p+1 << " " << m+1 << endl;
                            }
                        }
                    }
                }
            }
        }
        if(i != runs-1)
            cout << endl;
    }
    
    
    return 0;
}