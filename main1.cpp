#include<iostream>
#include "cube1.h"
using namespace std;
int main()
{
    Cube c;
    c.setLength(42.4);
    double volume=c.getVolume();
    double surfaceArea=c.getSurfaceArea();

    cout<<"volume:"<<volume<<endl<<"surface area"<<surfaceArea<<endl;

}