# GEMINI.md

## Project Overview
This project is a lightweight, pure JavaScript Todo List application. It provides a clean and intuitive interface for managing daily tasks with persistence and filtering capabilities.

- **Main Technologies:** HTML5, CSS3, Vanilla JavaScript (ES6+).
- **Architecture:** Follows a simple State-Driven DOM manipulation pattern. The state (`todos` array) is the source of truth, and the UI is updated synchronously via a `renderTodos` function.
- **Persistence:** Uses browser `localStorage` to save and retrieve tasks across sessions.

## Building and Running
Since this is a client-side only application with no external dependencies or build step, it can be run directly in any modern web browser.

- **Run:** Open `index.html` in your browser.
- **Development:** Any change to `.js` or `.css` files will be reflected upon a browser refresh.
- **Testing:** Currently, testing is performed manually. 
    - *TODO: Implement unit tests for state management functions in `script.js` using a framework like Jest if the project scales.*

## Development Conventions
- **State Management:** Always update the `todos` array and call `saveTodos()` and `renderTodos()` to keep the UI and storage in sync.
- **Security:** Use the `escapeHtml` utility function when rendering user-provided text to prevent XSS (Cross-Site Scripting) attacks.
- **Naming Conventions:** 
    - DOM elements are prefixed with `todo` or descriptive names (e.g., `todoForm`, `filterBtns`).
    - Logic functions use camelCase and start with a verb (e.g., `addTodo`, `toggleTodo`).
- **Styling:** CSS variables are defined in `:root` for consistent coloring and theming. Use Flexbox for layout management.
- **Formatting:** Keep `script.js` modular by separating DOM selection, Event Listeners, and Logic Functions.
