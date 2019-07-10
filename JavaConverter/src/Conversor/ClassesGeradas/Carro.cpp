#include <iostream>  
using namespace std;

class Carro{ 

public: 
      string nome; 
      int ano; 
      string modelo; 
      string marca; 
      string combustivel; 
      double valor; 

public: 
      string getnome() 
      {
             return nome;
      } 

      int getano() 
      {
             return ano;
      } 

      string getmodelo() 
      {
             return modelo;
      } 

      string getmarca() 
      {
             return marca;
      } 

      string getcombustivel() 
      {
             return combustivel;
      } 

      double getvalor() 
      {
             return valor;
      } 

      void setnome(String nome) 
      {
             this->nome = nome;
      } 

      void setano(int ano) 
      {
             this->ano = ano;
      } 

      void setmodelo(String modelo) 
      {
             this->modelo = modelo;
      } 

      void setmarca(String marca) 
      {
             this->marca = marca;
      } 

      void setcombustivel(String combustivel) 
      {
             this->combustivel = combustivel;
      } 

      void setvalor(double valor) 
      {
             this->valor = valor;
      } 



string Carro ::toString() {
      std::string texto = "Carro{"+"nome:" + std::to_string( this->getnome())
      +"nome:" + std::to_string( this->getnome())
      +"ano:" + std::to_string( this->getano())
      +"modelo:" + std::to_string( this->getmodelo())
      +"marca:" + std::to_string( this->getmarca())
      +"combustivel:" + std::to_string( this->getcombustivel())
      +"valor:" + std::to_string( this->getvalor())+"}"
}

