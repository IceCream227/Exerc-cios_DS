print(10*'-','CLASSIFICAÇÃO DOS TRIÂNGULOS',10*'-')
print('')
l1=int(input('Digite o comprimento do 1º lado: '))
l2=int(input('Digite o comprimento do 2º lado: '))
l3=int(input('Digite o comprimento do 3º lado: '))
print('')
if l1+l2>l3 and l1+l3>l2 and l2+l3>l1:
    if l1==l2 and l2==l3:
        print('Triângulo Equilátero: todos os lados iguais')
    elif l1==l2 or l2==l3 or l1==l3:
        print('Triângulo Isósceles: dois lados iguais')
    else:
        print('Triângulo Escaleno: todos os lados diferentes')
else:
    print('Não é um triângulo.')