print(10*'-','Juros Simples',10*'-')

valor_principal = float(input('Digite o valor principal: '))
juros = float(input('Digite o valor do juros: '))
tempo = float(input('Digite o tempo em meses: '))

taxa= juros/(valor_principal*tempo)
print('')
print(f'A taxa de juros é de {taxa:.4f}')
print('')

montante=valor_principal+(valor_principal*taxa*tempo)
print(f'O montante será de R$ {montante:.2f}')