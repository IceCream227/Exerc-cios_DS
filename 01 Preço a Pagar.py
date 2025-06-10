def menu():
    print(f'''1 - CAFÉ PRETO - R$3,00
2 - CAFÉ COM LEITE - R$4,00
3 - CAPPUCCINO - R$5,00
{20*'-'}
4 - FINALIZAR COMPRA
5 - CANCELAR PEDIDO''')

def add_iten(pedido, quantidade, itens):
    itens.append((pedido, quantidade))

def show(itens):
    total = 0
    print('PEDIDO')
    for item, quantidade in itens:
        print(f'{item} R${preco[item]:.2f}: {quantidade}x')
        total += quantidade*preco[item]
    print(f'TOTAL A PAGAR: R${total:.2f}')
    return total

preco = {
    'CAFÉ PRETO': 3.00,
    'CAFÉ COM LEITE': 4.00,
    'CAPPUCCINO': 5.00
}

itens_pedido = []

while True:
    print(10*'-', 'MENU', 10*'-')
    menu()
    print('')
    opcao = input('ESCOLHA UMA OPÇÃO: ')
    if opcao == '1':
        quantidade = int(input('QUANTIDADE: '))
        add_iten('CAFÉ PRETO', quantidade, itens_pedido)
    elif opcao == '2':
        quantidade = int(input('QUANTIDADE: '))
        add_iten('CAFÉ COM LEITE', quantidade, itens_pedido)
    elif opcao == '3':
        quantidade = int(input('QUANTIDADE: '))
        add_iten('CAPPUCCINO', quantidade, itens_pedido)
    elif opcao == '4':
        total = show(itens_pedido)
        break
    elif opcao == '5':
        print('CANCELAR PEDIDO')
        break
    else:
        print('OPÇÃO INVÁLIDA')