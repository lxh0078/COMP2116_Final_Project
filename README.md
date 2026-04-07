# COMP2116_Final_Project
## Graphical Abstract

```plaintext
┌──────────────────────────────────┐
│        User Web Interface        │
│  • Input English questions       │
│  • View AI responses             │
│  • URL: http://localhost:8080    │
└───────────────┬──────────────────┘
                │
                ▼
┌──────────────────────────────────┐
│        Spring Boot Backend       │
│  • Controller: API handling      │
│  • Service: AI & file I/O        │
└───────────────┬──────────────────┘
                │
        ┌───────┴────────┐
        │                │
        ▼                ▼
┌──────────────┐  ┌──────────────────────┐
│  Local AI    │  │  Campus Info         │
│ Ollama+Qwen2 │  │  campus_info.txt     │
│  Generation  │  │  Admin-only          │
└──────────────┘  └──────────────────────┘
