print(10*'-','Desconto',10*'-')
preco = float(input('Digite o preço do produto: R$'))
desconto = float(input('Digite o desconto: '))

preco_final= preco - (preco * desconto / 100)
print('O valor do produto com desconto de {}% é de R${:.2f}'.format(desconto, preco_final))
