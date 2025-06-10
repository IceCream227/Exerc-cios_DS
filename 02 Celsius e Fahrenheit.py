def menu():
    print('''1 - Converter para Celsius
2 - Converter para Fahrenheit''')

def celsius(f):
    return (5/9)*(f-32)

def fahrenheit(c):
    return (9/5)*c+32

while True:
    menu()
    op = int(input('Digite a opção desejada: '))
    if op == 1:
        f = float(input('Digite a temperatura em Fahrenheit: '))
        print(f'A temperatura em Celsius é {celsius(f):.2f}°')
        break
    elif op == 2:
        c = float(input('Digite a temperatura em Celsius: '))
        print(f'A temperatura em Fahrenheit é {fahrenheit(c):.2f}°')
        break
    else:
        print('Opção inválida!')
