print(10*'-','VERIFICAÇÃO DE NÚMEROS NEGATIVOS',10*'-')
print('')
n1 = int(input('Digite um número: '))
if n1 < 0:
    print('O número é negativo.')
elif n1 == 0:
    print('O número é zero.')
else:
    print('O número é positivo.')