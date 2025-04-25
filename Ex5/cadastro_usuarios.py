class User:
    """Classe que representa um usuário"""
    def __init__(self, name, email, age):
        self.name = name
        self.email = email
        self.age = age
    
    def __str__(self):
        return f"Nome: {self.name}, E-mail: {self.email}, Idade: {self.age}"

def display_menu():
    """Exibe o menu de opções"""
    print("\nEscolha uma opção:")
    print("1 - Cadastrar novo usuário")
    print("2 - Listar todos os usuários")
    print("3 - Buscar usuário por nome")
    print("4 - Sair")
    return input("Opção: ")

def register_user(users):
    """Cadastra um novo usuário"""
    print("\nCadastro de Novo Usuário")
    
    try:
        name = input("Nome: ")
        email = input("E-mail: ")
        
        # Validação da idade
        while True:
            age_input = input("Idade: ")
            if age_input.isdigit() and int(age_input) > 0:
                age = int(age_input)
                break
            print("Idade inválida. Deve ser um número positivo. Tente novamente.")
        
        # Cria e adiciona o novo usuário à lista
        new_user = User(name, email, age)
        users.append(new_user)
        
        print("Usuário cadastrado com sucesso!")
    except Exception as e:
        print(f"Erro ao cadastrar usuário: {e}")

def list_users(users):
    """Lista todos os usuários cadastrados"""
    print("\nLista de Usuários Cadastrados")
    
    if not users:
        print("Nenhum usuário cadastrado.")
        return
    
    for user in users:
        print(user)

def search_user(users):
    """Busca um usuário pelo nome"""
    print("\nBusca de Usuário por Nome")
    
    if not users:
        print("Nenhum usuário cadastrado para buscar.")
        return
    
    search_term = input("Digite o nome para buscar: ").lower()
    
    # Busca case-insensitive e parcial
    found_users = [u for u in users if search_term in u.name.lower()]
    
    if not found_users:
        print("Nenhum usuário encontrado com esse nome.")
        return
    
    print(f"Usuários encontrados ({len(found_users)}):")
    for user in found_users:
        print(user)

def main():
    """Função principal do programa"""
    print("Bem-vindo ao Sistema de Cadastro de Usuários!")
    
    # Lista para armazenar os usuários em memória
    users = []
    
    while True:
        option = display_menu()
        
        if option == "1":
            register_user(users)
        elif option == "2":
            list_users(users)
        elif option == "3":
            search_user(users)
        elif option == "4":
            print("Encerrando o programa...")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()