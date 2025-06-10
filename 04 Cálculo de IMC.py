print(10*'-','Cálculo IMC',10*'-')

peso = int(input('Digite o seu peso: '))
altura = int(input('Digite a sua altura: '))
imc = peso/(altura*altura)
print(f'Seu IMC é {imc:.4f}')