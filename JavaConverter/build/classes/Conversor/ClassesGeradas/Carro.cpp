#include <iostream> 
#include <string>  // Necessário para usar strings
using namespace std;

class Carro{ 

private: 
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

      void setnome(string _nome) 
      {
             nome = _nome;
      } 

      void setano(int _ano) 
      {
             ano = _ano;
      } 

      void setmodelo(string _modelo) 
      {
             modelo = _modelo;
      } 

      void setmarca(string _marca) 
      {
             marca = _marca;
      } 

      void setcombustivel(string _combustivel) 
      {
             combustivel = _combustivel;
      } 

      void setvalor(double _valor) 
      {
             valor = _valor;
      } 



      string  toString() {
             return "Carro{nome:" +(nome)
             +";ano:" +to_string(ano)
             +";modelo:" +(modelo)
             +";marca:" +(marca)
             +";combustivel:" +(combustivel)
             +";valor:" +to_string(valor)+"}";}
};
