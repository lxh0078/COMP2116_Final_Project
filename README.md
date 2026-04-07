## 1. Graphical Abstract
```plaintext
┌──────────────────────────────────────────────────────────┐
│                  **User Web Interface**                  │
│  • Frontend: HTML/CSS/JS                                 │
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
This graphical abstract shows the full architecture of the **Campus AI Assistant** for Macao Polytechnic University. The system includes a web user interface, Spring Boot backend, local Ollama AI service, and secure campus information storage. It fully follows standard software development components and workflow.

---

## 2. Purpose of the software
### Type of software
This is a **full-stack web-based campus Q&A AI assistant** for Macao Polytechnic University.

### Development process applied
We used the **Waterfall** software development process.

### Reason for choosing Waterfall
The requirements are clear, stable, and well-defined. The project scope is fixed, and team collaboration can be planned in advance. Waterfall supports structured design, implementation, and documentation, which fully meets the course requirements.

### Target users / Possible usage
Target users include **students, teachers, and administrative staff** of Macao Polytechnic University. The system provides quick English Q&A for campus information such as facilities, opening hours, academic support, and student services.

---

## 3. Software development plan
### 3.1 Development Process
We followed the **Waterfall** model:
1. Requirement analysis
2. System architecture design
3. Implementation (frontend + backend + AI integration)
4. Unit and integration testing
5. System debugging and optimization
6. Documentation and demo preparation

### 3.2 Members (Roles & Responsibilities & Portion)
| Member          | Role                      | Responsibilities                                                        | Portion|
|-----------------|---------------------------|-------------------------------------------------------------------------|--------|
| **Xv Yu Xuan**  | Backend Developer         | Spring Boot structure, API controller, service logic, file operation    | 33.3%  |
| **Li Xing Han** | Frontend Developer        | Web UI design, user interaction, input validation, page styling         | 33.3%  |
| **Zhang Wei**   | AI & Integration Engineer | Ollama configuration, prompt engineering, testing, documentation        | 33.3%  |

### 3.3 Schedule
- Week 1: Requirement analysis & architecture design
- Week 2: Frontend and backend development
- Week 3: Ollama AI integration & function testing
- Week 4: Debugging, optimization, README, and demo video

### 3.4 Algorithm
The system uses a **retrieval-augmented generation (RAG) mechanism**:
1. Read campus data from `campus_info.txt`
2. Build structured prompt instructions
3. Call local Ollama model to generate answers
4. Return concise English responses to the user

### 3.5 Current status of your software
- Fully functional local web application
- English-only Q&A available
- Ollama AI model runs stably
- Campus information can be updated by administrators
- All core modules work without errors

### 3.6 Future plan
- Add user authentication
- Support more campus data categories
- Enable caching for frequent questions
- Optimize response speed
- Support mobile-friendly interface

---

## 4. Demo (YouTube URL)
Will be added here:
`https://youtu.be/xxx`

---

## 5. Development & Running Environments
- **Programming language**: Java, HTML, CSS, JavaScript
- **Framework**: Spring Boot
- **AI service**: Ollama
- **Minimum hardware**: 8GB RAM, basic CPU
- **Required packages**: Spring Boot Starter Web, Spring AI, Ollama

---

## 6. Declaration
This project uses the following open-source resources:
- Spring Boot (https://spring.io/projects/spring-boot)
- Spring AI (https://spring.io/projects/spring-ai)
- Ollama (https://ollama.com)
- Qwen2 model (provided by Ollama)

All third-party libraries are properly declared and used in compliance with their open licenses.

---

要不要我帮你把**所有内容压缩成一段可直接全选复制**的纯净版本？
