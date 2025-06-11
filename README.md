Projeto de criação de uma API Rest que serviria para um aplicativo de clima. Feito seguindo um projeto de código da DIO

## Diagrama De Classes
```mermaid
classDiagram
    class User {
        +long id
        +String name
        +String email
    }
    
    class Location {
        +String country
        +String state
        +String city
        +String district
    }

    class Weather {
        +String scale
        +String weatherState
        +int temperature
        +int feltTemperature
        +int windSpeed
        +int airPressure
        +int humidity
    }
    
    class TimeData {
        +int currentHour
        +int currentMinute
        +int sunriseHour
        +int sunriseMinute
        +int sunsetHour
        +int sunsetMinute
    }
    
    class Root {
        +User user
        +Weather weather
        +TimeData time
    }

    User --> Location
    Root --> User
    Root --> Weather
    Root --> TimeData
```

```mermaid
classDiagram
    class UsuarioDTO {
        Long id
        String nome
        String email
        String telefone
    }

    class UnidadeDTO {
        Long id
        String endereco
        String cidade
        String estado
        String numero
        String cep
    }

    class FuncionarioDTO {
        Long id
        String nome
        String cargo
        Double salario
        Long unidadeId
    }

    class AparelhoDTO {
        Long id
        String tipo
        int quantidade
    }

    class UnidadeAparelhoDTO {
        Long id
        Long unidadeId
        Long aparelhoId
        Integer quantidade
        LocalDate ultimaManutencao
    }

    %% Relationships (composition style)
    FuncionarioDTO --> UnidadeDTO : unidadeId
    UnidadeAparelhoDTO --> UnidadeDTO : unidadeId
    UnidadeAparelhoDTO --> AparelhoDTO : aparelhoId
```
```mermaid
flowchart TD
  subgraph REST API
    A[POST /usuarios] -->|Request| A1[UsuarioDTO]
    A -->|Response| A2[201 Created]

    B[GET /usuarios/{id}] -->|Response| B1[UsuarioDTO]

    C[POST /unidades] -->|Request| C1[UnidadeDTO]
    C -->|Response| C2[201 Created]

    D[POST /funcionarios] -->|Request| D1[FuncionarioDTO]
    D -->|Response| D2[201 Created]

    E[POST /aparelhos] -->|Request| E1[AparelhoDTO]
    E -->|Response| E2[201 Created]

    F[POST /unidade-aparelhos] -->|Request| F1[UnidadeAparelhoDTO]
    F -->|Response| F2[200 OK]

    G[GET /unidade-aparelhos/unidade/{id}] -->|Response| G1[List<UnidadeAparelhoDTO>]
  end

  classDef entity fill:#f9f,stroke:#333,stroke-width:1px;
  class A1,A2,B1,C1,C2,D1,D2,E1,E2,F1,F2,G1 entity;
```
