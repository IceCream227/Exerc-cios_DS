vetor = [0]*4
negativo = 0

print(10*'-','NÚMEROS NEGATIVOS',10*'-')
print('')

for i in range(4):
    vetor[i] = int(input(f"Digite o {(i+1)}º número: "))

for i in range(4):
    if vetor[i] < 0:
        negativo += 1

print(f'O vetor {vetor}, possui {negativo} números negativos.')