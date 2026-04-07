# COMP2116_Final_Project
## Graphical Abstract

```plaintext
┌──────────────────────────────────────────────────────────┐
│                  User Web Interface                      │
│  • Frontend: HTML/CSS/JS                                 │
│  • Function: English-only Q&A input & response display   │
│  • Access URL: http://localhost:8080                     │
└───────────────────────────┬──────────────────────────────┘
                            │
                            ▼
┌──────────────────────────────────────────────────────────┐
│                  Spring Boot Backend                     │
│  • AiController: Handle /api/ai/ask API requests         │
│  • AiService: Coordinate AI calls & file operations      │
│  • Core Logic: Prompt engineering & response processing  │
└───────────────────────────┬──────────────────────────────┘
                            │
              ┌─────────────┴─────────────┐
              │                           │
              ▼                           ▼
┌───────────────────────────┐  ┌──────────────────────────────────┐
│  Local AI Service (Ollama)│  │  Campus Information Repository   │
│  • Model: Qwen2:0.5b      │  │  • Storage: campus_info.txt      │
│  • Function: Generate     │  │  • Maintenance: Admin-only       │
│  • English-only responses │  │  • Content: MPU official campus  │
└───────────────────────────┘  │    data (facilities, services,   │
                               │    academic info, etc.)          │
                               └──────────────────────────────────┘
