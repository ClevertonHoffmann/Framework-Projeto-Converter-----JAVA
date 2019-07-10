class Carro: 

       def __init__(self,nome,ano,modelo,marca,combustivel,valor):
              self.nome = nome
              self.ano = ano
              self.modelo = modelo
              self.marca = marca
              self.combustivel = combustivel
              self.valor = valor

       def setnome(self, nome):
              self.nome = nome

       def setano(self, ano):
              self.ano = ano

       def setmodelo(self, modelo):
              self.modelo = modelo

       def setmarca(self, marca):
              self.marca = marca

       def setcombustivel(self, combustivel):
              self.combustivel = combustivel

       def setvalor(self, valor):
              self.valor = valor

       def getnome(self):
              return self.nome

       def getano(self):
              return self.ano

       def getmodelo(self):
              return self.modelo

       def getmarca(self):
              return self.marca

       def getcombustivel(self):
              return self.combustivel

       def getvalor(self):
              return self.valor

       def __repr__(self):
              return "Carro{"+"nome:"+str(self.nome)+";ano:"+str(self.ano)+";modelo:"+str(self.modelo)+";marca:"+str(self.marca)+";combustivel:"+str(self.combustivel)+";valor:"+str(self.valor)+"}"