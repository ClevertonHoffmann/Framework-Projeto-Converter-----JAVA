var Carro = (function (){
      function Carro(){
           if(this.nome === undefined)
                this.nome = null; 
           if(this.ano === undefined)
                this.ano = null; 
           if(this.modelo === undefined)
                this.modelo = null; 
           if(this.marca === undefined)
                this.marca = null; 
           if(this.combustivel === undefined)
                this.combustivel = null; 
           if(this.valor === undefined)
                this.valor = null; 
      }

      Carro.prototype.getnome = function() {
          return this.nome;
      };
      Carro.prototype.setnome(nome)= function(nome) {
          this.nome = nome;
      }; 
      Carro.prototype.getano= function() {
          return this.ano;
      };
      Carro.prototype.setano(ano)= function(ano) {
          this.ano = ano;
      }; 
      Carro.prototype.getmodelo= function() {
          return this.modelo;
      };
      Carro.prototype.setmodelo(modelo)= function(modelo) {
          this.modelo = modelo;
      }; 
      Carro.prototype.getmarca= function() {
          return this.marca;
      };
      Carro.prototype.setmarca(marca)= function(marca) {
          this.marca = marca;
      }; 
      Carro.prototype.getcombustivel= function() {
          return this.combustivel;
      };
      Carro.prototype.setcombustivel(combustivel)= function(combustivel) {
          this.combustivel = combustivel;
      }; 
      Carro.prototype.getvalor= function() {
          return this.valor;
      };
      Carro.prototype.setvalor(valor)= function(valor) {
          this.valor = valor;
      }; 


Carro.prototype.toString = function() {
return "Carro: {"+"nome= "+this.nome+",ano= "+this.ano+",modelo= "+this.modelo+",marca= "+this.marca+",combustivel= "+this.combustivel+",valor= "+this.valor+"}";
};
return Carro;
});

Carro["__class"] = "Carro";