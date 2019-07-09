<?php

//Caminho a ser específicado pelo arquivo
include_once("C:\\Users\\Cleverton\\Desktop\\Carro.php");

class testePHP{
	public function tes(){
	$carro = new Carro;
	$carro->setnome("BMW");
	$carro->setano(2019);
	echo $carro;
}
}

$t = new testePHP;
$t->tes();
?>