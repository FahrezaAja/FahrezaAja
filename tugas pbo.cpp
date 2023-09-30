//Fahreza mandala putra
//2200018246


#include <iostream>
using namespace std;

//main program
int main(){
	
    // Variabel
    int angka=10;
    float nilai=3.14;
    char huruf='A';
    bool benar=true;

    // Array satu dimensi
    int satuDimensi[5]={3, 1, 7, 5, 9};

    // Array multidimensi
    int multiDimensi[2][3]={{2, 4, 5}, {1, 2, 7}};

    // For loop
    for(int i=0;i<5;i++){
        cout<<"isi dari array 1 dimensi["<<i<<"] adalah "<<satuDimensi[i]<<endl;
    }

    // If statement
    if(nilai>2.0){
        cout<<"Nilai lebih besar dari 2.0"<<endl;
    }else{
        cout<<"Nilai lebih kecil dari 2.0"<<endl;
    }

    // While loop
    int j=0;
    while(j<5){
        cout<<"Iterasi ke-"<<j<<endl;
        j++;
    }

    // Do-While loop
    int k=0;
    do{
        cout << "Iterasi ke-"<<k<<endl;
        k++;
    }while(k<5);

    // Loop untuk mencetak elemen array multidimensi
    for(int m=0;m<2;m++){
        for(int n=0;n<3;n++){
            cout<<"isi array multiDimensi["<<m<<"]["<<n<<"] = "<<multiDimensi[m][n]<<endl;
        }
    }

    // Input
    int inputAngka;
    cout<<"Masukkan sebuah angka: ";
    cin>>inputAngka;
    cout<<"Anda memasukkan angka: "<<inputAngka<<endl;

    // Output
    cout<<"Hello, World!"<<endl;

 

    return 0;
}

