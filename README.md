# Campus AI Assistant
## Macao Polytechnic University – COMP2116 Software Engineering Final Project

---

## 1. Graphical Abstract
```plaintext
┌──────────────────────────────────────────────────────────┐
│                  **User Web Interface**                  │
│  • Frontend: HTML/CSS/JavaScript                         │
│  • Function: English-only Q&A input & response display   │
│  • Access URL: http://localhost:8080                     │
└───────────────────────────┬──────────────────────────────┘
                            │
                            ▼
┌──────────────────────────────────────────────────────────┐
│                  **Spring Boot Backend**                 │
│  • AiController: Handle /api/ai/ask API requests         │
│  • AiService: Coordinate AI calls & file operations      │
└───────────────────────────┬──────────────────────────────┘
                            │
              ┌─────────────┴─────────────┐
              │                           │
              ▼                           ▼
┌───────────────────────────────┐  ┌────────────────────────────────────┐
│    **Local AI (Ollama)**      │  │  **Campus Information Repository** │
│  • Model execution            │  │  • Storage: campus_info.txt        │
│  • English response           │  │  • Admin-only maintenance          │
└───────────────────────────────┘  └────────────────────────────────────┘
```

This graphical abstract illustrates the complete system architecture of the **Campus AI Assistant** developed for Macao Polytechnic University. The system consists of four core components: a user-friendly web interface, a Spring Boot backend server, a locally deployed Ollama AI service, and a secure campus information repository. The architecture follows standard software engineering practices and clearly shows how users, backend logic, AI model, and data interact throughout the entire workflow.

---

## 2. Purpose of the software

### Type of software
This project is a **full-stack, web-based intelligent question-and-answer system** designed specifically for the campus environment of Macao Polytechnic University. It integrates frontend interaction, backend service, local artificial intelligence, and text-based data management to form a complete, operable software system.

### Development process applied
The **Waterfall software development process** is applied in this project.

### Reason for choosing Waterfall
We chose Waterfall because the project requirements are **clear, fixed, and stable** from the beginning. The system scope, functions, and user goals are well-defined in advance, which matches the characteristics of the Waterfall model: sequential stages, structured documentation, clear phase outputs, and easy management. This process ensures that we complete requirement analysis, design, coding, testing, and deployment step by step, fully complying with the software engineering standards required by the course.

### Target users & Possible usage
The target users are **students, teachers, and administrative staff** of Macao Polytechnic University.
The system can answer English queries related to campus life, including:
- Campus location and facilities
- Library and venue opening hours
- Academic support and student services
- Campus regulations and basic information

It provides a fast, accurate, and convenient way for users to obtain official campus information at any time.

---

## 3. Software development plan

### 3.1 Development Process
The project strictly implements the **Waterfall development model**:
1. **Requirement analysis**: Clarify user needs, system functions, and constraints.
2. **System design**: Design architecture, modules, interfaces, and data storage.
3. **Implementation**: Develop frontend pages, Spring Boot backend, and AI integration.
4. **Testing**: Verify function availability, response correctness, and system stability.
5. **Debugging & optimization**: Fix bugs, optimize response speed, and enhance interface experience.
6. **Documentation & demo**: Complete README and prepare demonstration video.

### 3.2 Members (Roles & Responsibilities & Portion)
| Member | Role | Responsibilities | Portion |
|--------|------|------------------|---------|
| **Xv Yu Xuan** | Backend Developer | Build Spring Boot project structure; implement AiController and AiService; manage file reading and writing; connect API and AI service | 33.3% |
| **Li Xing Han** | Frontend Developer | Design and implement web UI; develop user input area and chat display; add English input restriction; ensure page layout and interaction experience | 33.3% |
| **Leong Chi Cheng** | AI & Integration Engineer | Configure and run Ollama locally; design strict English-only prompts; conduct system testing; write README documentation and arrange project schedule | 33.3% |

All members cooperate closely to ensure the project progresses in an orderly manner and meets all requirements.

### 3.3 Schedule
- **Week 1**: Requirement analysis and system architecture design
- **Week 2**: Frontend page development and backend framework construction
- **Week 3**: Ollama AI integration and functional module development
- **Week 4**: System testing, bug fixing, README writing, and demo video production

### 3.4 Algorithm
The system uses **Retrieval-Augmented Generation (RAG)** as its core algorithm:
1. Read campus information data from the local file `campus_info.txt`.
2. Construct a structured, strict English-only system prompt to ensure answer quality.
3. Send the user’s question and campus knowledge to the local Ollama model.
4. The model generates accurate, concise, and standard English answers.
5. Return the result to the frontend for display.

This method ensures that the AI answers based on real campus data without hallucination.

### 3.5 Current status of your software
The system has been fully developed and can run stably in a local environment:
- Users can access the web interface at `localhost:8080`.
- English-only question input is supported.
- The Ollama AI model runs locally and responds quickly.
- Backend API and file operations work normally.
- All core functions are complete and error-free.
- The system has reached the **demo/pilot level** required by the course.

### 3.6 Future plan
- Add user login and identity authentication.
- Expand more campus information categories and data volume.
- Add cache mechanism to improve response speed for common questions.
- Optimize the UI to support mobile devices.
- Support more languages while keeping English as the main interface.

---

## 4. Demo (YouTube URL)
https://youtu.be/hHWYx7PyvaU
---

## 5. Development & Running Environments
- **Programming languages**: Java, HTML, CSS, JavaScript
- **Backend framework**: Spring Boot
- **AI engine**: Ollama (local deployment)
- **Frontend**: Native HTML/CSS/JS
- **Data file**: campus_info.txt
- **Minimum hardware**: 8GB RAM, basic CPU
- **Required dependencies**: Spring Boot Starter Web, Spring AI, Ollama

---

## 6. Declaration
This project uses the following open-source resources:
- Spring Boot: https://spring.io/projects/spring-boot
- Spring AI: https://spring.io/projects/spring-ai
- Ollama: https://ollama.com
- Qwen2 model (provided by Ollama)

All third-party libraries and models are used legally in accordance with their open-source licenses.

---

## 7. Full Environment, Extensions, & Dependencies 

## 7.1 Required Environment
- Java JDK 17 or higher
- VS Code
- Ollama 0.1.30+
- Chrome / Edge browser

## 7.2 VS Code Extensions 
- Extension Pack for Java
- Spring Boot Extension Pack
- Language Support for Java(TM) by RedHat
- Debugger for Java

## 7.3 Maven Dependencies (pom.xml)
- Spring Boot Starter Web
- Spring AI
- Spring AI Ollama
- Maven plugins

---

## 8. Full Installation Steps 
- Install JDK 17+
- Install VS Code & Java extensions
- Install Ollama
- Run: ollama run qwen2:0.5b
- Open project in VS Code
- Run CampusAiQaApplication.java
- Open http://localhost:8080

---

