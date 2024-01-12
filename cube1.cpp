#include "cube1.h"
void Cube :: setLength(double length){
    length_ = length;
}
double Cube :: getVolume(){
    return length_*length_*length_;
}
double Cube :: getSurfaceArea(){
    return 6*length_*length_;
}