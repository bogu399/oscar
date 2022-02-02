# importing the requests library
import requests
import json

# defining the api-endpoint
API_ENDPOINT = "http://localhost:3000/oscar"

# data to be sent to api (POST)
data = [
    {
        
        "tamanho": 35,
        "categoria": "adulto",
        "cor": "preto",
        "preco": 35.5,
        "marca": "adidas",
        "dataCadastro": "2021-01-02T00:00:00.000+00:00",
        "quantEstoque": 40,
        "descricao": "lorem ipsum 2"
    },
    {
        
        "tamanho": 29,
        "categoria": "infantil",
        "cor": "cinza",
        "preco": 25.5,
        "marca": "adidas",
        "dataCadastro": "2021-01-02T00:00:00.000+00:00",
        "quantEstoque": 40,
        "descricao": "lorem ipsum"
    },
    {
        
        "tamanho": 24,
        "categoria": "infantil",
        "cor": "branco",
        "preco": 75.5,
        "marca": "adidas",
        "dataCadastro": "2021-01-02T00:00:00.000+00:00",
        "quantEstoque": 20,
        "descricao": "lorem ipsum"
    },
    {
        
        "tamanho": 29,
        "categoria": "infantil",
        "cor": "branco",
        "preco": 105.5,
        "marca": "lacoste",
        "dataCadastro": "2021-01-02T00:00:00.000+00:00",
        "quantEstoque": 40,
        "descricao": "lorem ipsum"
    },
    {
        
        "tamanho": 42,
        "categoria": "adulto",
        "cor": "cinza",
        "preco": 24.5,
        "marca": "olympicus",
        "dataCadastro": "2021-01-02T00:00:00.000+00:00",
        "quantEstoque": 30,
        "descricao": "lorem ipsum"
    }
]


#Salvar dados no banco e recuperando esses dados
for i in data:
    # sending post request and saving response as response object
    r = requests.post(url = API_ENDPOINT, json = i)    
    # extracting response text
    pastebin_url = r.text
    print("The pastebin URL is: %s"%pastebin_url)

# extracting data in json format (dict)
r = requests.get(url = API_ENDPOINT)
data = r.json()
print(data)

#buscar dados por ID (GET)
''' def buscar_dados_id(id):
    try:
        request = requests.get(f"http://localhost:3000/oscar/search?id={id}")
        todo = json.loads(request.content)
        return todo
    except:
        return None
print(buscar_dados_id(1)) '''


# Update an existing resource (PUT)
''' def atualizar(dados:dict):
    r = requests.put(url = "http://localhost:3000/oscar?id=1&tamanho=45", json = dados)
    return r.text

def atualizarOscar(id:int, value:int):
    r = requests.put(url = f"http://localhost:3000/oscar/update?id={id}&componente=dataCadastro&value={value}")
    return r.text

up = {
    'id':1,
    'numeroMaximoAlunos':20,
    'numeroAlunosMatriculados':15,
    'dataInicioCurso':'2000-01-01',
    'dataEncerramentoCurso':'1999-01-01',
	'resumo':'source_code...'
    }

print(atualizarOscar(1,"1999-01-01")) '''

#delete a resource (DELETE)
''' def delete(id):
    r = requests.delete(f"http://localhost:3000/oscar/delete?id={id}")
    return r.text

print(delete(2)) '''
