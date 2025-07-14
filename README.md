
# 👥 Gestione Persone - Back-end Spring Boot

Un'applicazione Java Spring Boot per la gestione di utenti, credenziali e persone.  
Supporta login, visualizzazione, inserimento e modifica dati tramite interfaccia web.

---

## 🚀 Tecnologie utilizzate

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL Database
- Maven

---

## 📁 Struttura del progetto

```
PersoneSpringBoot/
├── src/
│   ├── controller/      # Controller REST (Login, Persone, Modifica)
│   ├── model/           # Entity + DTO
│   ├── repository/      # JPA Repository
│   ├── service/         # Servizi applicativi
│   └── DemoApplication  # Entry point
├── pom.xml              # Dipendenze Maven
└── application.properties
```

---

## ⚙️ Come eseguire il progetto

### 1. Requisiti

- JDK 17
- Maven 3.x

---

### 2. Avvio dell'applicazione

Apri il terminale nella cartella del progetto e digita:

```bash
./mvnw spring-boot:run
```

> Oppure apri `DemoApplication.java` da un IDE come IntelliJ o Eclipse e avvialo come applicazione Spring Boot.

---

### 3. Accesso all'applicazione

Una volta avviata, l’app sarà disponibile all’indirizzo:

```
http://localhost:8080
```


## 🔐 Login predefinito

|       Username      |  Password  |
|---------------------|------------|
| Alessandro_Federico | password_1 |

Le credenziali sono archiviate nella tabella `CREDENZIALI`.

---

## 📦 Funzionalità principali

- Login e autenticazione semplice
- Visualizzazione lista persone
- Modifica dati persona
- Inserimento nuova persona

---

## 📝 Autore

Progetto realizzato da Alessandro Federico.

---

## 📄 Licenza

Questo progetto è open source per scopi educativi. Nessuna licenza applicata.
