<?php 

class Carro{ 

function _construct() {

}
  private $nome; 
  private $ano; 
  private $modelo; 
  private $marca; 
  private $combustivel; 
  private $valor; 

public function getnome() 
{
  return $this->nome;
} 

public function getano() 
{
  return $this->ano;
} 

public function getmodelo() 
{
  return $this->modelo;
} 

public function getmarca() 
{
  return $this->marca;
} 

public function getcombustivel() 
{
  return $this->combustivel;
} 

public function getvalor() 
{
  return $this->valor;
} 

public function setnome($nome) 
{
  $this->nome = $nome;
} 

public function setano($ano) 
{
  $this->ano = $ano;
} 

public function setmodelo($modelo) 
{
  $this->modelo = $modelo;
} 

public function setmarca($marca) 
{
  $this->marca = $marca;
} 

public function setcombustivel($combustivel) 
{
  $this->combustivel = $combustivel;
} 

public function setvalor($valor) 
{
  $this->valor = $valor;
} 


function toString() {
return "Carro: {"."nome: ".$this->getnome()."ano: ".$this->getano()."modelo: ".$this->getmodelo()."marca: ".$this->getmarca()."combustivel: ".$this->getcombustivel()."valor: ".$this->getvalor()."}";
}
}
?>