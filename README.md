# Microsserviço Spring Boot com Orquestração no Azure AKS

## Objetivo

O objetivo deste projeto prático é criar um microsserviço utilizando o framework Spring Boot e explorar o uso do Azure AKS (Azure Kubernetes Service) para a orquestração do microsserviço na Azure. O projeto será implantado utilizando o Azure DevOps como serviço para facilitar a implantação da solução.

## Requisitos Técnicos

- Conhecimento em programação Java e no framework Spring Boot.
- Conhecimento básico em microsserviços e arquitetura de microsserviços.
- Acesso à conta da Azure com permissões para criação de recursos no AKS e no Azure DevOps.
- Ambiente de desenvolvimento configurado com o Spring Boot e as ferramentas necessárias para a criação e execução de um microsserviço.
- Conta no Azure DevOps para a criação de pipelines de implantação.
- Conhecimento em Docker e Kubernetes para a compreensão dos conceitos relacionados ao AKS.

## Descrição do Projeto

Neste projeto prático, será criado um microsserviço utilizando o framework Spring Boot. O microsserviço será orquestrado pelo Kubernetes utilizando o serviço Azure AKS na plataforma Azure. O projeto será dividido nas seguintes etapas:

1. **Criação do Microsserviço em Spring Boot**
   - Configuração do ambiente de desenvolvimento.
   - Criação de um projeto Spring Boot básico.
   - Implementação das funcionalidades do microsserviço.
   - Testes locais do microsserviço.

2. **Configuração do Ambiente na Azure**
   - Criação de um cluster AKS no Azure.
   - Configuração do Azure DevOps para a implantação do microsserviço.
   - Criação de pipelines de implantação para automatizar o processo de implantação no AKS.

3. **Desenvolvimento e Orquestração**
   - Containerização do microsserviço usando Docker.
   - Criação de manifests do Kubernetes (Deployment, Service, etc.).
   - Deploy do microsserviço no cluster AKS.
   - Testes e validação da implantação.

4. **Exploração de Conceitos de Arquitetura de Microsserviços**
   - Escalabilidade: Configuração de auto-scaling no AKS.
   - Resiliência: Implementação de estratégias de recuperação de falhas.
   - Monitoramento: Configuração de ferramentas de monitoramento e logging no AKS.

## Estrutura do Projeto

```
microsservico-springboot-aks/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── exemplo/
│ │ │ └── microsservico/
│ │ │ ├── MicrosservicoApplication.java
│ │ │ ├── controller/
│ │ │ └── service/
│ │ └── resources/
│ │ ├── application.properties
│ └── test/
│ └── java/
│ └── com/
│ └── exemplo/
│ └── microsservico/
│ └── MicrosservicoApplicationTests.java
│
├── Dockerfile
├── kubernetes/
│ ├── deployment.yaml
│ ├── service.yaml
│ └── ingress.yaml
│
├── azure-pipelines.yml
├── README.md
└── pom.xml 
```


## Passos para Configuração e Implantação

### 1. Configuração do Ambiente de Desenvolvimento

1. Instalar o Java Development Kit (JDK) 11 ou superior.
2. Instalar o Apache Maven.
3. Configurar um IDE como IntelliJ IDEA ou Eclipse.
4. Clonar o repositório do projeto.

```
git clone https://github.com/seu-usuario/microsservico-springboot-aks.git
cd microsservico-springboot-aks
```

### 2. Criação do Microsserviço em Spring Boot
#### 2.1. Navegar até o diretório do projeto e criar o projeto Spring Boot.
```
mvn spring-boot:run
```

#### 2.2. Acessar o microsserviço em http://localhost:8080.

### 3. Containerização com Docker
#### 3.1. Construir a imagem Docker.
```
docker build -t seu-usuario/microsservico:1.0 .
```
#### 3.2. Testar a imagem localmente.
```
docker run -p 8080:8080 seu-usuario/microsservico:1.0
```
### 4. Configuração do AKS e Azure DevOps

1. Criar um cluster AKS na Azure via Portal Azure ou CLI.
2. Configurar o Azure DevOps e criar um projeto.
3. Criar pipelines de CI/CD no Azure DevOps utilizando o arquivo
4. azure-pipelines.yml.

### 5. Deploy no AKS
#### 5.1. Aplicar os manifests do Kubernetes no AKS.

```
kubectl apply -f kubernetes/deployment.yaml
kubectl apply -f kubernetes/service.yaml
```
#### 5.2. Verificar a implantação.
```
kubectl get pods
kubectl get services
```
## Conclusão
Ao final deste projeto, você terá desenvolvido um microsserviço usando Spring Boot e orquestrado sua implantação no Azure AKS com pipelines automatizados no Azure DevOps. Você terá explorado conceitos chave de escalabilidade, resiliência e monitoramento, adquirindo habilidades práticas para o desenvolvimento e orquestração de microsserviços em ambientes de produção.


