#include <iostream.h>  

class Carro{ 

private: 
      String nome; 
      int ano; 
      String modelo; 
      String marca; 
      String combustivel; 
      double valor; 

public: 
      String getnome() 
      {
             return nome;
      } 

      int getano() 
      {
             return ano;
      } 

      String getmodelo() 
      {
             return modelo;
      } 

      String getmarca() 
      {
             return marca;
      } 

      String getcombustivel() 
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
